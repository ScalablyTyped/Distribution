package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApp extends MobileApp {
  // The web app URL.
  var appUrl: js.UndefOr[String] = js.undefined
  // Whether or not to use managed browser. This property is only applicable for Android and IOS.
  var useManagedBrowser: js.UndefOr[Boolean] = js.undefined
}

object WebApp {
  @scala.inline
  def apply(
    appUrl: String = null,
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
    notes: String = null,
    owner: String = null,
    privacyInformationUrl: String = null,
    publisher: String = null,
    publishingState: MobileAppPublishingState = null,
    useManagedBrowser: js.UndefOr[Boolean] = js.undefined
  ): WebApp = {
    val __obj = js.Dynamic.literal()
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl)
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
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    if (!js.isUndefined(useManagedBrowser)) __obj.updateDynamic("useManagedBrowser")(useManagedBrowser)
    __obj.asInstanceOf[WebApp]
  }
}

