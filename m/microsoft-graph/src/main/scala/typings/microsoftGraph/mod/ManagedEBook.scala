package typings.microsoftGraph.mod

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
  implicit class ManagedEBookOps[Self <: ManagedEBook] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: ManagedEBookAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[ManagedEBookAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
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
    def setDeviceStatesVarargs(value: DeviceInstallState*): Self = this.set("deviceStates", js.Array(value :_*))
    
    @scala.inline
    def setDeviceStates(value: NullableOption[js.Array[DeviceInstallState]]): Self = this.set("deviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStates: Self = this.set("deviceStates", js.undefined)
    
    @scala.inline
    def setDeviceStatesNull: Self = this.set("deviceStates", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setInformationUrl(value: NullableOption[String]): Self = this.set("informationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInformationUrl: Self = this.set("informationUrl", js.undefined)
    
    @scala.inline
    def setInformationUrlNull: Self = this.set("informationUrl", null)
    
    @scala.inline
    def setInstallSummary(value: NullableOption[EBookInstallSummary]): Self = this.set("installSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallSummary: Self = this.set("installSummary", js.undefined)
    
    @scala.inline
    def setInstallSummaryNull: Self = this.set("installSummary", null)
    
    @scala.inline
    def setLargeCover(value: NullableOption[MimeContent]): Self = this.set("largeCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeCover: Self = this.set("largeCover", js.undefined)
    
    @scala.inline
    def setLargeCoverNull: Self = this.set("largeCover", null)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPrivacyInformationUrl(value: NullableOption[String]): Self = this.set("privacyInformationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyInformationUrl: Self = this.set("privacyInformationUrl", js.undefined)
    
    @scala.inline
    def setPrivacyInformationUrlNull: Self = this.set("privacyInformationUrl", null)
    
    @scala.inline
    def setPublishedDateTime(value: String): Self = this.set("publishedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedDateTime: Self = this.set("publishedDateTime", js.undefined)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPublisherNull: Self = this.set("publisher", null)
    
    @scala.inline
    def setUserStateSummaryVarargs(value: UserInstallStateSummary*): Self = this.set("userStateSummary", js.Array(value :_*))
    
    @scala.inline
    def setUserStateSummary(value: NullableOption[js.Array[UserInstallStateSummary]]): Self = this.set("userStateSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStateSummary: Self = this.set("userStateSummary", js.undefined)
    
    @scala.inline
    def setUserStateSummaryNull: Self = this.set("userStateSummary", null)
  }
}
