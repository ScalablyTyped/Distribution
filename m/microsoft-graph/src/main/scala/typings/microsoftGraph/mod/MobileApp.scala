package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileApp
  extends StObject
     with Entity {
  
  // The list of group assignments for this mobile app.
  var assignments: js.UndefOr[NullableOption[js.Array[MobileAppAssignment]]] = js.undefined
  
  // The list of categories for this app.
  var categories: js.UndefOr[NullableOption[js.Array[MobileAppCategory]]] = js.undefined
  
  // The date and time the app was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The description of the app.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The developer of the app.
  var developer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The admin provided or imported title of the app.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The more information Url.
  var informationUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value indicating whether the app is marked as featured by the admin.
  var isFeatured: js.UndefOr[Boolean] = js.undefined
  
  // The large icon, to be displayed in the app details and used for upload of the icon.
  var largeIcon: js.UndefOr[NullableOption[MimeContent]] = js.undefined
  
  // The date and time the app was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // Notes for the app.
  var notes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The owner of the app.
  var owner: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The publisher of the app.
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are:
    * notPublished, processing, published.
    */
  var publishingState: js.UndefOr[MobileAppPublishingState] = js.undefined
}
object MobileApp {
  
  inline def apply(): MobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApp]
  }
  
  extension [Self <: MobileApp](x: Self) {
    
    inline def setAssignments(value: NullableOption[js.Array[MobileAppAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: MobileAppAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    inline def setCategories(value: NullableOption[js.Array[MobileAppCategory]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: MobileAppCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeveloper(value: NullableOption[String]): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperNull: Self = StObject.set(x, "developer", null)
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInformationUrl(value: NullableOption[String]): Self = StObject.set(x, "informationUrl", value.asInstanceOf[js.Any])
    
    inline def setInformationUrlNull: Self = StObject.set(x, "informationUrl", null)
    
    inline def setInformationUrlUndefined: Self = StObject.set(x, "informationUrl", js.undefined)
    
    inline def setIsFeatured(value: Boolean): Self = StObject.set(x, "isFeatured", value.asInstanceOf[js.Any])
    
    inline def setIsFeaturedUndefined: Self = StObject.set(x, "isFeatured", js.undefined)
    
    inline def setLargeIcon(value: NullableOption[MimeContent]): Self = StObject.set(x, "largeIcon", value.asInstanceOf[js.Any])
    
    inline def setLargeIconNull: Self = StObject.set(x, "largeIcon", null)
    
    inline def setLargeIconUndefined: Self = StObject.set(x, "largeIcon", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setNotes(value: NullableOption[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOwner(value: NullableOption[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPrivacyInformationUrl(value: NullableOption[String]): Self = StObject.set(x, "privacyInformationUrl", value.asInstanceOf[js.Any])
    
    inline def setPrivacyInformationUrlNull: Self = StObject.set(x, "privacyInformationUrl", null)
    
    inline def setPrivacyInformationUrlUndefined: Self = StObject.set(x, "privacyInformationUrl", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPublishingState(value: MobileAppPublishingState): Self = StObject.set(x, "publishingState", value.asInstanceOf[js.Any])
    
    inline def setPublishingStateUndefined: Self = StObject.set(x, "publishingState", js.undefined)
  }
}
