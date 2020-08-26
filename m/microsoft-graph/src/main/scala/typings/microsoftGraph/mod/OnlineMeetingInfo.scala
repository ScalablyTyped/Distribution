package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlineMeetingInfo extends js.Object {
  // The ID of the conference.
  var conferenceId: js.UndefOr[String] = js.native
  /**
    * The external link that launches the online meeting. This is a URL that clients will launch into a browser and will
    * redirect the user to join the meeting.
    */
  var joinUrl: js.UndefOr[String] = js.native
  // All of the phone numbers associated with this conference.
  var phones: js.UndefOr[js.Array[Phone]] = js.native
  // The pre-formatted quickdial for this call.
  var quickDial: js.UndefOr[String] = js.native
  // The toll free numbers that can be used to join the conference.
  var tollFreeNumbers: js.UndefOr[js.Array[String]] = js.native
  // The toll number that can be used to join the conference.
  var tollNumber: js.UndefOr[String] = js.native
}

object OnlineMeetingInfo {
  @scala.inline
  def apply(): OnlineMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeetingInfo]
  }
  @scala.inline
  implicit class OnlineMeetingInfoOps[Self <: OnlineMeetingInfo] (val x: Self) extends AnyVal {
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
    def setConferenceId(value: String): Self = this.set("conferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConferenceId: Self = this.set("conferenceId", js.undefined)
    @scala.inline
    def setJoinUrl(value: String): Self = this.set("joinUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinUrl: Self = this.set("joinUrl", js.undefined)
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = this.set("phones", js.Array(value :_*))
    @scala.inline
    def setPhones(value: js.Array[Phone]): Self = this.set("phones", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    @scala.inline
    def setQuickDial(value: String): Self = this.set("quickDial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickDial: Self = this.set("quickDial", js.undefined)
    @scala.inline
    def setTollFreeNumbersVarargs(value: String*): Self = this.set("tollFreeNumbers", js.Array(value :_*))
    @scala.inline
    def setTollFreeNumbers(value: js.Array[String]): Self = this.set("tollFreeNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTollFreeNumbers: Self = this.set("tollFreeNumbers", js.undefined)
    @scala.inline
    def setTollNumber(value: String): Self = this.set("tollNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTollNumber: Self = this.set("tollNumber", js.undefined)
  }
  
}

