package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAndroidLobApp extends ManagedMobileLobApp {
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.undefined
  // The package identifier.
  var packageId: js.UndefOr[String] = js.undefined
  // The version code of managed Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[String] = js.undefined
  // The version name of managed Android Line of Business (LoB) app.
  var versionName: js.UndefOr[String] = js.undefined
}

object ManagedAndroidLobApp {
  @scala.inline
  def apply(
    appAvailability: ManagedAppAvailability = null,
    assignments: js.Array[MobileAppAssignment] = null,
    categories: js.Array[MobileAppCategory] = null,
    committedContentVersion: String = null,
    contentVersions: js.Array[MobileAppContent] = null,
    createdDateTime: String = null,
    description: String = null,
    developer: String = null,
    displayName: String = null,
    fileName: String = null,
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
    publishingState: MobileAppPublishingState = null,
    size: Int | Double = null,
    version: String = null,
    versionCode: String = null,
    versionName: String = null
  ): ManagedAndroidLobApp = {
    val __obj = js.Dynamic.literal()
    if (appAvailability != null) __obj.updateDynamic("appAvailability")(appAvailability)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (committedContentVersion != null) __obj.updateDynamic("committedContentVersion")(committedContentVersion)
    if (contentVersions != null) __obj.updateDynamic("contentVersions")(contentVersions)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
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
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode)
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[ManagedAndroidLobApp]
  }
}

