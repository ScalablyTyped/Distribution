package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermsAndConditions extends Entity {
  
  /**
    * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms
    * and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
    */
  var acceptanceStatement: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of acceptance statuses for this T&amp;C policy.
  var acceptanceStatuses: js.UndefOr[NullableOption[js.Array[TermsAndConditionsAcceptanceStatus]]] = js.native
  
  // The list of assignments for this T&amp;C policy.
  var assignments: js.UndefOr[NullableOption[js.Array[TermsAndConditionsAssignment]]] = js.native
  
  /**
    * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user
    * on prompts to accept the T&amp;C policy.
    */
  var bodyText: js.UndefOr[NullableOption[String]] = js.native
  
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Administrator-supplied description of the T&amp;C policy.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Administrator-supplied name for the T&amp;C policy.
  var displayName: js.UndefOr[String] = js.native
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C
    * policy.
    */
  var title: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and
    * wishes to require users to re-accept the modified T&amp;C policy.
    */
  var version: js.UndefOr[Double] = js.native
}
object TermsAndConditions {
  
  @scala.inline
  def apply(): TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditions]
  }
  
  @scala.inline
  implicit class TermsAndConditionsOps[Self <: TermsAndConditions] (val x: Self) extends AnyVal {
    
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
    def setAcceptanceStatement(value: NullableOption[String]): Self = this.set("acceptanceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptanceStatement: Self = this.set("acceptanceStatement", js.undefined)
    
    @scala.inline
    def setAcceptanceStatementNull: Self = this.set("acceptanceStatement", null)
    
    @scala.inline
    def setAcceptanceStatusesVarargs(value: TermsAndConditionsAcceptanceStatus*): Self = this.set("acceptanceStatuses", js.Array(value :_*))
    
    @scala.inline
    def setAcceptanceStatuses(value: NullableOption[js.Array[TermsAndConditionsAcceptanceStatus]]): Self = this.set("acceptanceStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptanceStatuses: Self = this.set("acceptanceStatuses", js.undefined)
    
    @scala.inline
    def setAcceptanceStatusesNull: Self = this.set("acceptanceStatuses", null)
    
    @scala.inline
    def setAssignmentsVarargs(value: TermsAndConditionsAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[TermsAndConditionsAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setBodyText(value: NullableOption[String]): Self = this.set("bodyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyText: Self = this.set("bodyText", js.undefined)
    
    @scala.inline
    def setBodyTextNull: Self = this.set("bodyText", null)
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
