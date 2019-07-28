package typings.microsoftDashGraph.microsoftDashGraphMod

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
    totalLicenseCount: Int | Double = null,
    usedLicenseCount: Int | Double = null,
    userStateSummary: js.Array[UserInstallStateSummary] = null,
    vppOrganizationName: String = null,
    vppTokenId: String = null
  ): IosVppEBook = {
    val __obj = js.Dynamic.literal()
    if (appleId != null) __obj.updateDynamic("appleId")(appleId)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (genres != null) __obj.updateDynamic("genres")(genres)
    if (id != null) __obj.updateDynamic("id")(id)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (installSummary != null) __obj.updateDynamic("installSummary")(installSummary)
    if (language != null) __obj.updateDynamic("language")(language)
    if (largeCover != null) __obj.updateDynamic("largeCover")(largeCover)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publishedDateTime != null) __obj.updateDynamic("publishedDateTime")(publishedDateTime)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (seller != null) __obj.updateDynamic("seller")(seller)
    if (totalLicenseCount != null) __obj.updateDynamic("totalLicenseCount")(totalLicenseCount.asInstanceOf[js.Any])
    if (usedLicenseCount != null) __obj.updateDynamic("usedLicenseCount")(usedLicenseCount.asInstanceOf[js.Any])
    if (userStateSummary != null) __obj.updateDynamic("userStateSummary")(userStateSummary)
    if (vppOrganizationName != null) __obj.updateDynamic("vppOrganizationName")(vppOrganizationName)
    if (vppTokenId != null) __obj.updateDynamic("vppTokenId")(vppTokenId)
    __obj.asInstanceOf[IosVppEBook]
  }
}

