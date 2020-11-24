package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerTask extends Entity {
  
  // Number of checklist items with value set to false, representing incomplete items.
  var activeChecklistItemCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The categories to which the task has been applied. See applied Categories for possible values.
  var appliedCategories: js.UndefOr[NullableOption[PlannerAppliedCategories]] = js.native
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
  var assignedToTaskBoardFormat: js.UndefOr[NullableOption[PlannerAssignedToTaskBoardTaskFormat]] = js.native
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var assigneePriority: js.UndefOr[NullableOption[String]] = js.native
  
  // The set of assignees the task is assigned to.
  var assignments: js.UndefOr[NullableOption[PlannerAssignments]] = js.native
  
  /**
    * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long
    * and case-sensitive. Format validation is done on the service.
    */
  var bucketId: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
  var bucketTaskBoardFormat: js.UndefOr[NullableOption[PlannerBucketTaskBoardTaskFormat]] = js.native
  
  // Number of checklist items that are present on the task.
  var checklistItemCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Identity of the user that completed the task.
  var completedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
  var conversationThreadId: js.UndefOr[NullableOption[String]] = js.native
  
  // Identity of the user that created the task.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable. Additional details about the task.
  var details: js.UndefOr[NullableOption[PlannerTaskDetails]] = js.native
  
  /**
    * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var dueDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
  var hasDescription: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.native
  
  // Percentage of task completion. When set to 100, the task is considered completed.
  var percentComplete: js.UndefOr[NullableOption[Double]] = js.native
  
  // Plan ID to which the task belongs.
  var planId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference.
    */
  var previewType: js.UndefOr[NullableOption[PlannerPreviewType]] = js.native
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
  var progressTaskBoardFormat: js.UndefOr[NullableOption[PlannerProgressTaskBoardTaskFormat]] = js.native
  
  // Number of external references that exist on the task.
  var referenceCount: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
  
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
    def setActiveChecklistItemCount(value: NullableOption[Double]): Self = this.set("activeChecklistItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveChecklistItemCount: Self = this.set("activeChecklistItemCount", js.undefined)
    
    @scala.inline
    def setActiveChecklistItemCountNull: Self = this.set("activeChecklistItemCount", null)
    
    @scala.inline
    def setAppliedCategories(value: NullableOption[PlannerAppliedCategories]): Self = this.set("appliedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedCategories: Self = this.set("appliedCategories", js.undefined)
    
    @scala.inline
    def setAppliedCategoriesNull: Self = this.set("appliedCategories", null)
    
    @scala.inline
    def setAssignedToTaskBoardFormat(value: NullableOption[PlannerAssignedToTaskBoardTaskFormat]): Self = this.set("assignedToTaskBoardFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedToTaskBoardFormat: Self = this.set("assignedToTaskBoardFormat", js.undefined)
    
    @scala.inline
    def setAssignedToTaskBoardFormatNull: Self = this.set("assignedToTaskBoardFormat", null)
    
    @scala.inline
    def setAssigneePriority(value: NullableOption[String]): Self = this.set("assigneePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneePriority: Self = this.set("assigneePriority", js.undefined)
    
    @scala.inline
    def setAssigneePriorityNull: Self = this.set("assigneePriority", null)
    
    @scala.inline
    def setAssignments(value: NullableOption[PlannerAssignments]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setBucketId(value: NullableOption[String]): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketId: Self = this.set("bucketId", js.undefined)
    
    @scala.inline
    def setBucketIdNull: Self = this.set("bucketId", null)
    
    @scala.inline
    def setBucketTaskBoardFormat(value: NullableOption[PlannerBucketTaskBoardTaskFormat]): Self = this.set("bucketTaskBoardFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketTaskBoardFormat: Self = this.set("bucketTaskBoardFormat", js.undefined)
    
    @scala.inline
    def setBucketTaskBoardFormatNull: Self = this.set("bucketTaskBoardFormat", null)
    
    @scala.inline
    def setChecklistItemCount(value: NullableOption[Double]): Self = this.set("checklistItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecklistItemCount: Self = this.set("checklistItemCount", js.undefined)
    
    @scala.inline
    def setChecklistItemCountNull: Self = this.set("checklistItemCount", null)
    
    @scala.inline
    def setCompletedBy(value: NullableOption[IdentitySet]): Self = this.set("completedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedBy: Self = this.set("completedBy", js.undefined)
    
    @scala.inline
    def setCompletedByNull: Self = this.set("completedBy", null)
    
    @scala.inline
    def setCompletedDateTime(value: NullableOption[String]): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    
    @scala.inline
    def setCompletedDateTimeNull: Self = this.set("completedDateTime", null)
    
    @scala.inline
    def setConversationThreadId(value: NullableOption[String]): Self = this.set("conversationThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationThreadId: Self = this.set("conversationThreadId", js.undefined)
    
    @scala.inline
    def setConversationThreadIdNull: Self = this.set("conversationThreadId", null)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setDetails(value: NullableOption[PlannerTaskDetails]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    
    @scala.inline
    def setDueDateTime(value: NullableOption[String]): Self = this.set("dueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDateTime: Self = this.set("dueDateTime", js.undefined)
    
    @scala.inline
    def setDueDateTimeNull: Self = this.set("dueDateTime", null)
    
    @scala.inline
    def setHasDescription(value: NullableOption[Boolean]): Self = this.set("hasDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDescription: Self = this.set("hasDescription", js.undefined)
    
    @scala.inline
    def setHasDescriptionNull: Self = this.set("hasDescription", null)
    
    @scala.inline
    def setOrderHint(value: NullableOption[String]): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    
    @scala.inline
    def setOrderHintNull: Self = this.set("orderHint", null)
    
    @scala.inline
    def setPercentComplete(value: NullableOption[Double]): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setPercentCompleteNull: Self = this.set("percentComplete", null)
    
    @scala.inline
    def setPlanId(value: NullableOption[String]): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    
    @scala.inline
    def setPlanIdNull: Self = this.set("planId", null)
    
    @scala.inline
    def setPreviewType(value: NullableOption[PlannerPreviewType]): Self = this.set("previewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewType: Self = this.set("previewType", js.undefined)
    
    @scala.inline
    def setPreviewTypeNull: Self = this.set("previewType", null)
    
    @scala.inline
    def setProgressTaskBoardFormat(value: NullableOption[PlannerProgressTaskBoardTaskFormat]): Self = this.set("progressTaskBoardFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressTaskBoardFormat: Self = this.set("progressTaskBoardFormat", js.undefined)
    
    @scala.inline
    def setProgressTaskBoardFormatNull: Self = this.set("progressTaskBoardFormat", null)
    
    @scala.inline
    def setReferenceCount(value: NullableOption[Double]): Self = this.set("referenceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceCount: Self = this.set("referenceCount", js.undefined)
    
    @scala.inline
    def setReferenceCountNull: Self = this.set("referenceCount", null)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTimeNull: Self = this.set("startDateTime", null)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
