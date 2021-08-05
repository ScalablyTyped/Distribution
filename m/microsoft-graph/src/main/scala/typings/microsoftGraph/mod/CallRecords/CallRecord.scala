package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallRecord
  extends StObject
     with Entity {
  
  /**
    * UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[String] = js.undefined
  
  // Meeting URL associated to the call. May not be available for a peerToPeer call record type.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data,
    * screenSharing, unknownFutureValue.
    */
  var modalities: js.UndefOr[js.Array[Modality]] = js.undefined
  
  // The organizing party's identity.
  var organizer: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // List of distinct identities involved in the call.
  var participants: js.UndefOr[NullableOption[js.Array[IdentitySet]]] = js.undefined
  
  /**
    * List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls
    * typically have at least one session per participant. Read-only. Nullable.
    */
  var sessions: js.UndefOr[NullableOption[js.Array[Session]]] = js.undefined
  
  /**
    * UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.undefined
  
  // Indicates the type of the call. Possible values are: unknown, groupCall, peerToPeer, unknownFutureValue.
  var `type`: js.UndefOr[CallType] = js.undefined
  
  /**
    * Monotonically increasing version of the call record. Higher version call records with the same id includes additional
    * data compared to the lower version.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object CallRecord {
  
  inline def apply(): CallRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallRecord]
  }
  
  extension [Self <: CallRecord](x: Self) {
    
    inline def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    inline def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    inline def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setModalities(value: js.Array[Modality]): Self = StObject.set(x, "modalities", value.asInstanceOf[js.Any])
    
    inline def setModalitiesUndefined: Self = StObject.set(x, "modalities", js.undefined)
    
    inline def setModalitiesVarargs(value: Modality*): Self = StObject.set(x, "modalities", js.Array(value :_*))
    
    inline def setOrganizer(value: NullableOption[IdentitySet]): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    inline def setParticipants(value: NullableOption[js.Array[IdentitySet]]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setParticipantsVarargs(value: IdentitySet*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    inline def setSessions(value: NullableOption[js.Array[Session]]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsNull: Self = StObject.set(x, "sessions", null)
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value :_*))
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setType(value: CallType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
