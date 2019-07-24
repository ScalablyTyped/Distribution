package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidLobApp extends MobileLobApp {
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.undefined
  // The package identifier.
  var packageId: js.UndefOr[java.lang.String] = js.undefined
  // The version code of Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[java.lang.String] = js.undefined
  // The version name of Android Line of Business (LoB) app.
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}

object AndroidLobApp {
  @scala.inline
  def apply(
    assignments: js.Array[MobileAppAssignment] = null,
    categories: js.Array[MobileAppCategory] = null,
    committedContentVersion: java.lang.String = null,
    contentVersions: js.Array[MobileAppContent] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    developer: java.lang.String = null,
    displayName: java.lang.String = null,
    fileName: java.lang.String = null,
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
    size: scala.Int | scala.Double = null,
    versionCode: java.lang.String = null,
    versionName: java.lang.String = null
  ): AndroidLobApp = {
    val __obj = js.Dynamic.literal()
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
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode)
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[AndroidLobApp]
  }
}

