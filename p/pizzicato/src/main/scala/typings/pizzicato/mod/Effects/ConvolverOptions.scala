package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The convolver effect allows the sound to be heard with a certain
  * ressonance or repercussion. This can be useful to simulate
  * certain environments such as auditoriums, concert halls, or small
  * rooms.
  */
trait ConvolverOptions extends StObject {
  
  /** Path to the impulse file. */
  var impulse: String
  
  /**
    * Volume balance between the original audio and the effected
    * output. min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
}
object ConvolverOptions {
  
  inline def apply(impulse: String): ConvolverOptions = {
    val __obj = js.Dynamic.literal(impulse = impulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvolverOptions]
  }
  
  extension [Self <: ConvolverOptions](x: Self) {
    
    inline def setImpulse(value: String): Self = StObject.set(x, "impulse", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
  }
}
