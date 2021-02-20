package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
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
  implicit class CallRecordMutableBuilder[Self <: CallRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    @scala.inline
    def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setModalities(value: js.Array[Modality]): Self = StObject.set(x, "modalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalitiesUndefined: Self = StObject.set(x, "modalities", js.undefined)
    
    @scala.inline
    def setModalitiesVarargs(value: Modality*): Self = StObject.set(x, "modalities", js.Array(value :_*))
    
    @scala.inline
    def setOrganizer(value: NullableOption[IdentitySet]): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    @scala.inline
    def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    @scala.inline
    def setParticipants(value: NullableOption[js.Array[IdentitySet]]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    @scala.inline
    def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    @scala.inline
    def setParticipantsVarargs(value: IdentitySet*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    @scala.inline
    def setSessions(value: NullableOption[js.Array[Session]]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsNull: Self = StObject.set(x, "sessions", null)
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value :_*))
    
    @scala.inline
    def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setType(value: CallType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
