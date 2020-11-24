package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallRecord extends Entity {
  
  /**
    * UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[String] = js.native
  
  // Meeting URL associated to the call. May not be available for a peerToPeer call record type.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data,
    * screenSharing, unknownFutureValue.
    */
  var modalities: js.UndefOr[js.Array[Modality]] = js.native
  
  // The organizing party's identity.
  var organizer: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // List of distinct identities involved in the call.
  var participants: js.UndefOr[NullableOption[js.Array[IdentitySet]]] = js.native
  
  /**
    * List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls
    * typically have at least one session per participant. Read-only. Nullable.
    */
  var sessions: js.UndefOr[NullableOption[js.Array[Session]]] = js.native
  
  /**
    * UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.native
  
  // Indicates the type of the call. Possible values are: unknown, groupCall, peerToPeer, unknownFutureValue.
  var `type`: js.UndefOr[CallType] = js.native
  
  /**
    * Monotonically increasing version of the call record. Higher version call records with the same id includes additional
    * data compared to the lower version.
    */
  var version: js.UndefOr[Double] = js.native
}
object CallRecord {
  
  @scala.inline
  def apply(): CallRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallRecord]
  }
  
  @scala.inline
  implicit class CallRecordOps[Self <: CallRecord] (val x: Self) extends AnyVal {
    
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
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setJoinWebUrl(value: NullableOption[String]): Self = this.set("joinWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinWebUrl: Self = this.set("joinWebUrl", js.undefined)
    
    @scala.inline
    def setJoinWebUrlNull: Self = this.set("joinWebUrl", null)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setModalitiesVarargs(value: Modality*): Self = this.set("modalities", js.Array(value :_*))
    
    @scala.inline
    def setModalities(value: js.Array[Modality]): Self = this.set("modalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalities: Self = this.set("modalities", js.undefined)
    
    @scala.inline
    def setOrganizer(value: NullableOption[IdentitySet]): Self = this.set("organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
    
    @scala.inline
    def setOrganizerNull: Self = this.set("organizer", null)
    
    @scala.inline
    def setParticipantsVarargs(value: IdentitySet*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: NullableOption[js.Array[IdentitySet]]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipants: Self = this.set("participants", js.undefined)
    
    @scala.inline
    def setParticipantsNull: Self = this.set("participants", null)
    
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = this.set("sessions", js.Array(value :_*))
    
    @scala.inline
    def setSessions(value: NullableOption[js.Array[Session]]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
    
    @scala.inline
    def setSessionsNull: Self = this.set("sessions", null)
    
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setType(value: CallType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
