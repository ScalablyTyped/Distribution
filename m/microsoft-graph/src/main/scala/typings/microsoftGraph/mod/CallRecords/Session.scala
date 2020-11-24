package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends Entity {
  
  // Endpoint that answered the session.
  var callee: js.UndefOr[NullableOption[Endpoint]] = js.native
  
  // Endpoint that initiated the session.
  var caller: js.UndefOr[NullableOption[Endpoint]] = js.native
  
  /**
    * UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[String] = js.native
  
  // Failure information associated with the session if the session failed.
  var failureInfo: js.UndefOr[NullableOption[FailureInfo]] = js.native
  
  /**
    * List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data,
    * screenSharing, unknownFutureValue.
    */
  var modalities: js.UndefOr[js.Array[Modality]] = js.native
  
  // The list of segments involved in the session. Read-only. Nullable.
  var segments: js.UndefOr[NullableOption[js.Array[Segment]]] = js.native
  
  /**
    * UTC fime when the first user joined the session. The DateTimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.native
}
object Session {
  
  @scala.inline
  def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setCallee(value: NullableOption[Endpoint]): Self = this.set("callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    
    @scala.inline
    def setCalleeNull: Self = this.set("callee", null)
    
    @scala.inline
    def setCaller(value: NullableOption[Endpoint]): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    
    @scala.inline
    def setCallerNull: Self = this.set("caller", null)
    
    @scala.inline
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setFailureInfo(value: NullableOption[FailureInfo]): Self = this.set("failureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureInfo: Self = this.set("failureInfo", js.undefined)
    
    @scala.inline
    def setFailureInfoNull: Self = this.set("failureInfo", null)
    
    @scala.inline
    def setModalitiesVarargs(value: Modality*): Self = this.set("modalities", js.Array(value :_*))
    
    @scala.inline
    def setModalities(value: js.Array[Modality]): Self = this.set("modalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalities: Self = this.set("modalities", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: NullableOption[js.Array[Segment]]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setSegmentsNull: Self = this.set("segments", null)
    
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
  }
}
