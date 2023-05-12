package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePrincipalRiskDetection
  extends StObject
     with Entity {
  
  /**
    * Indicates the activity type the detected risk is linked to. The possible values are: signin, servicePrincipal. Note
    * that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this
    * evolvable enum: servicePrincipal.
    */
  var activity: js.UndefOr[NullableOption[ActivityType]] = js.undefined
  
  /**
    * Date and time when the risky activity occurred. The DateTimeOffset type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var activityDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Additional information associated with the risk detection. This string value is represented as a JSON object with the
    * quotations escaped.
    */
  var additionalInfo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the associated application.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Correlation ID of the sign-in activity associated with the risk detection. This property is null if the risk detection
    * is not associated with a sign-in activity.
    */
  var correlationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Date and time when the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var detectedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Timing of the detected risk , whether real-time or offline. The possible values are: notDefined, realtime,
    * nearRealtime, offline, unknownFutureValue.
    */
  var detectionTimingType: js.UndefOr[NullableOption[RiskDetectionTimingType]] = js.undefined
  
  // Provides the IP address of the client from where the risk occurred.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the key credential associated with the risk detection.
  var keyIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Date and time when the risk detection was last updated.
  var lastUpdatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Location from where the sign-in was initiated.
  var location: js.UndefOr[NullableOption[SignInLocation]] = js.undefined
  
  /**
    * Request identifier of the sign-in activity associated with the risk detection. This property is null if the risk
    * detection is not associated with a sign-in activity. Supports $filter (eq).
    */
  var requestId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium
    * customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden,
    * adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer:
    * include-unknown-enum-members request header to get the following value(s) in this evolvable enum:
    * adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
    */
  var riskDetail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  /**
    * The type of risk event detected. The possible values are: investigationsThreatIntelligence, generic,
    * adminConfirmedServicePrincipalCompromised, suspiciousSignins, leakedCredentials, anomalousServicePrincipalActivity,
    * maliciousApplication, suspiciousApplication.
    */
  var riskEventType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Level of the detected risk. Note: Details for this property are only available for Workload Identities Premium
    * customers. Events in tenants without this license will be returned hidden. The possible values are: low, medium, high,
    * hidden, none.
    */
  var riskLevel: js.UndefOr[NullableOption[RiskLevel]] = js.undefined
  
  /**
    * The state of a detected risky service principal or sign-in activity. The possible values are: none, dismissed, atRisk,
    * confirmedCompromised.
    */
  var riskState: js.UndefOr[NullableOption[RiskState]] = js.undefined
  
  // The display name for the service principal.
  var servicePrincipalDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the service principal. Supports $filter (eq).
  var servicePrincipalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Source of the risk detection. For example, identityProtection.
  var source: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the type of token issuer for the detected sign-in risk. The possible values are: AzureAD.
  var tokenIssuerType: js.UndefOr[NullableOption[TokenIssuerType]] = js.undefined
}
object ServicePrincipalRiskDetection {
  
  inline def apply(): ServicePrincipalRiskDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePrincipalRiskDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServicePrincipalRiskDetection] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: NullableOption[ActivityType]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTime(value: NullableOption[String]): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    inline def setActivityDateTimeNull: Self = StObject.set(x, "activityDateTime", null)
    
    inline def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setAdditionalInfo(value: NullableOption[String]): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
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
    
    inline def setKeyIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "keyIds", value.asInstanceOf[js.Any])
    
    inline def setKeyIdsNull: Self = StObject.set(x, "keyIds", null)
    
    inline def setKeyIdsUndefined: Self = StObject.set(x, "keyIds", js.undefined)
    
    inline def setKeyIdsVarargs(value: String*): Self = StObject.set(x, "keyIds", js.Array(value*))
    
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
    
    inline def setServicePrincipalDisplayName(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalDisplayName", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalDisplayNameNull: Self = StObject.set(x, "servicePrincipalDisplayName", null)
    
    inline def setServicePrincipalDisplayNameUndefined: Self = StObject.set(x, "servicePrincipalDisplayName", js.undefined)
    
    inline def setServicePrincipalId(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalId", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalIdNull: Self = StObject.set(x, "servicePrincipalId", null)
    
    inline def setServicePrincipalIdUndefined: Self = StObject.set(x, "servicePrincipalId", js.undefined)
    
    inline def setSource(value: NullableOption[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTokenIssuerType(value: NullableOption[TokenIssuerType]): Self = StObject.set(x, "tokenIssuerType", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuerTypeNull: Self = StObject.set(x, "tokenIssuerType", null)
    
    inline def setTokenIssuerTypeUndefined: Self = StObject.set(x, "tokenIssuerType", js.undefined)
  }
}
