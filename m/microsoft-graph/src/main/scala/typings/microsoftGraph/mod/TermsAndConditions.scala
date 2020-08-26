package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermsAndConditions extends Entity {
  /**
    * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms
    * and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
    */
  var acceptanceStatement: js.UndefOr[String] = js.native
  // The list of acceptance statuses for this T&amp;C policy.
  var acceptanceStatuses: js.UndefOr[js.Array[TermsAndConditionsAcceptanceStatus]] = js.native
  // The list of assignments for this T&amp;C policy.
  var assignments: js.UndefOr[js.Array[TermsAndConditionsAssignment]] = js.native
  /**
    * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user
    * on prompts to accept the T&amp;C policy.
    */
  var bodyText: js.UndefOr[String] = js.native
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Administrator-supplied description of the T&amp;C policy.
  var description: js.UndefOr[String] = js.native
  // Administrator-supplied name for the T&amp;C policy.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  /**
    * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C
    * policy.
    */
  var title: js.UndefOr[String] = js.native
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
    def setAcceptanceStatement(value: String): Self = this.set("acceptanceStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptanceStatement: Self = this.set("acceptanceStatement", js.undefined)
    @scala.inline
    def setAcceptanceStatusesVarargs(value: TermsAndConditionsAcceptanceStatus*): Self = this.set("acceptanceStatuses", js.Array(value :_*))
    @scala.inline
    def setAcceptanceStatuses(value: js.Array[TermsAndConditionsAcceptanceStatus]): Self = this.set("acceptanceStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptanceStatuses: Self = this.set("acceptanceStatuses", js.undefined)
    @scala.inline
    def setAssignmentsVarargs(value: TermsAndConditionsAssignment*): Self = this.set("assignments", js.Array(value :_*))
    @scala.inline
    def setAssignments(value: js.Array[TermsAndConditionsAssignment]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    @scala.inline
    def setBodyText(value: String): Self = this.set("bodyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyText: Self = this.set("bodyText", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

