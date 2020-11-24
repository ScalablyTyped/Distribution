package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerInlineQueryOptions extends js.Object {
  
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
  implicit class AnswerInlineQueryOptionsOps[Self <: AnswerInlineQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache_time(value: Double): Self = this.set("cache_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache_time: Self = this.set("cache_time", js.undefined)
    
    @scala.inline
    def setIs_personal(value: Boolean): Self = this.set("is_personal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_personal: Self = this.set("is_personal", js.undefined)
    
    @scala.inline
    def setNext_offset(value: String): Self = this.set("next_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_offset: Self = this.set("next_offset", js.undefined)
    
    @scala.inline
    def setSwitch_pm_parameter(value: String): Self = this.set("switch_pm_parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch_pm_parameter: Self = this.set("switch_pm_parameter", js.undefined)
    
    @scala.inline
    def setSwitch_pm_text(value: String): Self = this.set("switch_pm_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch_pm_text: Self = this.set("switch_pm_text", js.undefined)
  }
}
