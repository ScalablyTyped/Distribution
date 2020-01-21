package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileApp extends Entity {
  // The list of group assignments for this mobile app.
  var assignments: js.UndefOr[js.Array[MobileAppAssignment]] = js.undefined
  // The list of categories for this app.
  var categories: js.UndefOr[js.Array[MobileAppCategory]] = js.undefined
  // The date and time the app was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // The description of the app.
  var description: js.UndefOr[String] = js.undefined
  // The developer of the app.
  var developer: js.UndefOr[String] = js.undefined
  // The admin provided or imported title of the app.
  var displayName: js.UndefOr[String] = js.undefined
  // The more information Url.
  var informationUrl: js.UndefOr[String] = js.undefined
  // The value indicating whether the app is marked as featured by the admin.
  var isFeatured: js.UndefOr[Boolean] = js.undefined
  // The large icon, to be displayed in the app details and used for upload of the icon.
  var largeIcon: js.UndefOr[MimeContent] = js.undefined
  // The date and time the app was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Notes for the app.
  var notes: js.UndefOr[String] = js.undefined
  // The owner of the app.
  var owner: js.UndefOr[String] = js.undefined
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[String] = js.undefined
  // The publisher of the app.
  var publisher: js.UndefOr[String] = js.undefined
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
    publishingState: MobileAppPublishingState = null
  ): MobileApp = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured.asInstanceOf[js.Any])
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileApp]
  }
}

