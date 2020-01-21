package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenMeetingInfo extends MeetingInfo {
  var token: js.UndefOr[String] = js.undefined
}

object TokenMeetingInfo {
  @scala.inline
  def apply(token: String = null): TokenMeetingInfo = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenMeetingInfo]
  }
}

