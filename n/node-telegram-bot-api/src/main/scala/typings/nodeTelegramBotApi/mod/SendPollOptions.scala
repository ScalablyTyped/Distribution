package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendPollOptions extends SendBasicOptions {
  
  var allows_multiple_answers: js.UndefOr[Boolean] = js.native
  
  var close_date: js.UndefOr[Double] = js.native
  
  var correct_option_id: js.UndefOr[Double] = js.native
  
  var explanation: js.UndefOr[String] = js.native
  
  var explanation_parse_mode: js.UndefOr[ParseMode] = js.native
  
  var is_anonymous: js.UndefOr[Boolean] = js.native
  
  var is_closed: js.UndefOr[Boolean] = js.native
  
  var open_period: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[PollType] = js.native
}
object SendPollOptions {
  
  @scala.inline
  def apply(): SendPollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPollOptions]
  }
  
  @scala.inline
  implicit class SendPollOptionsOps[Self <: SendPollOptions] (val x: Self) extends AnyVal {
    
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
    def setAllows_multiple_answers(value: Boolean): Self = this.set("allows_multiple_answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllows_multiple_answers: Self = this.set("allows_multiple_answers", js.undefined)
    
    @scala.inline
    def setClose_date(value: Double): Self = this.set("close_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose_date: Self = this.set("close_date", js.undefined)
    
    @scala.inline
    def setCorrect_option_id(value: Double): Self = this.set("correct_option_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrect_option_id: Self = this.set("correct_option_id", js.undefined)
    
    @scala.inline
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
    
    @scala.inline
    def setExplanation_parse_mode(value: ParseMode): Self = this.set("explanation_parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanation_parse_mode: Self = this.set("explanation_parse_mode", js.undefined)
    
    @scala.inline
    def setIs_anonymous(value: Boolean): Self = this.set("is_anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_anonymous: Self = this.set("is_anonymous", js.undefined)
    
    @scala.inline
    def setIs_closed(value: Boolean): Self = this.set("is_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_closed: Self = this.set("is_closed", js.undefined)
    
    @scala.inline
    def setOpen_period(value: Double): Self = this.set("open_period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen_period: Self = this.set("open_period", js.undefined)
    
    @scala.inline
    def setType(value: PollType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
