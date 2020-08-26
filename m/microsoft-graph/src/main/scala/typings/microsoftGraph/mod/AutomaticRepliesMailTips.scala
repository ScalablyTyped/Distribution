package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomaticRepliesMailTips extends js.Object {
  // The automatic reply message.
  var message: js.UndefOr[String] = js.native
  // The language that the automatic reply message is in.
  var messageLanguage: js.UndefOr[LocaleInfo] = js.native
  // The date and time that automatic replies are set to end.
  var scheduledEndTime: js.UndefOr[DateTimeTimeZone] = js.native
  // The date and time that automatic replies are set to begin.
  var scheduledStartTime: js.UndefOr[DateTimeTimeZone] = js.native
}

object AutomaticRepliesMailTips {
  @scala.inline
  def apply(): AutomaticRepliesMailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesMailTips]
  }
  @scala.inline
  implicit class AutomaticRepliesMailTipsOps[Self <: AutomaticRepliesMailTips] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageLanguage(value: LocaleInfo): Self = this.set("messageLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageLanguage: Self = this.set("messageLanguage", js.undefined)
    @scala.inline
    def setScheduledEndTime(value: DateTimeTimeZone): Self = this.set("scheduledEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledEndTime: Self = this.set("scheduledEndTime", js.undefined)
    @scala.inline
    def setScheduledStartTime(value: DateTimeTimeZone): Self = this.set("scheduledStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledStartTime: Self = this.set("scheduledStartTime", js.undefined)
  }
  
}

