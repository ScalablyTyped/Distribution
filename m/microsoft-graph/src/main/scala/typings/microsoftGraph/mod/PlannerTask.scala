package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerTask
  extends StObject
     with Entity {
  
  // Number of checklist items with value set to false, representing incomplete items.
  var activeChecklistItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The categories to which the task has been applied. See applied Categories for possible values.
  var appliedCategories: js.UndefOr[NullableOption[PlannerAppliedCategories]] = js.undefined
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
  var assignedToTaskBoardFormat: js.UndefOr[NullableOption[PlannerAssignedToTaskBoardTaskFormat]] = js.undefined
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var assigneePriority: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The set of assignees the task is assigned to.
  var assignments: js.UndefOr[NullableOption[PlannerAssignments]] = js.undefined
  
  /**
    * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long
    * and case-sensitive. Format validation is done on the service.
    */
  var bucketId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
  var bucketTaskBoardFormat: js.UndefOr[NullableOption[PlannerBucketTaskBoardTaskFormat]] = js.undefined
  
  // Number of checklist items that are present on the task.
  var checklistItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Identity of the user that completed the task.
  var completedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z
    */
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
  var conversationThreadId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the user that created the task.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable. Additional details about the task.
  var details: js.UndefOr[NullableOption[PlannerTaskDetails]] = js.undefined
  
  /**
    * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var dueDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
  var hasDescription: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Percentage of task completion. When set to 100, the task is considered completed.
  var percentComplete: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Plan ID to which the task belongs.
  var planId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference.
    */
  var previewType: js.UndefOr[NullableOption[PlannerPreviewType]] = js.undefined
  
  /**
    * Priority of the task. The valid range of values is between 0 and 10, with the increasing value being lower priority (0
    * has the highest priority and 10 has the lowest priority). Currently, Planner interprets values 0 and 1 as 'urgent', 2,
    * 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'. Additionally, Planner sets the value 1 for
    * 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
    */
  var priority: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
  var progressTaskBoardFormat: js.UndefOr[NullableOption[PlannerProgressTaskBoardTaskFormat]] = js.undefined
  
  // Number of external references that exist on the task.
  var referenceCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Title of the task.
  var title: js.UndefOr[String] = js.undefined
}
object PlannerTask {
  
  inline def apply(): PlannerTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerTask]
  }
  
  extension [Self <: PlannerTask](x: Self) {
    
    inline def setActiveChecklistItemCount(value: NullableOption[Double]): Self = StObject.set(x, "activeChecklistItemCount", value.asInstanceOf[js.Any])
    
    inline def setActiveChecklistItemCountNull: Self = StObject.set(x, "activeChecklistItemCount", null)
    
    inline def setActiveChecklistItemCountUndefined: Self = StObject.set(x, "activeChecklistItemCount", js.undefined)
    
    inline def setAppliedCategories(value: NullableOption[PlannerAppliedCategories]): Self = StObject.set(x, "appliedCategories", value.asInstanceOf[js.Any])
    
    inline def setAppliedCategoriesNull: Self = StObject.set(x, "appliedCategories", null)
    
    inline def setAppliedCategoriesUndefined: Self = StObject.set(x, "appliedCategories", js.undefined)
    
    inline def setAssignedToTaskBoardFormat(value: NullableOption[PlannerAssignedToTaskBoardTaskFormat]): Self = StObject.set(x, "assignedToTaskBoardFormat", value.asInstanceOf[js.Any])
    
    inline def setAssignedToTaskBoardFormatNull: Self = StObject.set(x, "assignedToTaskBoardFormat", null)
    
    inline def setAssignedToTaskBoardFormatUndefined: Self = StObject.set(x, "assignedToTaskBoardFormat", js.undefined)
    
    inline def setAssigneePriority(value: NullableOption[String]): Self = StObject.set(x, "assigneePriority", value.asInstanceOf[js.Any])
    
    inline def setAssigneePriorityNull: Self = StObject.set(x, "assigneePriority", null)
    
    inline def setAssigneePriorityUndefined: Self = StObject.set(x, "assigneePriority", js.undefined)
    
    inline def setAssignments(value: NullableOption[PlannerAssignments]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setBucketId(value: NullableOption[String]): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setBucketIdNull: Self = StObject.set(x, "bucketId", null)
    
    inline def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    inline def setBucketTaskBoardFormat(value: NullableOption[PlannerBucketTaskBoardTaskFormat]): Self = StObject.set(x, "bucketTaskBoardFormat", value.asInstanceOf[js.Any])
    
    inline def setBucketTaskBoardFormatNull: Self = StObject.set(x, "bucketTaskBoardFormat", null)
    
    inline def setBucketTaskBoardFormatUndefined: Self = StObject.set(x, "bucketTaskBoardFormat", js.undefined)
    
    inline def setChecklistItemCount(value: NullableOption[Double]): Self = StObject.set(x, "checklistItemCount", value.asInstanceOf[js.Any])
    
    inline def setChecklistItemCountNull: Self = StObject.set(x, "checklistItemCount", null)
    
    inline def setChecklistItemCountUndefined: Self = StObject.set(x, "checklistItemCount", js.undefined)
    
    inline def setCompletedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "completedBy", value.asInstanceOf[js.Any])
    
    inline def setCompletedByNull: Self = StObject.set(x, "completedBy", null)
    
    inline def setCompletedByUndefined: Self = StObject.set(x, "completedBy", js.undefined)
    
    inline def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setConversationThreadId(value: NullableOption[String]): Self = StObject.set(x, "conversationThreadId", value.asInstanceOf[js.Any])
    
    inline def setConversationThreadIdNull: Self = StObject.set(x, "conversationThreadId", null)
    
    inline def setConversationThreadIdUndefined: Self = StObject.set(x, "conversationThreadId", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDetails(value: NullableOption[PlannerTaskDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDueDateTime(value: NullableOption[String]): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDueDateTimeNull: Self = StObject.set(x, "dueDateTime", null)
    
    inline def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    inline def setHasDescription(value: NullableOption[Boolean]): Self = StObject.set(x, "hasDescription", value.asInstanceOf[js.Any])
    
    inline def setHasDescriptionNull: Self = StObject.set(x, "hasDescription", null)
    
    inline def setHasDescriptionUndefined: Self = StObject.set(x, "hasDescription", js.undefined)
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    inline def setPercentComplete(value: NullableOption[Double]): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteNull: Self = StObject.set(x, "percentComplete", null)
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPlanId(value: NullableOption[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPlanIdNull: Self = StObject.set(x, "planId", null)
    
    inline def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    inline def setPreviewType(value: NullableOption[PlannerPreviewType]): Self = StObject.set(x, "previewType", value.asInstanceOf[js.Any])
    
    inline def setPreviewTypeNull: Self = StObject.set(x, "previewType", null)
    
    inline def setPreviewTypeUndefined: Self = StObject.set(x, "previewType", js.undefined)
    
    inline def setPriority(value: NullableOption[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProgressTaskBoardFormat(value: NullableOption[PlannerProgressTaskBoardTaskFormat]): Self = StObject.set(x, "progressTaskBoardFormat", value.asInstanceOf[js.Any])
    
    inline def setProgressTaskBoardFormatNull: Self = StObject.set(x, "progressTaskBoardFormat", null)
    
    inline def setProgressTaskBoardFormatUndefined: Self = StObject.set(x, "progressTaskBoardFormat", js.undefined)
    
    inline def setReferenceCount(value: NullableOption[Double]): Self = StObject.set(x, "referenceCount", value.asInstanceOf[js.Any])
    
    inline def setReferenceCountNull: Self = StObject.set(x, "referenceCount", null)
    
    inline def setReferenceCountUndefined: Self = StObject.set(x, "referenceCount", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
