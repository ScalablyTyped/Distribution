package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioConferencing extends js.Object {
  var conferenceId: js.UndefOr[String] = js.native
  // A URL to the externally-accessible web page that contains dial-in information.
  var dialinUrl: js.UndefOr[String] = js.native
  // The toll-free number that connects to the Audio Conference Provider.
  var tollFreeNumber: js.UndefOr[String] = js.native
  // The toll number that connects to the Audio Conference Provider.
  var tollNumber: js.UndefOr[String] = js.native
}

object AudioConferencing {
  @scala.inline
  def apply(): AudioConferencing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConferencing]
  }
  @scala.inline
  implicit class AudioConferencingOps[Self <: AudioConferencing] (val x: Self) extends AnyVal {
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
    def setDialinUrl(value: String): Self = this.set("dialinUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialinUrl: Self = this.set("dialinUrl", js.undefined)
    @scala.inline
    def setTollFreeNumber(value: String): Self = this.set("tollFreeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTollFreeNumber: Self = this.set("tollFreeNumber", js.undefined)
    @scala.inline
    def setTollNumber(value: String): Self = this.set("tollNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTollNumber: Self = this.set("tollNumber", js.undefined)
  }
  
}

