package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The tremolo effect changes the volume of the sound over time. */
trait TremoloOptions extends StObject {
  
  /** The intensity of the volume change. min: 0, max: 1, defaults to 1. */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume balance between the original audio and the effected
    * output. min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
  
  /**
    * The speed at which the volume will change. min: 0, max: 20,
    * defaults to 4.
    */
  var speed: js.UndefOr[Double] = js.undefined
}
object TremoloOptions {
  
  inline def apply(): TremoloOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TremoloOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TremoloOptions] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
