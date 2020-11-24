package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioConferencing extends js.Object {
  
  var conferenceId: js.UndefOr[NullableOption[String]] = js.native
  
  // A URL to the externally-accessible web page that contains dial-in information.
  var dialinUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The toll-free number that connects to the Audio Conference Provider.
  var tollFreeNumber: js.UndefOr[NullableOption[String]] = js.native
  
  // The toll number that connects to the Audio Conference Provider.
  var tollNumber: js.UndefOr[NullableOption[String]] = js.native
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
    def setConferenceId(value: NullableOption[String]): Self = this.set("conferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceId: Self = this.set("conferenceId", js.undefined)
    
    @scala.inline
    def setConferenceIdNull: Self = this.set("conferenceId", null)
    
    @scala.inline
    def setDialinUrl(value: NullableOption[String]): Self = this.set("dialinUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialinUrl: Self = this.set("dialinUrl", js.undefined)
    
    @scala.inline
    def setDialinUrlNull: Self = this.set("dialinUrl", null)
    
    @scala.inline
    def setTollFreeNumber(value: NullableOption[String]): Self = this.set("tollFreeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTollFreeNumber: Self = this.set("tollFreeNumber", js.undefined)
    
    @scala.inline
    def setTollFreeNumberNull: Self = this.set("tollFreeNumber", null)
    
    @scala.inline
    def setTollNumber(value: NullableOption[String]): Self = this.set("tollNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTollNumber: Self = this.set("tollNumber", js.undefined)
    
    @scala.inline
    def setTollNumberNull: Self = this.set("tollNumber", null)
  }
}
