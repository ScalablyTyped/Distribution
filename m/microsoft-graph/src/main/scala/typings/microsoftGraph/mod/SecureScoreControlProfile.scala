package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureScoreControlProfile extends Entity {
  
  // Control action type (Config, Review, Behavior).
  var actionType: js.UndefOr[NullableOption[String]] = js.native
  
  // URL to where the control can be actioned.
  var actionUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.native
  
  var complianceInformation: js.UndefOr[NullableOption[js.Array[ComplianceInformation]]] = js.native
  
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[NullableOption[String]] = js.native
  
  var controlStateUpdates: js.UndefOr[NullableOption[js.Array[SecureScoreControlStateUpdate]]] = js.native
  
  // Flag to indicate if a control is depreciated.
  var deprecated: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Resource cost of implemmentating control (low, moderate, high).
  var implementationCost: js.UndefOr[NullableOption[String]] = js.native
  
  // Time at which the control profile entity was last modified. The Timestamp type represents date and time
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // max attainable score for the control.
  var maxScore: js.UndefOr[NullableOption[Double]] = js.native
  
  // Microsoft's stack ranking of control.
  var rank: js.UndefOr[NullableOption[Double]] = js.native
  
  // Description of what the control will help remediate.
  var remediation: js.UndefOr[NullableOption[String]] = js.native
  
  // Description of the impact on users of the remediation.
  var remediationImpact: js.UndefOr[NullableOption[String]] = js.native
  
  // Service that owns the control (Exchange, Sharepoint, Azure AD).
  var service: js.UndefOr[NullableOption[String]] = js.native
  
  // List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
  var threats: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var tier: js.UndefOr[NullableOption[String]] = js.native
  
  // Title of the control.
  var title: js.UndefOr[NullableOption[String]] = js.native
  
  var userImpact: js.UndefOr[NullableOption[String]] = js.native
  
  var vendorInformation: js.UndefOr[NullableOption[SecurityVendorInformation]] = js.native
}
object SecureScoreControlProfile {
  
  @scala.inline
  def apply(): SecureScoreControlProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlProfile]
  }
  
  @scala.inline
  implicit class SecureScoreControlProfileMutableBuilder[Self <: SecureScoreControlProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: NullableOption[String]): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setActionUrl(value: NullableOption[String]): Self = StObject.set(x, "actionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUrlNull: Self = StObject.set(x, "actionUrl", null)
    
    @scala.inline
    def setActionUrlUndefined: Self = StObject.set(x, "actionUrl", js.undefined)
    
    @scala.inline
    def setAzureTenantId(value: String): Self = StObject.set(x, "azureTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureTenantIdUndefined: Self = StObject.set(x, "azureTenantId", js.undefined)
    
    @scala.inline
    def setComplianceInformation(value: NullableOption[js.Array[ComplianceInformation]]): Self = StObject.set(x, "complianceInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceInformationNull: Self = StObject.set(x, "complianceInformation", null)
    
    @scala.inline
    def setComplianceInformationUndefined: Self = StObject.set(x, "complianceInformation", js.undefined)
    
    @scala.inline
    def setComplianceInformationVarargs(value: ComplianceInformation*): Self = StObject.set(x, "complianceInformation", js.Array(value :_*))
    
    @scala.inline
    def setControlCategory(value: NullableOption[String]): Self = StObject.set(x, "controlCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlCategoryNull: Self = StObject.set(x, "controlCategory", null)
    
    @scala.inline
    def setControlCategoryUndefined: Self = StObject.set(x, "controlCategory", js.undefined)
    
    @scala.inline
    def setControlStateUpdates(value: NullableOption[js.Array[SecureScoreControlStateUpdate]]): Self = StObject.set(x, "controlStateUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlStateUpdatesNull: Self = StObject.set(x, "controlStateUpdates", null)
    
    @scala.inline
    def setControlStateUpdatesUndefined: Self = StObject.set(x, "controlStateUpdates", js.undefined)
    
    @scala.inline
    def setControlStateUpdatesVarargs(value: SecureScoreControlStateUpdate*): Self = StObject.set(x, "controlStateUpdates", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated(value: NullableOption[Boolean]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setImplementationCost(value: NullableOption[String]): Self = StObject.set(x, "implementationCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationCostNull: Self = StObject.set(x, "implementationCost", null)
    
    @scala.inline
    def setImplementationCostUndefined: Self = StObject.set(x, "implementationCost", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setMaxScore(value: NullableOption[Double]): Self = StObject.set(x, "maxScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScoreNull: Self = StObject.set(x, "maxScore", null)
    
    @scala.inline
    def setMaxScoreUndefined: Self = StObject.set(x, "maxScore", js.undefined)
    
    @scala.inline
    def setRank(value: NullableOption[Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankNull: Self = StObject.set(x, "rank", null)
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setRemediation(value: NullableOption[String]): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationImpact(value: NullableOption[String]): Self = StObject.set(x, "remediationImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationImpactNull: Self = StObject.set(x, "remediationImpact", null)
    
    @scala.inline
    def setRemediationImpactUndefined: Self = StObject.set(x, "remediationImpact", js.undefined)
    
    @scala.inline
    def setRemediationNull: Self = StObject.set(x, "remediation", null)
    
    @scala.inline
    def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    @scala.inline
    def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNull: Self = StObject.set(x, "service", null)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setThreats(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "threats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatsNull: Self = StObject.set(x, "threats", null)
    
    @scala.inline
    def setThreatsUndefined: Self = StObject.set(x, "threats", js.undefined)
    
    @scala.inline
    def setThreatsVarargs(value: String*): Self = StObject.set(x, "threats", js.Array(value :_*))
    
    @scala.inline
    def setTier(value: NullableOption[String]): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierNull: Self = StObject.set(x, "tier", null)
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUserImpact(value: NullableOption[String]): Self = StObject.set(x, "userImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserImpactNull: Self = StObject.set(x, "userImpact", null)
    
    @scala.inline
    def setUserImpactUndefined: Self = StObject.set(x, "userImpact", js.undefined)
    
    @scala.inline
    def setVendorInformation(value: NullableOption[SecurityVendorInformation]): Self = StObject.set(x, "vendorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorInformationNull: Self = StObject.set(x, "vendorInformation", null)
    
    @scala.inline
    def setVendorInformationUndefined: Self = StObject.set(x, "vendorInformation", js.undefined)
  }
}
