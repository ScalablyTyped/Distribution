package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureScoreControlProfile
  extends StObject
     with Entity {
  
  // Control action type (Config, Review, Behavior).
  var actionType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL to where the control can be actioned.
  var actionUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.undefined
  
  // The collection of compliance information associated with secure score control
  var complianceInformation: js.UndefOr[NullableOption[js.Array[ComplianceInformation]]] = js.undefined
  
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Flag to indicate where the tenant has marked a control (ignored, thirdParty, reviewed) (supports update).
  var controlStateUpdates: js.UndefOr[NullableOption[js.Array[SecureScoreControlStateUpdate]]] = js.undefined
  
  // Flag to indicate if a control is depreciated.
  var deprecated: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Resource cost of implemmentating control (low, moderate, high).
  var implementationCost: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Time at which the control profile entity was last modified. The Timestamp type represents date and time
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // max attainable score for the control.
  var maxScore: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Microsoft's stack ranking of control.
  var rank: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Description of what the control will help remediate.
  var remediation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description of the impact on users of the remediation.
  var remediationImpact: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Service that owns the control (Exchange, Sharepoint, Azure AD).
  var service: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
  var threats: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var tier: js.UndefOr[NullableOption[String]] = js.undefined
  
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  var userImpact: js.UndefOr[NullableOption[String]] = js.undefined
  
  var vendorInformation: js.UndefOr[NullableOption[SecurityVendorInformation]] = js.undefined
}
object SecureScoreControlProfile {
  
  inline def apply(): SecureScoreControlProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecureScoreControlProfile] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: NullableOption[String]): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setActionUrl(value: NullableOption[String]): Self = StObject.set(x, "actionUrl", value.asInstanceOf[js.Any])
    
    inline def setActionUrlNull: Self = StObject.set(x, "actionUrl", null)
    
    inline def setActionUrlUndefined: Self = StObject.set(x, "actionUrl", js.undefined)
    
    inline def setAzureTenantId(value: String): Self = StObject.set(x, "azureTenantId", value.asInstanceOf[js.Any])
    
    inline def setAzureTenantIdUndefined: Self = StObject.set(x, "azureTenantId", js.undefined)
    
    inline def setComplianceInformation(value: NullableOption[js.Array[ComplianceInformation]]): Self = StObject.set(x, "complianceInformation", value.asInstanceOf[js.Any])
    
    inline def setComplianceInformationNull: Self = StObject.set(x, "complianceInformation", null)
    
    inline def setComplianceInformationUndefined: Self = StObject.set(x, "complianceInformation", js.undefined)
    
    inline def setComplianceInformationVarargs(value: ComplianceInformation*): Self = StObject.set(x, "complianceInformation", js.Array(value*))
    
    inline def setControlCategory(value: NullableOption[String]): Self = StObject.set(x, "controlCategory", value.asInstanceOf[js.Any])
    
    inline def setControlCategoryNull: Self = StObject.set(x, "controlCategory", null)
    
    inline def setControlCategoryUndefined: Self = StObject.set(x, "controlCategory", js.undefined)
    
    inline def setControlStateUpdates(value: NullableOption[js.Array[SecureScoreControlStateUpdate]]): Self = StObject.set(x, "controlStateUpdates", value.asInstanceOf[js.Any])
    
    inline def setControlStateUpdatesNull: Self = StObject.set(x, "controlStateUpdates", null)
    
    inline def setControlStateUpdatesUndefined: Self = StObject.set(x, "controlStateUpdates", js.undefined)
    
    inline def setControlStateUpdatesVarargs(value: SecureScoreControlStateUpdate*): Self = StObject.set(x, "controlStateUpdates", js.Array(value*))
    
    inline def setDeprecated(value: NullableOption[Boolean]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setImplementationCost(value: NullableOption[String]): Self = StObject.set(x, "implementationCost", value.asInstanceOf[js.Any])
    
    inline def setImplementationCostNull: Self = StObject.set(x, "implementationCost", null)
    
    inline def setImplementationCostUndefined: Self = StObject.set(x, "implementationCost", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setMaxScore(value: NullableOption[Double]): Self = StObject.set(x, "maxScore", value.asInstanceOf[js.Any])
    
    inline def setMaxScoreNull: Self = StObject.set(x, "maxScore", null)
    
    inline def setMaxScoreUndefined: Self = StObject.set(x, "maxScore", js.undefined)
    
    inline def setRank(value: NullableOption[Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankNull: Self = StObject.set(x, "rank", null)
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setRemediation(value: NullableOption[String]): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationImpact(value: NullableOption[String]): Self = StObject.set(x, "remediationImpact", value.asInstanceOf[js.Any])
    
    inline def setRemediationImpactNull: Self = StObject.set(x, "remediationImpact", null)
    
    inline def setRemediationImpactUndefined: Self = StObject.set(x, "remediationImpact", js.undefined)
    
    inline def setRemediationNull: Self = StObject.set(x, "remediation", null)
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setThreats(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "threats", value.asInstanceOf[js.Any])
    
    inline def setThreatsNull: Self = StObject.set(x, "threats", null)
    
    inline def setThreatsUndefined: Self = StObject.set(x, "threats", js.undefined)
    
    inline def setThreatsVarargs(value: String*): Self = StObject.set(x, "threats", js.Array(value*))
    
    inline def setTier(value: NullableOption[String]): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUserImpact(value: NullableOption[String]): Self = StObject.set(x, "userImpact", value.asInstanceOf[js.Any])
    
    inline def setUserImpactNull: Self = StObject.set(x, "userImpact", null)
    
    inline def setUserImpactUndefined: Self = StObject.set(x, "userImpact", js.undefined)
    
    inline def setVendorInformation(value: NullableOption[SecurityVendorInformation]): Self = StObject.set(x, "vendorInformation", value.asInstanceOf[js.Any])
    
    inline def setVendorInformationNull: Self = StObject.set(x, "vendorInformation", null)
    
    inline def setVendorInformationUndefined: Self = StObject.set(x, "vendorInformation", js.undefined)
  }
}
