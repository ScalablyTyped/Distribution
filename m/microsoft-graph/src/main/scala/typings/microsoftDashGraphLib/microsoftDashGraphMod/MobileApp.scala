package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileApp extends Entity {
  // The list of group assignments for this mobile app.
  var assignments: js.UndefOr[js.Array[MobileAppAssignment]] = js.undefined
  // The list of categories for this app.
  var categories: js.UndefOr[js.Array[MobileAppCategory]] = js.undefined
  // The date and time the app was created.
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The description of the app.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // The developer of the app.
  var developer: js.UndefOr[java.lang.String] = js.undefined
  // The admin provided or imported title of the app.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // The more information Url.
  var informationUrl: js.UndefOr[java.lang.String] = js.undefined
  // The value indicating whether the app is marked as featured by the admin.
  var isFeatured: js.UndefOr[scala.Boolean] = js.undefined
  // The large icon, to be displayed in the app details and used for upload of the icon.
  var largeIcon: js.UndefOr[MimeContent] = js.undefined
  // The date and time the app was last modified.
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Notes for the app.
  var notes: js.UndefOr[java.lang.String] = js.undefined
  // The owner of the app.
  var owner: js.UndefOr[java.lang.String] = js.undefined
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[java.lang.String] = js.undefined
  // The publisher of the app.
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are:
    * notPublished, processing, published.
    */
  var publishingState: js.UndefOr[MobileAppPublishingState] = js.undefined
}

object MobileApp {
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
    notes: java.lang.String = null,
    owner: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    publisher: java.lang.String = null,
    publishingState: MobileAppPublishingState = null
  ): MobileApp = {
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
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    __obj.asInstanceOf[MobileApp]
  }
}

