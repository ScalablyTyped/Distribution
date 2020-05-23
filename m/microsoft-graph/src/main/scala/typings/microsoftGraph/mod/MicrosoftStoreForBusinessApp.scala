package typings.microsoftGraph.mod

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
    totalLicenseCount: js.UndefOr[Double] = js.undefined,
    usedLicenseCount: js.UndefOr[Double] = js.undefined
  ): MicrosoftStoreForBusinessApp = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured.get.asInstanceOf[js.Any])
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (packageIdentityName != null) __obj.updateDynamic("packageIdentityName")(packageIdentityName.asInstanceOf[js.Any])
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl.asInstanceOf[js.Any])
    if (productKey != null) __obj.updateDynamic("productKey")(productKey.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState.asInstanceOf[js.Any])
    if (!js.isUndefined(totalLicenseCount)) __obj.updateDynamic("totalLicenseCount")(totalLicenseCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usedLicenseCount)) __obj.updateDynamic("usedLicenseCount")(usedLicenseCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrosoftStoreForBusinessApp]
  }
}

