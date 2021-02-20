package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerInlineQueryOptions extends StObject {
  
  var cache_time: js.UndefOr[Double] = js.native
  
  var is_personal: js.UndefOr[Boolean] = js.native
  
  var next_offset: js.UndefOr[String] = js.native
  
  var switch_pm_parameter: js.UndefOr[String] = js.native
  
  var switch_pm_text: js.UndefOr[String] = js.native
}
object AnswerInlineQueryOptions {
  
  @scala.inline
  def apply(): AnswerInlineQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerInlineQueryOptions]
  }
  
  @scala.inline
  implicit class AnswerInlineQueryOptionsMutableBuilder[Self <: AnswerInlineQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache_time(value: Double): Self = StObject.set(x, "cache_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache_timeUndefined: Self = StObject.set(x, "cache_time", js.undefined)
    
    @scala.inline
    def setIs_personal(value: Boolean): Self = StObject.set(x, "is_personal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_personalUndefined: Self = StObject.set(x, "is_personal", js.undefined)
    
    @scala.inline
    def setNext_offset(value: String): Self = StObject.set(x, "next_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_offsetUndefined: Self = StObject.set(x, "next_offset", js.undefined)
    
    @scala.inline
    def setSwitch_pm_parameter(value: String): Self = StObject.set(x, "switch_pm_parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch_pm_parameterUndefined: Self = StObject.set(x, "switch_pm_parameter", js.undefined)
    
    @scala.inline
    def setSwitch_pm_text(value: String): Self = StObject.set(x, "switch_pm_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch_pm_textUndefined: Self = StObject.set(x, "switch_pm_text", js.undefined)
  }
}
