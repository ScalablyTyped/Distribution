package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PstnCallLogRow extends StObject {
  
  /**
    * The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator
    * Connect Program, the operator may provide their own call duration data. In this case, the property value is operator.
    * Otherwise, the value is microsoft.
    */
  var callDurationSource: js.UndefOr[NullableOption[PstnCallDurationSource]] = js.undefined
  
  // Call identifier. Not guaranteed to be unique.
  var callId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio
    * conference.
    */
  var callType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number dialed in E.164 format.
  var calleeNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format.
  var callerNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Amount of money or cost of the call that is charged to your account.
  var charge: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // ID of the audio conference.
  var conferenceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Connection fee price.
  var connectionCharge: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Type of currency used to calculate the cost of the call (ISO 4217).
  var currency: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Whether the call was domestic (within a country or region) or international (outside a country or region) based on the
    * user's location.
    */
  var destinationContext: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Country or region dialed.
  var destinationName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // How long the call was connected, in seconds.
  var duration: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Call end time.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique call identifier. GUID.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User's phone number type, such as a service of toll-free number.
  var inventoryType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The license used for the call.
  var licenseCapability: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a
    * third-party operator via the Operator Connect Program.
    */
  var operator: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Call start time.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Country code of the tenant, ISO 3166-1 alpha-2.
  var tenantCountryCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Country code of the user, ISO 3166-1 alpha-2.
  var usageCountryCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the user.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucap_in, ucap_out).
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be
    * same as user's e-mail address.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object PstnCallLogRow {
  
  inline def apply(): PstnCallLogRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PstnCallLogRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PstnCallLogRow] (val x: Self) extends AnyVal {
    
    inline def setCallDurationSource(value: NullableOption[PstnCallDurationSource]): Self = StObject.set(x, "callDurationSource", value.asInstanceOf[js.Any])
    
    inline def setCallDurationSourceNull: Self = StObject.set(x, "callDurationSource", null)
    
    inline def setCallDurationSourceUndefined: Self = StObject.set(x, "callDurationSource", js.undefined)
    
    inline def setCallId(value: NullableOption[String]): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
    
    inline def setCallIdNull: Self = StObject.set(x, "callId", null)
    
    inline def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
    
    inline def setCallType(value: NullableOption[String]): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
    
    inline def setCallTypeNull: Self = StObject.set(x, "callType", null)
    
    inline def setCallTypeUndefined: Self = StObject.set(x, "callType", js.undefined)
    
    inline def setCalleeNumber(value: NullableOption[String]): Self = StObject.set(x, "calleeNumber", value.asInstanceOf[js.Any])
    
    inline def setCalleeNumberNull: Self = StObject.set(x, "calleeNumber", null)
    
    inline def setCalleeNumberUndefined: Self = StObject.set(x, "calleeNumber", js.undefined)
    
    inline def setCallerNumber(value: NullableOption[String]): Self = StObject.set(x, "callerNumber", value.asInstanceOf[js.Any])
    
    inline def setCallerNumberNull: Self = StObject.set(x, "callerNumber", null)
    
    inline def setCallerNumberUndefined: Self = StObject.set(x, "callerNumber", js.undefined)
    
    inline def setCharge(value: NullableOption[Double]): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setChargeNull: Self = StObject.set(x, "charge", null)
    
    inline def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
    
    inline def setConferenceId(value: NullableOption[String]): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    inline def setConferenceIdNull: Self = StObject.set(x, "conferenceId", null)
    
    inline def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    inline def setConnectionCharge(value: NullableOption[Double]): Self = StObject.set(x, "connectionCharge", value.asInstanceOf[js.Any])
    
    inline def setConnectionChargeNull: Self = StObject.set(x, "connectionCharge", null)
    
    inline def setConnectionChargeUndefined: Self = StObject.set(x, "connectionCharge", js.undefined)
    
    inline def setCurrency(value: NullableOption[String]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDestinationContext(value: NullableOption[String]): Self = StObject.set(x, "destinationContext", value.asInstanceOf[js.Any])
    
    inline def setDestinationContextNull: Self = StObject.set(x, "destinationContext", null)
    
    inline def setDestinationContextUndefined: Self = StObject.set(x, "destinationContext", js.undefined)
    
    inline def setDestinationName(value: NullableOption[String]): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameNull: Self = StObject.set(x, "destinationName", null)
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setDuration(value: NullableOption[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInventoryType(value: NullableOption[String]): Self = StObject.set(x, "inventoryType", value.asInstanceOf[js.Any])
    
    inline def setInventoryTypeNull: Self = StObject.set(x, "inventoryType", null)
    
    inline def setInventoryTypeUndefined: Self = StObject.set(x, "inventoryType", js.undefined)
    
    inline def setLicenseCapability(value: NullableOption[String]): Self = StObject.set(x, "licenseCapability", value.asInstanceOf[js.Any])
    
    inline def setLicenseCapabilityNull: Self = StObject.set(x, "licenseCapability", null)
    
    inline def setLicenseCapabilityUndefined: Self = StObject.set(x, "licenseCapability", js.undefined)
    
    inline def setOperator(value: NullableOption[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTenantCountryCode(value: NullableOption[String]): Self = StObject.set(x, "tenantCountryCode", value.asInstanceOf[js.Any])
    
    inline def setTenantCountryCodeNull: Self = StObject.set(x, "tenantCountryCode", null)
    
    inline def setTenantCountryCodeUndefined: Self = StObject.set(x, "tenantCountryCode", js.undefined)
    
    inline def setUsageCountryCode(value: NullableOption[String]): Self = StObject.set(x, "usageCountryCode", value.asInstanceOf[js.Any])
    
    inline def setUsageCountryCodeNull: Self = StObject.set(x, "usageCountryCode", null)
    
    inline def setUsageCountryCodeUndefined: Self = StObject.set(x, "usageCountryCode", js.undefined)
    
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
