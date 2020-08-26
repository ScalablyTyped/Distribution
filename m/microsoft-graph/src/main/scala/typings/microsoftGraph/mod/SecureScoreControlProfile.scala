package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureScoreControlProfile extends Entity {
  // Control action type (Config, Review, Behavior).
  var actionType: js.UndefOr[String] = js.native
  // URL to where the control can be actioned.
  var actionUrl: js.UndefOr[String] = js.native
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.native
  var complianceInformation: js.UndefOr[js.Array[ComplianceInformation]] = js.native
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[String] = js.native
  var controlStateUpdates: js.UndefOr[js.Array[SecureScoreControlStateUpdate]] = js.native
  // Flag to indicate if a control is depreciated.
  var deprecated: js.UndefOr[Boolean] = js.native
  // Resource cost of implemmentating control (low, moderate, high).
  var implementationCost: js.UndefOr[String] = js.native
  // Time at which the control profile entity was last modified. The Timestamp type represents date and time
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // max attainable score for the control.
  var maxScore: js.UndefOr[Double] = js.native
  // Microsoft's stack ranking of control.
  var rank: js.UndefOr[Double] = js.native
  // Description of what the control will help remediate.
  var remediation: js.UndefOr[String] = js.native
  // Description of the impact on users of the remediation.
  var remediationImpact: js.UndefOr[String] = js.native
  // Service that owns the control (Exchange, Sharepoint, Azure AD).
  var service: js.UndefOr[String] = js.native
  // List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
  var threats: js.UndefOr[js.Array[String]] = js.native
  var tier: js.UndefOr[String] = js.native
  // Title of the control.
  var title: js.UndefOr[String] = js.native
  var userImpact: js.UndefOr[String] = js.native
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.native
}

object SecureScoreControlProfile {
  @scala.inline
  def apply(): SecureScoreControlProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlProfile]
  }
  @scala.inline
  implicit class SecureScoreControlProfileOps[Self <: SecureScoreControlProfile] (val x: Self) extends AnyVal {
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
    def setActionType(value: String): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    @scala.inline
    def setActionUrl(value: String): Self = this.set("actionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionUrl: Self = this.set("actionUrl", js.undefined)
    @scala.inline
    def setAzureTenantId(value: String): Self = this.set("azureTenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureTenantId: Self = this.set("azureTenantId", js.undefined)
    @scala.inline
    def setComplianceInformationVarargs(value: ComplianceInformation*): Self = this.set("complianceInformation", js.Array(value :_*))
    @scala.inline
    def setComplianceInformation(value: js.Array[ComplianceInformation]): Self = this.set("complianceInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceInformation: Self = this.set("complianceInformation", js.undefined)
    @scala.inline
    def setControlCategory(value: String): Self = this.set("controlCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlCategory: Self = this.set("controlCategory", js.undefined)
    @scala.inline
    def setControlStateUpdatesVarargs(value: SecureScoreControlStateUpdate*): Self = this.set("controlStateUpdates", js.Array(value :_*))
    @scala.inline
    def setControlStateUpdates(value: js.Array[SecureScoreControlStateUpdate]): Self = this.set("controlStateUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlStateUpdates: Self = this.set("controlStateUpdates", js.undefined)
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setImplementationCost(value: String): Self = this.set("implementationCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplementationCost: Self = this.set("implementationCost", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setMaxScore(value: Double): Self = this.set("maxScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScore: Self = this.set("maxScore", js.undefined)
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setRemediation(value: String): Self = this.set("remediation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediation: Self = this.set("remediation", js.undefined)
    @scala.inline
    def setRemediationImpact(value: String): Self = this.set("remediationImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediationImpact: Self = this.set("remediationImpact", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setThreatsVarargs(value: String*): Self = this.set("threats", js.Array(value :_*))
    @scala.inline
    def setThreats(value: js.Array[String]): Self = this.set("threats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreats: Self = this.set("threats", js.undefined)
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUserImpact(value: String): Self = this.set("userImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserImpact: Self = this.set("userImpact", js.undefined)
    @scala.inline
    def setVendorInformation(value: SecurityVendorInformation): Self = this.set("vendorInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorInformation: Self = this.set("vendorInformation", js.undefined)
  }
  
}

