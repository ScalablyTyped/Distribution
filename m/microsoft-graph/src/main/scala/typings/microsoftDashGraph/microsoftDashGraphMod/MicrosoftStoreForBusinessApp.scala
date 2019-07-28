package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrosoftStoreForBusinessApp extends MobileApp {
  // The app license type. Possible values are: offline, online.
  var licenseType: js.UndefOr[MicrosoftStoreForBusinessLicenseType] = js.undefined
  // The app package identifier
  var packageIdentityName: js.UndefOr[String] = js.undefined
  // The app product key
  var productKey: js.UndefOr[String] = js.undefined
  // The total number of Microsoft Store for Business licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.undefined
  // The number of Microsoft Store for Business licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.undefined
}

object MicrosoftStoreForBusinessApp {
  @scala.inline
  def apply(
    assignments: js.Array[MobileAppAssignment] = null,
    categories: js.Array[MobileAppCategory] = null,
    createdDateTime: String = null,
    description: String = null,
    developer: String = null,
    displayName: String = null,
    id: String = null,
    informationUrl: String = null,
    isFeatured: js.UndefOr[Boolean] = js.undefined,
    largeIcon: MimeContent = null,
    lastModifiedDateTime: String = null,
    licenseType: MicrosoftStoreForBusinessLicenseType = null,
    notes: String = null,
    owner: String = null,
    packageIdentityName: String = null,
    privacyInformationUrl: String = null,
    productKey: String = null,
    publisher: String = null,
    publishingState: MobileAppPublishingState = null,
    totalLicenseCount: Int | Double = null,
    usedLicenseCount: Int | Double = null
  ): MicrosoftStoreForBusinessApp = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured)
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (packageIdentityName != null) __obj.updateDynamic("packageIdentityName")(packageIdentityName)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (productKey != null) __obj.updateDynamic("productKey")(productKey)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    if (totalLicenseCount != null) __obj.updateDynamic("totalLicenseCount")(totalLicenseCount.asInstanceOf[js.Any])
    if (usedLicenseCount != null) __obj.updateDynamic("usedLicenseCount")(usedLicenseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrosoftStoreForBusinessApp]
  }
}

