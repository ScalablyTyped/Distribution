package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedEBook extends Entity {
  
  // The list of assignments for this eBook.
  var assignments: js.UndefOr[NullableOption[js.Array[ManagedEBookAssignment]]] = js.native
  
  // The date and time when the eBook file was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Description.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of installation states for this eBook.
  var deviceStates: js.UndefOr[NullableOption[js.Array[DeviceInstallState]]] = js.native
  
  // Name of the eBook.
  var displayName: js.UndefOr[String] = js.native
  
  // The more information Url.
  var informationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Mobile App Install Summary.
  var installSummary: js.UndefOr[NullableOption[EBookInstallSummary]] = js.native
  
  // Book cover.
  var largeCover: js.UndefOr[NullableOption[MimeContent]] = js.native
  
  // The date and time when the eBook was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The date and time when the eBook was published.
  var publishedDateTime: js.UndefOr[String] = js.native
  
  // Publisher.
  var publisher: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of installation states for this eBook.
  var userStateSummary: js.UndefOr[NullableOption[js.Array[UserInstallStateSummary]]] = js.native
}
object ManagedEBook {
  
  @scala.inline
  def apply(): ManagedEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedEBook]
  }
  
  @scala.inline
  implicit class ManagedEBookMutableBuilder[Self <: ManagedEBook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[ManagedEBookAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: ManagedEBookAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDeviceStates(value: NullableOption[js.Array[DeviceInstallState]]): Self = StObject.set(x, "deviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatesNull: Self = StObject.set(x, "deviceStates", null)
    
    @scala.inline
    def setDeviceStatesUndefined: Self = StObject.set(x, "deviceStates", js.undefined)
    
    @scala.inline
    def setDeviceStatesVarargs(value: DeviceInstallState*): Self = StObject.set(x, "deviceStates", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setInformationUrl(value: NullableOption[String]): Self = StObject.set(x, "informationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationUrlNull: Self = StObject.set(x, "informationUrl", null)
    
    @scala.inline
    def setInformationUrlUndefined: Self = StObject.set(x, "informationUrl", js.undefined)
    
    @scala.inline
    def setInstallSummary(value: NullableOption[EBookInstallSummary]): Self = StObject.set(x, "installSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallSummaryNull: Self = StObject.set(x, "installSummary", null)
    
    @scala.inline
    def setInstallSummaryUndefined: Self = StObject.set(x, "installSummary", js.undefined)
    
    @scala.inline
    def setLargeCover(value: NullableOption[MimeContent]): Self = StObject.set(x, "largeCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeCoverNull: Self = StObject.set(x, "largeCover", null)
    
    @scala.inline
    def setLargeCoverUndefined: Self = StObject.set(x, "largeCover", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPrivacyInformationUrl(value: NullableOption[String]): Self = StObject.set(x, "privacyInformationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyInformationUrlNull: Self = StObject.set(x, "privacyInformationUrl", null)
    
    @scala.inline
    def setPrivacyInformationUrlUndefined: Self = StObject.set(x, "privacyInformationUrl", js.undefined)
    
    @scala.inline
    def setPublishedDateTime(value: String): Self = StObject.set(x, "publishedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDateTimeUndefined: Self = StObject.set(x, "publishedDateTime", js.undefined)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setUserStateSummary(value: NullableOption[js.Array[UserInstallStateSummary]]): Self = StObject.set(x, "userStateSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStateSummaryNull: Self = StObject.set(x, "userStateSummary", null)
    
    @scala.inline
    def setUserStateSummaryUndefined: Self = StObject.set(x, "userStateSummary", js.undefined)
    
    @scala.inline
    def setUserStateSummaryVarargs(value: UserInstallStateSummary*): Self = StObject.set(x, "userStateSummary", js.Array(value :_*))
  }
}
