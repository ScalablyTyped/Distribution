package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerTask extends Entity {
  // Number of checklist items with value set to false, representing incomplete items.
  var activeChecklistItemCount: js.UndefOr[Double] = js.native
  // The categories to which the task has been applied. See applied Categories for possible values.
  var appliedCategories: js.UndefOr[PlannerAppliedCategories] = js.native
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
  var assignedToTaskBoardFormat: js.UndefOr[PlannerAssignedToTaskBoardTaskFormat] = js.native
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var assigneePriority: js.UndefOr[String] = js.native
  // The set of assignees the task is assigned to.
  var assignments: js.UndefOr[PlannerAssignments] = js.native
  /**
    * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long
    * and case-sensitive. Format validation is done on the service.
    */
  var bucketId: js.UndefOr[String] = js.native
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
  var bucketTaskBoardFormat: js.UndefOr[PlannerBucketTaskBoardTaskFormat] = js.native
  // Number of checklist items that are present on the task.
  var checklistItemCount: js.UndefOr[Double] = js.native
  // Identity of the user that completed the task.
  var completedBy: js.UndefOr[IdentitySet] = js.native
  /**
    * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var completedDateTime: js.UndefOr[String] = js.native
  // Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
  var conversationThreadId: js.UndefOr[String] = js.native
  // Identity of the user that created the task.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  /**
    * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // Read-only. Nullable. Additional details about the task.
  var details: js.UndefOr[PlannerTaskDetails] = js.native
  /**
    * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var dueDateTime: js.UndefOr[String] = js.native
  // Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
  var hasDescription: js.UndefOr[Boolean] = js.native
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
  // Percentage of task completion. When set to 100, the task is considered completed.
  var percentComplete: js.UndefOr[Double] = js.native
  // Plan ID to which the task belongs.
  var planId: js.UndefOr[String] = js.native
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference.
    */
  var previewType: js.UndefOr[PlannerPreviewType] = js.native
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
  var progressTaskBoardFormat: js.UndefOr[PlannerProgressTaskBoardTaskFormat] = js.native
  // Number of external references that exist on the task.
  var referenceCount: js.UndefOr[Double] = js.native
  /**
    * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.native
  // Title of the task.
  var title: js.UndefOr[String] = js.native
}

object PlannerTask {
  @scala.inline
  def apply(): PlannerTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerTask]
  }
  @scala.inline
  implicit class PlannerTaskOps[Self <: PlannerTask] (val x: Self) extends AnyVal {
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
    def setActiveChecklistItemCount(value: Double): Self = this.set("activeChecklistItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveChecklistItemCount: Self = this.set("activeChecklistItemCount", js.undefined)
    @scala.inline
    def setAppliedCategories(value: PlannerAppliedCategories): Self = this.set("appliedCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedCategories: Self = this.set("appliedCategories", js.undefined)
    @scala.inline
    def setAssignedToTaskBoardFormat(value: PlannerAssignedToTaskBoardTaskFormat): Self = this.set("assignedToTaskBoardFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedToTaskBoardFormat: Self = this.set("assignedToTaskBoardFormat", js.undefined)
    @scala.inline
    def setAssigneePriority(value: String): Self = this.set("assigneePriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssigneePriority: Self = this.set("assigneePriority", js.undefined)
    @scala.inline
    def setAssignments(value: PlannerAssignments): Self = this.set("assignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    @scala.inline
    def setBucketId(value: String): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketId: Self = this.set("bucketId", js.undefined)
    @scala.inline
    def setBucketTaskBoardFormat(value: PlannerBucketTaskBoardTaskFormat): Self = this.set("bucketTaskBoardFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketTaskBoardFormat: Self = this.set("bucketTaskBoardFormat", js.undefined)
    @scala.inline
    def setChecklistItemCount(value: Double): Self = this.set("checklistItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecklistItemCount: Self = this.set("checklistItemCount", js.undefined)
    @scala.inline
    def setCompletedBy(value: IdentitySet): Self = this.set("completedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedBy: Self = this.set("completedBy", js.undefined)
    @scala.inline
    def setCompletedDateTime(value: String): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    @scala.inline
    def setConversationThreadId(value: String): Self = this.set("conversationThreadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversationThreadId: Self = this.set("conversationThreadId", js.undefined)
    @scala.inline
    def setCreatedBy(value: IdentitySet): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDetails(value: PlannerTaskDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDueDateTime(value: String): Self = this.set("dueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueDateTime: Self = this.set("dueDateTime", js.undefined)
    @scala.inline
    def setHasDescription(value: Boolean): Self = this.set("hasDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDescription: Self = this.set("hasDescription", js.undefined)
    @scala.inline
    def setOrderHint(value: String): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    @scala.inline
    def setPreviewType(value: PlannerPreviewType): Self = this.set("previewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewType: Self = this.set("previewType", js.undefined)
    @scala.inline
    def setProgressTaskBoardFormat(value: PlannerProgressTaskBoardTaskFormat): Self = this.set("progressTaskBoardFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressTaskBoardFormat: Self = this.set("progressTaskBoardFormat", js.undefined)
    @scala.inline
    def setReferenceCount(value: Double): Self = this.set("referenceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceCount: Self = this.set("referenceCount", js.undefined)
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

