package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureScore extends Entity {
  // Active user count of the given tenant.
  var activeUserCount: js.UndefOr[Double] = js.undefined
  /**
    * Average score by different scopes (for example, average by industry, average by seating) and control category
    * (Identity, Data, Device, Apps, Infrastructure) within the scope.
    */
  var averageComparativeScores: js.UndefOr[js.Array[AverageComparativeScore]] = js.undefined
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.undefined
  // Contains tenant scores for a set of controls.
  var controlScores: js.UndefOr[js.Array[ControlScore]] = js.undefined
  // The date when the entity is created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Tenant current attained score on specified date.
  var currentScore: js.UndefOr[Double] = js.undefined
  // Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
  var enabledServices: js.UndefOr[js.Array[String]] = js.undefined
  // Licensed user count of the given tenant.
  var licensedUserCount: js.UndefOr[Double] = js.undefined
  // Tenant maximum possible score on specified date.
  var maxScore: js.UndefOr[Double] = js.undefined
  /**
    * Complex type containing details about the security product/service vendor, provider, and subprovider (for example,
    * vendor=Microsoft; provider=SecureScore). Required.
    */
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.undefined
}

object SecureScore {
  @scala.inline
  def apply(
    activeUserCount: js.UndefOr[Double] = js.undefined,
    averageComparativeScores: js.Array[AverageComparativeScore] = null,
    azureTenantId: String = null,
    controlScores: js.Array[ControlScore] = null,
    createdDateTime: String = null,
    currentScore: js.UndefOr[Double] = js.undefined,
    enabledServices: js.Array[String] = null,
    id: String = null,
    licensedUserCount: js.UndefOr[Double] = js.undefined,
    maxScore: js.UndefOr[Double] = js.undefined,
    vendorInformation: SecurityVendorInformation = null
  ): SecureScore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeUserCount)) __obj.updateDynamic("activeUserCount")(activeUserCount.get.asInstanceOf[js.Any])
    if (averageComparativeScores != null) __obj.updateDynamic("averageComparativeScores")(averageComparativeScores.asInstanceOf[js.Any])
    if (azureTenantId != null) __obj.updateDynamic("azureTenantId")(azureTenantId.asInstanceOf[js.Any])
    if (controlScores != null) __obj.updateDynamic("controlScores")(controlScores.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(currentScore)) __obj.updateDynamic("currentScore")(currentScore.get.asInstanceOf[js.Any])
    if (enabledServices != null) __obj.updateDynamic("enabledServices")(enabledServices.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(licensedUserCount)) __obj.updateDynamic("licensedUserCount")(licensedUserCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScore)) __obj.updateDynamic("maxScore")(maxScore.get.asInstanceOf[js.Any])
    if (vendorInformation != null) __obj.updateDynamic("vendorInformation")(vendorInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureScore]
  }
}

