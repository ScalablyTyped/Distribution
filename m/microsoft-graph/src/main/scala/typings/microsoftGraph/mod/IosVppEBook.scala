package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosVppEBook extends ManagedEBook {
  // The Apple ID associated with Vpp token.
  var appleId: js.UndefOr[String] = js.undefined
  // Genres.
  var genres: js.UndefOr[js.Array[String]] = js.undefined
  // Language.
  var language: js.UndefOr[String] = js.undefined
  // Seller.
  var seller: js.UndefOr[String] = js.undefined
  // Total license count.
  var totalLicenseCount: js.UndefOr[Double] = js.undefined
  // Used license count.
  var usedLicenseCount: js.UndefOr[Double] = js.undefined
  // The Vpp token's organization name.
  var vppOrganizationName: js.UndefOr[String] = js.undefined
  // The Vpp token ID.
  var vppTokenId: js.UndefOr[String] = js.undefined
}

object IosVppEBook {
  @scala.inline
  def apply(
    appleId: String = null,
    assignments: js.Array[ManagedEBookAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceStates: js.Array[DeviceInstallState] = null,
    displayName: String = null,
    genres: js.Array[String] = null,
    id: String = null,
    informationUrl: String = null,
    installSummary: EBookInstallSummary = null,
    language: String = null,
    largeCover: MimeContent = null,
    lastModifiedDateTime: String = null,
    privacyInformationUrl: String = null,
    publishedDateTime: String = null,
    publisher: String = null,
    seller: String = null,
    totalLicenseCount: js.UndefOr[Double] = js.undefined,
    usedLicenseCount: js.UndefOr[Double] = js.undefined,
    userStateSummary: js.Array[UserInstallStateSummary] = null,
    vppOrganizationName: String = null,
    vppTokenId: String = null
  ): IosVppEBook = {
    val __obj = js.Dynamic.literal()
    if (appleId != null) __obj.updateDynamic("appleId")(appleId.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (genres != null) __obj.updateDynamic("genres")(genres.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl.asInstanceOf[js.Any])
    if (installSummary != null) __obj.updateDynamic("installSummary")(installSummary.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (largeCover != null) __obj.updateDynamic("largeCover")(largeCover.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl.asInstanceOf[js.Any])
    if (publishedDateTime != null) __obj.updateDynamic("publishedDateTime")(publishedDateTime.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (!js.isUndefined(totalLicenseCount)) __obj.updateDynamic("totalLicenseCount")(totalLicenseCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usedLicenseCount)) __obj.updateDynamic("usedLicenseCount")(usedLicenseCount.get.asInstanceOf[js.Any])
    if (userStateSummary != null) __obj.updateDynamic("userStateSummary")(userStateSummary.asInstanceOf[js.Any])
    if (vppOrganizationName != null) __obj.updateDynamic("vppOrganizationName")(vppOrganizationName.asInstanceOf[js.Any])
    if (vppTokenId != null) __obj.updateDynamic("vppTokenId")(vppTokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosVppEBook]
  }
}

