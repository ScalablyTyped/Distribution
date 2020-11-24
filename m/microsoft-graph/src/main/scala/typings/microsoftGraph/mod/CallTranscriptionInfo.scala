package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallTranscriptionInfo extends js.Object {
  
  // The state modified time in UTC.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Possible values are: notStarted, active, inactive.
  var state: js.UndefOr[CallTranscriptionState] = js.native
}
object CallTranscriptionInfo {
  
  @scala.inline
  def apply(): CallTranscriptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTranscriptionInfo]
  }
  
  @scala.inline
  implicit class CallTranscriptionInfoOps[Self <: CallTranscriptionInfo] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDateTime(value: NullableOption[String]): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = this.set("lastModifiedDateTime", null)
    
    @scala.inline
    def setState(value: CallTranscriptionState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
