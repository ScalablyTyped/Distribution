package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureScore extends Entity {
  // Active user count of the given tenant.
  var activeUserCount: js.UndefOr[Double] = js.native
  /**
    * Average score by different scopes (for example, average by industry, average by seating) and control category
    * (Identity, Data, Device, Apps, Infrastructure) within the scope.
    */
  var averageComparativeScores: js.UndefOr[js.Array[AverageComparativeScore]] = js.native
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.native
  // Contains tenant scores for a set of controls.
  var controlScores: js.UndefOr[js.Array[ControlScore]] = js.native
  // The date when the entity is created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Tenant current attained score on specified date.
  var currentScore: js.UndefOr[Double] = js.native
  // Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
  var enabledServices: js.UndefOr[js.Array[String]] = js.native
  // Licensed user count of the given tenant.
  var licensedUserCount: js.UndefOr[Double] = js.native
  // Tenant maximum possible score on specified date.
  var maxScore: js.UndefOr[Double] = js.native
  /**
    * Complex type containing details about the security product/service vendor, provider, and subprovider (for example,
    * vendor=Microsoft; provider=SecureScore). Required.
    */
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.native
}

object SecureScore {
  @scala.inline
  def apply(): SecureScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScore]
  }
  @scala.inline
  implicit class SecureScoreOps[Self <: SecureScore] (val x: Self) extends AnyVal {
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
    def setActiveUserCount(value: Double): Self = this.set("activeUserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveUserCount: Self = this.set("activeUserCount", js.undefined)
    @scala.inline
    def setAverageComparativeScoresVarargs(value: AverageComparativeScore*): Self = this.set("averageComparativeScores", js.Array(value :_*))
    @scala.inline
    def setAverageComparativeScores(value: js.Array[AverageComparativeScore]): Self = this.set("averageComparativeScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageComparativeScores: Self = this.set("averageComparativeScores", js.undefined)
    @scala.inline
    def setAzureTenantId(value: String): Self = this.set("azureTenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureTenantId: Self = this.set("azureTenantId", js.undefined)
    @scala.inline
    def setControlScoresVarargs(value: ControlScore*): Self = this.set("controlScores", js.Array(value :_*))
    @scala.inline
    def setControlScores(value: js.Array[ControlScore]): Self = this.set("controlScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlScores: Self = this.set("controlScores", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setCurrentScore(value: Double): Self = this.set("currentScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentScore: Self = this.set("currentScore", js.undefined)
    @scala.inline
    def setEnabledServicesVarargs(value: String*): Self = this.set("enabledServices", js.Array(value :_*))
    @scala.inline
    def setEnabledServices(value: js.Array[String]): Self = this.set("enabledServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledServices: Self = this.set("enabledServices", js.undefined)
    @scala.inline
    def setLicensedUserCount(value: Double): Self = this.set("licensedUserCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensedUserCount: Self = this.set("licensedUserCount", js.undefined)
    @scala.inline
    def setMaxScore(value: Double): Self = this.set("maxScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScore: Self = this.set("maxScore", js.undefined)
    @scala.inline
    def setVendorInformation(value: SecurityVendorInformation): Self = this.set("vendorInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorInformation: Self = this.set("vendorInformation", js.undefined)
  }
  
}

