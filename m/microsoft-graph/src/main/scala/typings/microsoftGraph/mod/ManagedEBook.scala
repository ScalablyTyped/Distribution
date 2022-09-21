package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedEBook
  extends StObject
     with Entity {
  
  // The list of assignments for this eBook.
  var assignments: js.UndefOr[NullableOption[js.Array[ManagedEBookAssignment]]] = js.undefined
  
  // The date and time when the eBook file was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Description.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of installation states for this eBook.
  var deviceStates: js.UndefOr[NullableOption[js.Array[DeviceInstallState]]] = js.undefined
  
  // Name of the eBook.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The more information Url.
  var informationUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Mobile App Install Summary.
  var installSummary: js.UndefOr[NullableOption[EBookInstallSummary]] = js.undefined
  
  // Book cover.
  var largeCover: js.UndefOr[NullableOption[MimeContent]] = js.undefined
  
  // The date and time when the eBook was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time when the eBook was published.
  var publishedDateTime: js.UndefOr[String] = js.undefined
  
  // Publisher.
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of installation states for this eBook.
  var userStateSummary: js.UndefOr[NullableOption[js.Array[UserInstallStateSummary]]] = js.undefined
}
object ManagedEBook {
  
  inline def apply(): ManagedEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedEBook]
  }
  
  extension [Self <: ManagedEBook](x: Self) {
    
    inline def setAssignments(value: NullableOption[js.Array[ManagedEBookAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: ManagedEBookAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceStates(value: NullableOption[js.Array[DeviceInstallState]]): Self = StObject.set(x, "deviceStates", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatesNull: Self = StObject.set(x, "deviceStates", null)
    
    inline def setDeviceStatesUndefined: Self = StObject.set(x, "deviceStates", js.undefined)
    
    inline def setDeviceStatesVarargs(value: DeviceInstallState*): Self = StObject.set(x, "deviceStates", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInformationUrl(value: NullableOption[String]): Self = StObject.set(x, "informationUrl", value.asInstanceOf[js.Any])
    
    inline def setInformationUrlNull: Self = StObject.set(x, "informationUrl", null)
    
    inline def setInformationUrlUndefined: Self = StObject.set(x, "informationUrl", js.undefined)
    
    inline def setInstallSummary(value: NullableOption[EBookInstallSummary]): Self = StObject.set(x, "installSummary", value.asInstanceOf[js.Any])
    
    inline def setInstallSummaryNull: Self = StObject.set(x, "installSummary", null)
    
    inline def setInstallSummaryUndefined: Self = StObject.set(x, "installSummary", js.undefined)
    
    inline def setLargeCover(value: NullableOption[MimeContent]): Self = StObject.set(x, "largeCover", value.asInstanceOf[js.Any])
    
    inline def setLargeCoverNull: Self = StObject.set(x, "largeCover", null)
    
    inline def setLargeCoverUndefined: Self = StObject.set(x, "largeCover", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPrivacyInformationUrl(value: NullableOption[String]): Self = StObject.set(x, "privacyInformationUrl", value.asInstanceOf[js.Any])
    
    inline def setPrivacyInformationUrlNull: Self = StObject.set(x, "privacyInformationUrl", null)
    
    inline def setPrivacyInformationUrlUndefined: Self = StObject.set(x, "privacyInformationUrl", js.undefined)
    
    inline def setPublishedDateTime(value: String): Self = StObject.set(x, "publishedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedDateTimeUndefined: Self = StObject.set(x, "publishedDateTime", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setUserStateSummary(value: NullableOption[js.Array[UserInstallStateSummary]]): Self = StObject.set(x, "userStateSummary", value.asInstanceOf[js.Any])
    
    inline def setUserStateSummaryNull: Self = StObject.set(x, "userStateSummary", null)
    
    inline def setUserStateSummaryUndefined: Self = StObject.set(x, "userStateSummary", js.undefined)
    
    inline def setUserStateSummaryVarargs(value: UserInstallStateSummary*): Self = StObject.set(x, "userStateSummary", js.Array(value*))
  }
}
