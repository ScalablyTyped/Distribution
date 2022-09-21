package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reverb effect is similar to the convolver effect in that it
  * allows the sound to be heard with a certain ressonance or
  * repercussion. This simulates a particular physical environment in
  * which the sound could be played (e.g., an auditorium, a concert
  * hall, etc).
  */
trait ReverbOptions extends StObject {
  
  /**
    * The rate for the reflections of sound to fade away. min: 0,
    * max: 10, defaults to 0.01.
    */
  var decay: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume balance between the original audio and the effected
    * output. min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
  
  /** Whether or not to reverse the impulse shape. */
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Duration of impulse, in seconds. min: 0.0001, max: 10,
    * defaults to 0.01.
    */
  var time: js.UndefOr[Double] = js.undefined
}
object ReverbOptions {
  
  inline def apply(): ReverbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverbOptions]
  }
  
  extension [Self <: ReverbOptions](x: Self) {
    
    inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
    
    inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
