package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureScoreControlProfile extends Entity {
  // Control action type (Config, Review, Behavior).
  var actionType: js.UndefOr[String] = js.undefined
  // URL to where the control can be actioned.
  var actionUrl: js.UndefOr[String] = js.undefined
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.undefined
  var complianceInformation: js.UndefOr[js.Array[ComplianceInformation]] = js.undefined
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[String] = js.undefined
  var controlStateUpdates: js.UndefOr[js.Array[SecureScoreControlStateUpdate]] = js.undefined
  // Flag to indicate if a control is depreciated.
  var deprecated: js.UndefOr[Boolean] = js.undefined
  // Resource cost of implemmentating control (low, moderate, high).
  var implementationCost: js.UndefOr[String] = js.undefined
  // Time at which the control profile entity was last modified. The Timestamp type represents date and time
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // max attainable score for the control.
  var maxScore: js.UndefOr[Double] = js.undefined
  // Microsoft's stack ranking of control.
  var rank: js.UndefOr[Double] = js.undefined
  // Description of what the control will help remediate.
  var remediation: js.UndefOr[String] = js.undefined
  // Description of the impact on users of the remediation.
  var remediationImpact: js.UndefOr[String] = js.undefined
  // Service that owns the control (Exchange, Sharepoint, Azure AD).
  var service: js.UndefOr[String] = js.undefined
  // List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
  var threats: js.UndefOr[js.Array[String]] = js.undefined
  var tier: js.UndefOr[String] = js.undefined
  // Title of the control.
  var title: js.UndefOr[String] = js.undefined
  var userImpact: js.UndefOr[String] = js.undefined
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.undefined
}

object SecureScoreControlProfile {
  @scala.inline
  def apply(
    actionType: String = null,
    actionUrl: String = null,
    azureTenantId: String = null,
    complianceInformation: js.Array[ComplianceInformation] = null,
    controlCategory: String = null,
    controlStateUpdates: js.Array[SecureScoreControlStateUpdate] = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    implementationCost: String = null,
    lastModifiedDateTime: String = null,
    maxScore: js.UndefOr[Double] = js.undefined,
    rank: js.UndefOr[Double] = js.undefined,
    remediation: String = null,
    remediationImpact: String = null,
    service: String = null,
    threats: js.Array[String] = null,
    tier: String = null,
    title: String = null,
    userImpact: String = null,
    vendorInformation: SecurityVendorInformation = null
  ): SecureScoreControlProfile = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (actionUrl != null) __obj.updateDynamic("actionUrl")(actionUrl.asInstanceOf[js.Any])
    if (azureTenantId != null) __obj.updateDynamic("azureTenantId")(azureTenantId.asInstanceOf[js.Any])
    if (complianceInformation != null) __obj.updateDynamic("complianceInformation")(complianceInformation.asInstanceOf[js.Any])
    if (controlCategory != null) __obj.updateDynamic("controlCategory")(controlCategory.asInstanceOf[js.Any])
    if (controlStateUpdates != null) __obj.updateDynamic("controlStateUpdates")(controlStateUpdates.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implementationCost != null) __obj.updateDynamic("implementationCost")(implementationCost.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScore)) __obj.updateDynamic("maxScore")(maxScore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rank)) __obj.updateDynamic("rank")(rank.get.asInstanceOf[js.Any])
    if (remediation != null) __obj.updateDynamic("remediation")(remediation.asInstanceOf[js.Any])
    if (remediationImpact != null) __obj.updateDynamic("remediationImpact")(remediationImpact.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (threats != null) __obj.updateDynamic("threats")(threats.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (userImpact != null) __obj.updateDynamic("userImpact")(userImpact.asInstanceOf[js.Any])
    if (vendorInformation != null) __obj.updateDynamic("vendorInformation")(vendorInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureScoreControlProfile]
  }
}

