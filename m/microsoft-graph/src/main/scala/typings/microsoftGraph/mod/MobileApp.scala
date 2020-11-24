package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileApp extends Entity {
  
  // The list of group assignments for this mobile app.
  var assignments: js.UndefOr[NullableOption[js.Array[MobileAppAssignment]]] = js.native
  
  // The list of categories for this app.
  var categories: js.UndefOr[NullableOption[js.Array[MobileAppCategory]]] = js.native
  
  // The date and time the app was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // The description of the app.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The developer of the app.
  var developer: js.UndefOr[NullableOption[String]] = js.native
  
  // The admin provided or imported title of the app.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The more information Url.
  var informationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The value indicating whether the app is marked as featured by the admin.
  var isFeatured: js.UndefOr[Boolean] = js.native
  
  // The large icon, to be displayed in the app details and used for upload of the icon.
  var largeIcon: js.UndefOr[NullableOption[MimeContent]] = js.native
  
  // The date and time the app was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // Notes for the app.
  var notes: js.UndefOr[NullableOption[String]] = js.native
  
  // The owner of the app.
  var owner: js.UndefOr[NullableOption[String]] = js.native
  
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The publisher of the app.
  var publisher: js.UndefOr[NullableOption[String]] = js.native
  
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
    def setAssignments(value: NullableOption[js.Array[MobileAppAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setCategoriesVarargs(value: MobileAppCategory*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: NullableOption[js.Array[MobileAppCategory]]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCategoriesNull: Self = this.set("categories", null)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDeveloper(value: NullableOption[String]): Self = this.set("developer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloper: Self = this.set("developer", js.undefined)
    
    @scala.inline
    def setDeveloperNull: Self = this.set("developer", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setInformationUrl(value: NullableOption[String]): Self = this.set("informationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInformationUrl: Self = this.set("informationUrl", js.undefined)
    
    @scala.inline
    def setInformationUrlNull: Self = this.set("informationUrl", null)
    
    @scala.inline
    def setIsFeatured(value: Boolean): Self = this.set("isFeatured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFeatured: Self = this.set("isFeatured", js.undefined)
    
    @scala.inline
    def setLargeIcon(value: NullableOption[MimeContent]): Self = this.set("largeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeIcon: Self = this.set("largeIcon", js.undefined)
    
    @scala.inline
    def setLargeIconNull: Self = this.set("largeIcon", null)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setNotes(value: NullableOption[String]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setNotesNull: Self = this.set("notes", null)
    
    @scala.inline
    def setOwner(value: NullableOption[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    
    @scala.inline
    def setPrivacyInformationUrl(value: NullableOption[String]): Self = this.set("privacyInformationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyInformationUrl: Self = this.set("privacyInformationUrl", js.undefined)
    
    @scala.inline
    def setPrivacyInformationUrlNull: Self = this.set("privacyInformationUrl", null)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPublisherNull: Self = this.set("publisher", null)
    
    @scala.inline
    def setPublishingState(value: MobileAppPublishingState): Self = this.set("publishingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishingState: Self = this.set("publishingState", js.undefined)
  }
}
