package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnimationArgs extends StObject {
  
  /**
    * Animation delay, in ms, 0 by default.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Animation duration, in ms, 400 by default.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Define animation effect, linear by default, effective
    *  values including linear, ease, ease-in, ease-in-out,
    * ease-out, step-start and step-end .
    */
  var timeFunction: js.UndefOr[String] = js.undefined
  
  /**
    * Set transform-origin, 50% 50% 0 by default.
    */
  var transformOrigin: js.UndefOr[String] = js.undefined
}
object CreateAnimationArgs {
  
  inline def apply(): CreateAnimationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnimationArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAnimationArgs] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimeFunction(value: String): Self = StObject.set(x, "timeFunction", value.asInstanceOf[js.Any])
    
    inline def setTimeFunctionUndefined: Self = StObject.set(x, "timeFunction", js.undefined)
    
    inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
