package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskDetection
  extends StObject
     with Entity {
  
  // Indicates the activity type the detected risk is linked to. Possible values are: signin, user, unknownFutureValue.
  var activity: js.UndefOr[NullableOption[ActivityType]] = js.undefined
  
  /**
    * Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
    */
  var activityDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Additional information associated with the risk detection in JSON format. For example,
    * '[{/'Key/':/'userAgent/',/'Value/':/'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)
    * Chrome/68.0.3440.106 Safari/537.36/'}]'. Possible keys in the additionalInfo JSON string are: userAgent, alertUrl,
    * relatedEventTimeInUtc, relatedUserAgent, deviceInformation, relatedLocation, requestId, correlationId,
    * lastActivityTimeInUtc, malwareName, clientLocation, clientIp, riskReasons. For more information about riskReasons and
    * possible values, see riskReasons values.
    */
  var additionalInfo: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not
    * associated with a sign-in.
    */
  var correlationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: 2014-01-01T00:00:00Z
    */
  var detectedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Timing of the detected risk (real-time/offline). Possible values are: notDefined, realtime, nearRealtime, offline,
    * unknownFutureValue.
    */
  var detectionTimingType: js.UndefOr[NullableOption[RiskDetectionTimingType]] = js.undefined
  
  // Provides the IP address of the client from where the risk occurred.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Date and time that the risk detection was last updated. The DateTimeOffset type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this:
    * 2014-01-01T00:00:00Z
    */
  var lastUpdatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Location of the sign-in.
  var location: js.UndefOr[NullableOption[SignInLocation]] = js.undefined
  
  /**
    * Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not
    * associated with a sign-in.
    */
  var requestId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword,
    * userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe,
    * userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden,
    * adminConfirmedUserCompromised, unknownFutureValue.
    */
  var riskDetail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  /**
    * The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress,
    * unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,
    * generic,adminConfirmedUserCompromised, passwordSpray, impossibleTravel, newCountry, anomalousToken,
    * tokenIssuerAnomaly,suspiciousBrowser, riskyIPAddress, mcasSuspiciousInboxManipulationRules, suspiciousInboxForwarding,
    * and unknownFutureValue. If the risk detection is a premium detection, will show generic. For more information about
    * each value, see riskEventType values.
    */
  var riskEventType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Level of the detected risk. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
  var riskLevel: js.UndefOr[NullableOption[RiskLevel]] = js.undefined
  
  /**
    * The state of a detected risky user or sign-in. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk,
    * confirmedCompromised, unknownFutureValue.
    */
  var riskState: js.UndefOr[NullableOption[RiskState]] = js.undefined
  
  // Source of the risk detection. For example, activeDirectory.
  var source: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the type of token issuer for the detected sign-in risk. Possible values are: AzureAD, ADFederationServices,
    * UnknownFutureValue.
    */
  var tokenIssuerType: js.UndefOr[NullableOption[TokenIssuerType]] = js.undefined
  
  // The user principal name (UPN) of the user.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique ID of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user principal name (UPN) of the user.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object RiskDetection {
  
  inline def apply(): RiskDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskDetection] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: NullableOption[ActivityType]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTime(value: NullableOption[String]): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTimeNull: Self = StObject.set(x, "activityDateTime", null)
    
    inline def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setAdditionalInfo(value: NullableOption[String]): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setCorrelationId(value: NullableOption[String]): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setDetectedDateTime(value: NullableOption[String]): Self = StObject.set(x, "detectedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDetectedDateTimeNull: Self = StObject.set(x, "detectedDateTime", null)
    
    inline def setDetectedDateTimeUndefined: Self = StObject.set(x, "detectedDateTime", js.undefined)
    
    inline def setDetectionTimingType(value: NullableOption[RiskDetectionTimingType]): Self = StObject.set(x, "detectionTimingType", value.asInstanceOf[js.Any])
    
    inline def setDetectionTimingTypeNull: Self = StObject.set(x, "detectionTimingType", null)
    
    inline def setDetectionTimingTypeUndefined: Self = StObject.set(x, "detectionTimingType", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setLastUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeNull: Self = StObject.set(x, "lastUpdatedDateTime", null)
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocation(value: NullableOption[SignInLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequestId(value: NullableOption[String]): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setRiskDetail(value: NullableOption[RiskDetail]): Self = StObject.set(x, "riskDetail", value.asInstanceOf[js.Any])
    
    inline def setRiskDetailNull: Self = StObject.set(x, "riskDetail", null)
    
    inline def setRiskDetailUndefined: Self = StObject.set(x, "riskDetail", js.undefined)
    
    inline def setRiskEventType(value: NullableOption[String]): Self = StObject.set(x, "riskEventType", value.asInstanceOf[js.Any])
    
    inline def setRiskEventTypeNull: Self = StObject.set(x, "riskEventType", null)
    
    inline def setRiskEventTypeUndefined: Self = StObject.set(x, "riskEventType", js.undefined)
    
    inline def setRiskLevel(value: NullableOption[RiskLevel]): Self = StObject.set(x, "riskLevel", value.asInstanceOf[js.Any])
    
    inline def setRiskLevelNull: Self = StObject.set(x, "riskLevel", null)
    
    inline def setRiskLevelUndefined: Self = StObject.set(x, "riskLevel", js.undefined)
    
    inline def setRiskState(value: NullableOption[RiskState]): Self = StObject.set(x, "riskState", value.asInstanceOf[js.Any])
    
    inline def setRiskStateNull: Self = StObject.set(x, "riskState", null)
    
    inline def setRiskStateUndefined: Self = StObject.set(x, "riskState", js.undefined)
    
    inline def setSource(value: NullableOption[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTokenIssuerType(value: NullableOption[TokenIssuerType]): Self = StObject.set(x, "tokenIssuerType", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuerTypeNull: Self = StObject.set(x, "tokenIssuerType", null)
    
    inline def setTokenIssuerTypeUndefined: Self = StObject.set(x, "tokenIssuerType", js.undefined)
    
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
