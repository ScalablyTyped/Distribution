package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectRoutingLogRow extends StObject {
  
  // In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
  var callEndSubReason: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Call type and direction.
  var callType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of the user or bot who received the call. E.164 format, but may include additional data.
  var calleeNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of the user or bot who made the call. E.164 format, but may include additional data.
  var callerNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier for the call that you can use when calling Microsoft Support. GUID.
  var correlationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Duration of the call in seconds.
  var duration: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Only exists for successful (fully established) calls. Time when call ended.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Only exists for failed (not fully established) calls.
  var failureDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The code with which the call ended, RFC 3261.
  var finalSipCode: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Description of the SIP code and Microsoft subcode.
  var finalSipCodePhrase: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique call identifier. GUID.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When the initial invite was sent.
  var inviteDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates if the trunk was enabled for media bypass or not.
  var mediaBypassEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The datacenter used for media path in non-bypass call.
  var mediaPathLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The datacenter used for signaling for both bypass and non-bypass calls.
  var signalingLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Call start time.For failed and unanswered calls, this can be equal to invite or failure time.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Success or attempt.
  var successfulCall: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Fully qualified domain name of the session border controller.
  var trunkFullyQualifiedDomainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the user.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be
    * same as user's e-mail address.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DirectRoutingLogRow {
  
  inline def apply(): DirectRoutingLogRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectRoutingLogRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectRoutingLogRow] (val x: Self) extends AnyVal {
    
    inline def setCallEndSubReason(value: NullableOption[Double]): Self = StObject.set(x, "callEndSubReason", value.asInstanceOf[js.Any])
    
    inline def setCallEndSubReasonNull: Self = StObject.set(x, "callEndSubReason", null)
    
    inline def setCallEndSubReasonUndefined: Self = StObject.set(x, "callEndSubReason", js.undefined)
    
    inline def setCallType(value: NullableOption[String]): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
    
    inline def setCallTypeNull: Self = StObject.set(x, "callType", null)
    
    inline def setCallTypeUndefined: Self = StObject.set(x, "callType", js.undefined)
    
    inline def setCalleeNumber(value: NullableOption[String]): Self = StObject.set(x, "calleeNumber", value.asInstanceOf[js.Any])
    
    inline def setCalleeNumberNull: Self = StObject.set(x, "calleeNumber", null)
    
    inline def setCalleeNumberUndefined: Self = StObject.set(x, "calleeNumber", js.undefined)
    
    inline def setCallerNumber(value: NullableOption[String]): Self = StObject.set(x, "callerNumber", value.asInstanceOf[js.Any])
    
    inline def setCallerNumberNull: Self = StObject.set(x, "callerNumber", null)
    
    inline def setCallerNumberUndefined: Self = StObject.set(x, "callerNumber", js.undefined)
    
    inline def setCorrelationId(value: NullableOption[String]): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setDuration(value: NullableOption[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setFailureDateTime(value: NullableOption[String]): Self = StObject.set(x, "failureDateTime", value.asInstanceOf[js.Any])
    
    inline def setFailureDateTimeNull: Self = StObject.set(x, "failureDateTime", null)
    
    inline def setFailureDateTimeUndefined: Self = StObject.set(x, "failureDateTime", js.undefined)
    
    inline def setFinalSipCode(value: NullableOption[Double]): Self = StObject.set(x, "finalSipCode", value.asInstanceOf[js.Any])
    
    inline def setFinalSipCodeNull: Self = StObject.set(x, "finalSipCode", null)
    
    inline def setFinalSipCodePhrase(value: NullableOption[String]): Self = StObject.set(x, "finalSipCodePhrase", value.asInstanceOf[js.Any])
    
    inline def setFinalSipCodePhraseNull: Self = StObject.set(x, "finalSipCodePhrase", null)
    
    inline def setFinalSipCodePhraseUndefined: Self = StObject.set(x, "finalSipCodePhrase", js.undefined)
    
    inline def setFinalSipCodeUndefined: Self = StObject.set(x, "finalSipCode", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInviteDateTime(value: NullableOption[String]): Self = StObject.set(x, "inviteDateTime", value.asInstanceOf[js.Any])
    
    inline def setInviteDateTimeNull: Self = StObject.set(x, "inviteDateTime", null)
    
    inline def setInviteDateTimeUndefined: Self = StObject.set(x, "inviteDateTime", js.undefined)
    
    inline def setMediaBypassEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "mediaBypassEnabled", value.asInstanceOf[js.Any])
    
    inline def setMediaBypassEnabledNull: Self = StObject.set(x, "mediaBypassEnabled", null)
    
    inline def setMediaBypassEnabledUndefined: Self = StObject.set(x, "mediaBypassEnabled", js.undefined)
    
    inline def setMediaPathLocation(value: NullableOption[String]): Self = StObject.set(x, "mediaPathLocation", value.asInstanceOf[js.Any])
    
    inline def setMediaPathLocationNull: Self = StObject.set(x, "mediaPathLocation", null)
    
    inline def setMediaPathLocationUndefined: Self = StObject.set(x, "mediaPathLocation", js.undefined)
    
    inline def setSignalingLocation(value: NullableOption[String]): Self = StObject.set(x, "signalingLocation", value.asInstanceOf[js.Any])
    
    inline def setSignalingLocationNull: Self = StObject.set(x, "signalingLocation", null)
    
    inline def setSignalingLocationUndefined: Self = StObject.set(x, "signalingLocation", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setSuccessfulCall(value: NullableOption[Boolean]): Self = StObject.set(x, "successfulCall", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulCallNull: Self = StObject.set(x, "successfulCall", null)
    
    inline def setSuccessfulCallUndefined: Self = StObject.set(x, "successfulCall", js.undefined)
    
    inline def setTrunkFullyQualifiedDomainName(value: NullableOption[String]): Self = StObject.set(x, "trunkFullyQualifiedDomainName", value.asInstanceOf[js.Any])
    
    inline def setTrunkFullyQualifiedDomainNameNull: Self = StObject.set(x, "trunkFullyQualifiedDomainName", null)
    
    inline def setTrunkFullyQualifiedDomainNameUndefined: Self = StObject.set(x, "trunkFullyQualifiedDomainName", js.undefined)
    
    inline def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    inline def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
