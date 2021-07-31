package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScreenBrightnessSuccessCallbackOption extends StObject {
  
  /** 屏幕亮度值，范围 0 ~ 1，0 最暗，1 最亮 */
  var value: Double
}
object GetScreenBrightnessSuccessCallbackOption {
  
  @scala.inline
  def apply(value: Double): GetScreenBrightnessSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenBrightnessSuccessCallbackOption]
  }
  
  @scala.inline
  implicit class GetScreenBrightnessSuccessCallbackOptionMutableBuilder[Self <: GetScreenBrightnessSuccessCallbackOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
