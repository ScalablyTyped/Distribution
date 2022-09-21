package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The delay effect plays back the sound a certain number of times
  * in defined intervals, giving the impression of an echo.
  */
trait DelayOptions extends StObject {
  
  /**
    * The intensity with which the input will echo back. A larger
    * value will result in more echo repetitions. min: 0, max: 1,
    * defaults to 0.5.
    */
  var feedback: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume balance between the original audio and the effected
    * output (the delayed sound). min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
  
  /** Interval time in seconds. min: 0, max: 1, defaults to 0.3. */
  var time: js.UndefOr[Double] = js.undefined
}
object DelayOptions {
  
  inline def apply(): DelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayOptions]
  }
  
  extension [Self <: DelayOptions](x: Self) {
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
