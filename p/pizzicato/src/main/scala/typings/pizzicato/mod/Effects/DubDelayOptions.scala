package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The dub delay effect is similar to a regular Delay effect,
  * however on each feedback loop the output is routed through a
  * biquad filter.
  */
trait DubDelayOptions extends StObject {
  
  /**
    * Frequency value applied to each successive loop. The lower
    * the value, the more different each repetition will be
    * perceived. min: 0, max: 4000, defaults to 700.
    */
  var cutoff: js.UndefOr[Double] = js.undefined
  
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
object DubDelayOptions {
  
  inline def apply(): DubDelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DubDelayOptions]
  }
  
  extension [Self <: DubDelayOptions](x: Self) {
    
    inline def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
    
    inline def setCutoffUndefined: Self = StObject.set(x, "cutoff", js.undefined)
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
