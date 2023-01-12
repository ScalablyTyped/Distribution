package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerInlineQueryOptions extends StObject {
  
  var cache_time: js.UndefOr[Double] = js.undefined
  
  var is_personal: js.UndefOr[Boolean] = js.undefined
  
  var next_offset: js.UndefOr[String] = js.undefined
  
  var switch_pm_parameter: js.UndefOr[String] = js.undefined
  
  var switch_pm_text: js.UndefOr[String] = js.undefined
}
object AnswerInlineQueryOptions {
  
  inline def apply(): AnswerInlineQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerInlineQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnswerInlineQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setCache_time(value: Double): Self = StObject.set(x, "cache_time", value.asInstanceOf[js.Any])
    
    inline def setCache_timeUndefined: Self = StObject.set(x, "cache_time", js.undefined)
    
    inline def setIs_personal(value: Boolean): Self = StObject.set(x, "is_personal", value.asInstanceOf[js.Any])
    
    inline def setIs_personalUndefined: Self = StObject.set(x, "is_personal", js.undefined)
    
    inline def setNext_offset(value: String): Self = StObject.set(x, "next_offset", value.asInstanceOf[js.Any])
    
    inline def setNext_offsetUndefined: Self = StObject.set(x, "next_offset", js.undefined)
    
    inline def setSwitch_pm_parameter(value: String): Self = StObject.set(x, "switch_pm_parameter", value.asInstanceOf[js.Any])
    
    inline def setSwitch_pm_parameterUndefined: Self = StObject.set(x, "switch_pm_parameter", js.undefined)
    
    inline def setSwitch_pm_text(value: String): Self = StObject.set(x, "switch_pm_text", value.asInstanceOf[js.Any])
    
    inline def setSwitch_pm_textUndefined: Self = StObject.set(x, "switch_pm_text", js.undefined)
  }
}
