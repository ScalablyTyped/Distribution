package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsMobileMSI extends MobileLobApp {
  /** The command line. */
  var commandLine: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean to control whether the app's version will be used to detect the app after it is installed on a device.
    * Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
    */
  var ignoreVersionDetection: js.UndefOr[scala.Boolean] = js.undefined
  /** The product code. */
  var productCode: js.UndefOr[java.lang.String] = js.undefined
  /** The product version of Windows Mobile MSI Line of Business (LoB) app. */
  var productVersion: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsMobileMSI {
  @scala.inline
  def apply(
    assignments: js.Array[MobileAppAssignment] = null,
    categories: js.Array[MobileAppCategory] = null,
    commandLine: java.lang.String = null,
    committedContentVersion: java.lang.String = null,
    contentVersions: js.Array[MobileAppContent] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    developer: java.lang.String = null,
    displayName: java.lang.String = null,
    fileName: java.lang.String = null,
    id: java.lang.String = null,
    ignoreVersionDetection: js.UndefOr[scala.Boolean] = js.undefined,
    informationUrl: java.lang.String = null,
    isFeatured: js.UndefOr[scala.Boolean] = js.undefined,
    largeIcon: MimeContent = null,
    lastModifiedDateTime: java.lang.String = null,
    notes: java.lang.String = null,
    owner: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    productCode: java.lang.String = null,
    productVersion: java.lang.String = null,
    publisher: java.lang.String = null,
    publishingState: MobileAppPublishingState = null,
    size: scala.Int | scala.Double = null
  ): WindowsMobileMSI = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine)
    if (committedContentVersion != null) __obj.updateDynamic("committedContentVersion")(committedContentVersion)
    if (contentVersions != null) __obj.updateDynamic("contentVersions")(contentVersions)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreVersionDetection)) __obj.updateDynamic("ignoreVersionDetection")(ignoreVersionDetection)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured)
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (productCode != null) __obj.updateDynamic("productCode")(productCode)
    if (productVersion != null) __obj.updateDynamic("productVersion")(productVersion)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsMobileMSI]
  }
}

