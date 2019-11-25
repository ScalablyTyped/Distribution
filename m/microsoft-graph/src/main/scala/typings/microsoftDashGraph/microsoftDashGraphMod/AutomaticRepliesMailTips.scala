package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomaticRepliesMailTips extends js.Object {
  // The automatic reply message.
  var message: js.UndefOr[String] = js.undefined
  // The language that the automatic reply message is in.
  var messageLanguage: js.UndefOr[LocaleInfo] = js.undefined
  // The date and time that automatic replies are set to end.
  var scheduledEndTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The date and time that automatic replies are set to begin.
  var scheduledStartTime: js.UndefOr[DateTimeTimeZone] = js.undefined
}

object AutomaticRepliesMailTips {
  @scala.inline
  def apply(
    message: String = null,
    messageLanguage: LocaleInfo = null,
    scheduledEndTime: DateTimeTimeZone = null,
    scheduledStartTime: DateTimeTimeZone = null
  ): AutomaticRepliesMailTips = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageLanguage != null) __obj.updateDynamic("messageLanguage")(messageLanguage.asInstanceOf[js.Any])
    if (scheduledEndTime != null) __obj.updateDynamic("scheduledEndTime")(scheduledEndTime.asInstanceOf[js.Any])
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticRepliesMailTips]
  }
}

