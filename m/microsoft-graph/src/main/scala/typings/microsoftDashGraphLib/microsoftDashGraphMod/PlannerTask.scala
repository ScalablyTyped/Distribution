package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerTask extends Entity {
  /** Number of checklist items with value set to false, representing incomplete items. */
  var activeChecklistItemCount: js.UndefOr[scala.Double] = js.undefined
  /** The categories to which the task has been applied. See applied Categories for possible values. */
  var appliedCategories: js.UndefOr[PlannerAppliedCategories] = js.undefined
  /** Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo. */
  var assignedToTaskBoardFormat: js.UndefOr[PlannerAssignedToTaskBoardTaskFormat] = js.undefined
  /** Hint used to order items of this type in a list view. The format is defined as outlined here. */
  var assigneePriority: js.UndefOr[java.lang.String] = js.undefined
  /** The set of assignees the task is assigned to. */
  var assignments: js.UndefOr[PlannerAssignments] = js.undefined
  /** Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service. */
  var bucketId: js.UndefOr[java.lang.String] = js.undefined
  /** Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket. */
  var bucketTaskBoardFormat: js.UndefOr[PlannerBucketTaskBoardTaskFormat] = js.undefined
  /** Number of checklist items that are present on the task. */
  var checklistItemCount: js.UndefOr[scala.Double] = js.undefined
  /** Identity of the user that completed the task. */
  var completedBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var completedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group. */
  var conversationThreadId: js.UndefOr[java.lang.String] = js.undefined
  /** Identity of the user that created the task. */
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Read-only. Nullable. Additional details about the task. */
  var details: js.UndefOr[PlannerTaskDetails] = js.undefined
  /**
    * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var dueDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Read-only. Value is true if the details object of the task has a non-empty description and false otherwise. */
  var hasDescription: js.UndefOr[scala.Boolean] = js.undefined
  /** Hint used to order items of this type in a list view. The format is defined as outlined here. */
  var orderHint: js.UndefOr[java.lang.String] = js.undefined
  /** Percentage of task completion. When set to 100, the task is considered completed. */
  var percentComplete: js.UndefOr[scala.Double] = js.undefined
  /** Plan ID to which the task belongs. */
  var planId: js.UndefOr[java.lang.String] = js.undefined
  /** This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference. */
  var previewType: js.UndefOr[PlannerPreviewType] = js.undefined
  /** Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress. */
  var progressTaskBoardFormat: js.UndefOr[PlannerProgressTaskBoardTaskFormat] = js.undefined
  /** Number of external references that exist on the task. */
  var referenceCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the task. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerTask {
  @scala.inline
  def apply(
    activeChecklistItemCount: scala.Int | scala.Double = null,
    appliedCategories: PlannerAppliedCategories = null,
    assignedToTaskBoardFormat: PlannerAssignedToTaskBoardTaskFormat = null,
    assigneePriority: java.lang.String = null,
    assignments: PlannerAssignments = null,
    bucketId: java.lang.String = null,
    bucketTaskBoardFormat: PlannerBucketTaskBoardTaskFormat = null,
    checklistItemCount: scala.Int | scala.Double = null,
    completedBy: IdentitySet = null,
    completedDateTime: java.lang.String = null,
    conversationThreadId: java.lang.String = null,
    createdBy: IdentitySet = null,
    createdDateTime: java.lang.String = null,
    details: PlannerTaskDetails = null,
    dueDateTime: java.lang.String = null,
    hasDescription: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    orderHint: java.lang.String = null,
    percentComplete: scala.Int | scala.Double = null,
    planId: java.lang.String = null,
    previewType: PlannerPreviewType = null,
    progressTaskBoardFormat: PlannerProgressTaskBoardTaskFormat = null,
    referenceCount: scala.Int | scala.Double = null,
    startDateTime: java.lang.String = null,
    title: java.lang.String = null
  ): PlannerTask = {
    val __obj = js.Dynamic.literal()
    if (activeChecklistItemCount != null) __obj.updateDynamic("activeChecklistItemCount")(activeChecklistItemCount.asInstanceOf[js.Any])
    if (appliedCategories != null) __obj.updateDynamic("appliedCategories")(appliedCategories)
    if (assignedToTaskBoardFormat != null) __obj.updateDynamic("assignedToTaskBoardFormat")(assignedToTaskBoardFormat)
    if (assigneePriority != null) __obj.updateDynamic("assigneePriority")(assigneePriority)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (bucketId != null) __obj.updateDynamic("bucketId")(bucketId)
    if (bucketTaskBoardFormat != null) __obj.updateDynamic("bucketTaskBoardFormat")(bucketTaskBoardFormat)
    if (checklistItemCount != null) __obj.updateDynamic("checklistItemCount")(checklistItemCount.asInstanceOf[js.Any])
    if (completedBy != null) __obj.updateDynamic("completedBy")(completedBy)
    if (completedDateTime != null) __obj.updateDynamic("completedDateTime")(completedDateTime)
    if (conversationThreadId != null) __obj.updateDynamic("conversationThreadId")(conversationThreadId)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (details != null) __obj.updateDynamic("details")(details)
    if (dueDateTime != null) __obj.updateDynamic("dueDateTime")(dueDateTime)
    if (!js.isUndefined(hasDescription)) __obj.updateDynamic("hasDescription")(hasDescription)
    if (id != null) __obj.updateDynamic("id")(id)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint)
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (planId != null) __obj.updateDynamic("planId")(planId)
    if (previewType != null) __obj.updateDynamic("previewType")(previewType)
    if (progressTaskBoardFormat != null) __obj.updateDynamic("progressTaskBoardFormat")(progressTaskBoardFormat)
    if (referenceCount != null) __obj.updateDynamic("referenceCount")(referenceCount.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlannerTask]
  }
}

