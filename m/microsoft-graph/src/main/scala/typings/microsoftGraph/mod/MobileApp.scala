package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileApp extends Entity {
  // The list of group assignments for this mobile app.
  var assignments: js.UndefOr[js.Array[MobileAppAssignment]] = js.native
  // The list of categories for this app.
  var categories: js.UndefOr[js.Array[MobileAppCategory]] = js.native
  // The date and time the app was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // The description of the app.
  var description: js.UndefOr[String] = js.native
  // The developer of the app.
  var developer: js.UndefOr[String] = js.native
  // The admin provided or imported title of the app.
  var displayName: js.UndefOr[String] = js.native
  // The more information Url.
  var informationUrl: js.UndefOr[String] = js.native
  // The value indicating whether the app is marked as featured by the admin.
  var isFeatured: js.UndefOr[Boolean] = js.native
  // The large icon, to be displayed in the app details and used for upload of the icon.
  var largeIcon: js.UndefOr[MimeContent] = js.native
  // The date and time the app was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Notes for the app.
  var notes: js.UndefOr[String] = js.native
  // The owner of the app.
  var owner: js.UndefOr[String] = js.native
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[String] = js.native
  // The publisher of the app.
  var publisher: js.UndefOr[String] = js.native
  /**
    * The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are:
    * notPublished, processing, published.
    */
  var publishingState: js.UndefOr[MobileAppPublishingState] = js.native
}

object MobileApp {
  @scala.inline
  def apply(): MobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApp]
  }
  @scala.inline
  implicit class MobileAppOps[Self <: MobileApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignmentsVarargs(value: MobileAppAssignment*): Self = this.set("assignments", js.Array(value :_*))
    @scala.inline
    def setAssignments(value: js.Array[MobileAppAssignment]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: MobileAppCategory*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[MobileAppCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDeveloper(value: String): Self = this.set("developer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloper: Self = this.set("developer", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setInformationUrl(value: String): Self = this.set("informationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInformationUrl: Self = this.set("informationUrl", js.undefined)
    @scala.inline
    def setIsFeatured(value: Boolean): Self = this.set("isFeatured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFeatured: Self = this.set("isFeatured", js.undefined)
    @scala.inline
    def setLargeIcon(value: MimeContent): Self = this.set("largeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeIcon: Self = this.set("largeIcon", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPrivacyInformationUrl(value: String): Self = this.set("privacyInformationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacyInformationUrl: Self = this.set("privacyInformationUrl", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPublishingState(value: MobileAppPublishingState): Self = this.set("publishingState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishingState: Self = this.set("publishingState", js.undefined)
  }
  
}

