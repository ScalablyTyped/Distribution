package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAndroidStoreApp extends ManagedApp {
  // The Android AppStoreUrl.
  var appStoreUrl: js.UndefOr[java.lang.String] = js.undefined
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.undefined
  // The app's package ID.
  var packageId: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAndroidStoreApp {
  @scala.inline
  def apply(
    appAvailability: ManagedAppAvailability = null,
    appStoreUrl: java.lang.String = null,
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
    minimumSupportedOperatingSystem: AndroidMinimumOperatingSystem = null,
    notes: java.lang.String = null,
    owner: java.lang.String = null,
    packageId: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    publisher: java.lang.String = null,
    publishingState: MobileAppPublishingState = null,
    version: java.lang.String = null
  ): ManagedAndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    if (appAvailability != null) __obj.updateDynamic("appAvailability")(appAvailability)
    if (appStoreUrl != null) __obj.updateDynamic("appStoreUrl")(appStoreUrl)
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
    if (minimumSupportedOperatingSystem != null) __obj.updateDynamic("minimumSupportedOperatingSystem")(minimumSupportedOperatingSystem)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (packageId != null) __obj.updateDynamic("packageId")(packageId)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAndroidStoreApp]
  }
}

