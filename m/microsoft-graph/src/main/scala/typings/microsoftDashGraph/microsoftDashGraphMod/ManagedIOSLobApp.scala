package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedIOSLobApp extends ManagedMobileLobApp {
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  // The build number of managed iOS Line of Business (LoB) app.
  var buildNumber: js.UndefOr[String] = js.undefined
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.undefined
  // The expiration time.
  var expirationDateTime: js.UndefOr[String] = js.undefined
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.undefined
  // The version number of managed iOS Line of Business (LoB) app.
  var versionNumber: js.UndefOr[String] = js.undefined
}

object ManagedIOSLobApp {
  @scala.inline
  def apply(
    appAvailability: ManagedAppAvailability = null,
    applicableDeviceType: IosDeviceType = null,
    assignments: js.Array[MobileAppAssignment] = null,
    buildNumber: String = null,
    bundleId: String = null,
    categories: js.Array[MobileAppCategory] = null,
    committedContentVersion: String = null,
    contentVersions: js.Array[MobileAppContent] = null,
    createdDateTime: String = null,
    description: String = null,
    developer: String = null,
    displayName: String = null,
    expirationDateTime: String = null,
    fileName: String = null,
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
    publishingState: MobileAppPublishingState = null,
    size: Int | Double = null,
    version: String = null,
    versionNumber: String = null
  ): ManagedIOSLobApp = {
    val __obj = js.Dynamic.literal()
    if (appAvailability != null) __obj.updateDynamic("appAvailability")(appAvailability.asInstanceOf[js.Any])
    if (applicableDeviceType != null) __obj.updateDynamic("applicableDeviceType")(applicableDeviceType.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (buildNumber != null) __obj.updateDynamic("buildNumber")(buildNumber.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (committedContentVersion != null) __obj.updateDynamic("committedContentVersion")(committedContentVersion.asInstanceOf[js.Any])
    if (contentVersions != null) __obj.updateDynamic("contentVersions")(contentVersions.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured.asInstanceOf[js.Any])
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (minimumSupportedOperatingSystem != null) __obj.updateDynamic("minimumSupportedOperatingSystem")(minimumSupportedOperatingSystem.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedIOSLobApp]
  }
}

