package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskyServicePrincipal
  extends StObject
     with Entity {
  
  // The globally unique identifier for the associated application (its appId property), if any.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the service principal.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents the risk history of Azure AD service principals.
  var history: js.UndefOr[NullableOption[js.Array[RiskyServicePrincipalHistoryItem]]] = js.undefined
  
  // true if the service principal account is enabled; otherwise, false.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether Azure AD is currently processing the service principal's risky state.
  var isProcessing: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium
    * customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden,
    * unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you
    * must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum:
    * adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
    */
  var riskDetail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  /**
    * The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z.
    * Supports $filter (eq).
    */
  var riskLastUpdatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none,
    * unknownFutureValue. Supports $filter (eq).
    */
  var riskLevel: js.UndefOr[NullableOption[RiskLevel]] = js.undefined
  
  /**
    * State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk,
    * confirmedCompromised, unknownFutureValue.
    */
  var riskState: js.UndefOr[NullableOption[RiskState]] = js.undefined
  
  /**
    * Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application
    * (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal.
    */
  var servicePrincipalType: js.UndefOr[NullableOption[String]] = js.undefined
}
object RiskyServicePrincipal {
  
  inline def apply(): RiskyServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskyServicePrincipal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskyServicePrincipal] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHistory(value: NullableOption[js.Array[RiskyServicePrincipalHistoryItem]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: RiskyServicePrincipalHistoryItem*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setIsProcessing(value: NullableOption[Boolean]): Self = StObject.set(x, "isProcessing", value.asInstanceOf[js.Any])
    
    inline def setIsProcessingNull: Self = StObject.set(x, "isProcessing", null)
    
    inline def setIsProcessingUndefined: Self = StObject.set(x, "isProcessing", js.undefined)
    
    inline def setRiskDetail(value: NullableOption[RiskDetail]): Self = StObject.set(x, "riskDetail", value.asInstanceOf[js.Any])
    
    inline def setRiskDetailNull: Self = StObject.set(x, "riskDetail", null)
    
    inline def setRiskDetailUndefined: Self = StObject.set(x, "riskDetail", js.undefined)
    
    inline def setRiskLastUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "riskLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setRiskLastUpdatedDateTimeNull: Self = StObject.set(x, "riskLastUpdatedDateTime", null)
    
    inline def setRiskLastUpdatedDateTimeUndefined: Self = StObject.set(x, "riskLastUpdatedDateTime", js.undefined)
    
    inline def setRiskLevel(value: NullableOption[RiskLevel]): Self = StObject.set(x, "riskLevel", value.asInstanceOf[js.Any])
    
    inline def setRiskLevelNull: Self = StObject.set(x, "riskLevel", null)
    
    inline def setRiskLevelUndefined: Self = StObject.set(x, "riskLevel", js.undefined)
    
    inline def setRiskState(value: NullableOption[RiskState]): Self = StObject.set(x, "riskState", value.asInstanceOf[js.Any])
    
    inline def setRiskStateNull: Self = StObject.set(x, "riskState", null)
    
    inline def setRiskStateUndefined: Self = StObject.set(x, "riskState", js.undefined)
    
    inline def setServicePrincipalType(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalType", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalTypeNull: Self = StObject.set(x, "servicePrincipalType", null)
    
    inline def setServicePrincipalTypeUndefined: Self = StObject.set(x, "servicePrincipalType", js.undefined)
  }
}
