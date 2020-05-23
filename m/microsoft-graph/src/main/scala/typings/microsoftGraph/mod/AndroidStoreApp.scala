package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidStoreApp extends MobileApp {
  // The Android app store URL.
  var appStoreUrl: js.UndefOr[String] = js.undefined
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.undefined
  // The package identifier.
  var packageId: js.UndefOr[String] = js.undefined
}

object AndroidStoreApp {
  @scala.inline
  def apply(
    appStoreUrl: String = null,
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
    minimumSupportedOperatingSystem: AndroidMinimumOperatingSystem = null,
    notes: String = null,
    owner: String = null,
    packageId: String = null,
    privacyInformationUrl: String = null,
    publisher: String = null,
    publishingState: MobileAppPublishingState = null
  ): AndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    if (appStoreUrl != null) __obj.updateDynamic("appStoreUrl")(appStoreUrl.asInstanceOf[js.Any])
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
    if (minimumSupportedOperatingSystem != null) __obj.updateDynamic("minimumSupportedOperatingSystem")(minimumSupportedOperatingSystem.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidStoreApp]
  }
}

