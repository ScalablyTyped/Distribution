package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The distortion effect adds a basic "override" to the sound. */
trait DistortionOptions extends StObject {
  
  /** Amount of distortion applied. min: 0, max: 1, defaults to 0.5 */
  var gain: js.UndefOr[Double] = js.undefined
}
object DistortionOptions {
  
  inline def apply(): DistortionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistortionOptions]
  }
  
  extension [Self <: DistortionOptions](x: Self) {
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
  }
}
