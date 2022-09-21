package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The flanger produces a swirling effect by delaying a "copy" of
  * the sound by a small, gradually changing period.
  */
trait FlangerOptions extends StObject {
  
  /**
    * The depth/intensity of the swirling effect. min: 0, max: 1,
    * defaults to 0.1.
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * Changes the volume of the delayed sound. min: 0, max: 1,
    * defaults to 0.1 .
    */
  var feedback: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume balance between the original audio and the effected
    * output. min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
  
  /**
    * The speed at which the flanging occurs. min: 0, max: 1,
    * defaults to 0.2.
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * The small delay time applied to the copied signal. min: 0,
    * max: 1, defaults to 0.45.
    */
  var time: js.UndefOr[Double] = js.undefined
}
object FlangerOptions {
  
  inline def apply(): FlangerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlangerOptions]
  }
  
  extension [Self <: FlangerOptions](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
