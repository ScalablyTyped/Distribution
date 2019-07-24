package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrosoftStoreForBusinessApp extends MobileApp {
  // The app license type. Possible values are: offline, online.
  var licenseType: js.UndefOr[MicrosoftStoreForBusinessLicenseType] = js.undefined
  // The app package identifier
  var packageIdentityName: js.UndefOr[java.lang.String] = js.undefined
  // The app product key
  var productKey: js.UndefOr[java.lang.String] = js.undefined
  // The total number of Microsoft Store for Business licenses.
  var totalLicenseCount: js.UndefOr[scala.Double] = js.undefined
  // The number of Microsoft Store for Business licenses in use.
  var usedLicenseCount: js.UndefOr[scala.Double] = js.undefined
}

object MicrosoftStoreForBusinessApp {
  @scala.inline
  def apply(
    assignments: js.Array[MobileAppAssignment] = null,
    categories: js.Array[MobileAppCategory] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    developer: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    informationUrl: java.lang.String = null,
    isFeatured: js.UndefOr[scala.Boolean] = js.undefined,
    largeIcon: MimeContent = null,
    lastModifiedDateTime: java.lang.String = null,
    licenseType: MicrosoftStoreForBusinessLicenseType = null,
    notes: java.lang.String = null,
    owner: java.lang.String = null,
    packageIdentityName: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    productKey: java.lang.String = null,
    publisher: java.lang.String = null,
    publishingState: MobileAppPublishingState = null,
    totalLicenseCount: scala.Int | scala.Double = null,
    usedLicenseCount: scala.Int | scala.Double = null
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

