package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosStoreApp extends MobileApp {
  // The Apple App Store URL
  var appStoreUrl: js.UndefOr[String] = js.undefined
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.undefined
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.undefined
}

object IosStoreApp {
  @scala.inline
  def apply(
    appStoreUrl: String = null,
    applicableDeviceType: IosDeviceType = null,
    assignments: js.Array[MobileAppAssignment] = null,
    bundleId: String = null,
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
    minimumSupportedOperatingSystem: IosMinimumOperatingSystem = null,
    notes: String = null,
    owner: String = null,
    privacyInformationUrl: String = null,
    publisher: String = null,
    publishingState: MobileAppPublishingState = null
  ): IosStoreApp = {
    val __obj = js.Dynamic.literal()
    if (appStoreUrl != null) __obj.updateDynamic("appStoreUrl")(appStoreUrl)
    if (applicableDeviceType != null) __obj.updateDynamic("applicableDeviceType")(applicableDeviceType)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
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
    if (minimumSupportedOperatingSystem != null) __obj.updateDynamic("minimumSupportedOperatingSystem")(minimumSupportedOperatingSystem)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    __obj.asInstanceOf[IosStoreApp]
  }
}

