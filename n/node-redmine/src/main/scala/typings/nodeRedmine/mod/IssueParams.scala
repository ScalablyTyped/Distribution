package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueParams extends js.Object {
  var assigned_to_id: js.UndefOr[Double] = js.undefined
  var category_id: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var parent_issue_id: js.UndefOr[Double] = js.undefined
  var priority_id: js.UndefOr[Double] = js.undefined
  var project_id: js.UndefOr[Double] = js.undefined
  var status_id: js.UndefOr[Double] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var tracker_id: js.UndefOr[Double] = js.undefined
  var uploads: js.UndefOr[js.Array[UploadRecord]] = js.undefined
}

object IssueParams {
  @scala.inline
  def apply(
    assigned_to_id: js.UndefOr[Double] = js.undefined,
    category_id: js.UndefOr[Double] = js.undefined,
    description: String = null,
    notes: String = null,
    parent_issue_id: js.UndefOr[Double] = js.undefined,
    priority_id: js.UndefOr[Double] = js.undefined,
    project_id: js.UndefOr[Double] = js.undefined,
    status_id: js.UndefOr[Double] = js.undefined,
    subject: String = null,
    tracker_id: js.UndefOr[Double] = js.undefined,
    uploads: js.Array[UploadRecord] = null
  ): IssueParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assigned_to_id)) __obj.updateDynamic("assigned_to_id")(assigned_to_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(category_id)) __obj.updateDynamic("category_id")(category_id.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(parent_issue_id)) __obj.updateDynamic("parent_issue_id")(parent_issue_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority_id)) __obj.updateDynamic("priority_id")(priority_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(project_id)) __obj.updateDynamic("project_id")(project_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status_id)) __obj.updateDynamic("status_id")(status_id.get.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (!js.isUndefined(tracker_id)) __obj.updateDynamic("tracker_id")(tracker_id.get.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueParams]
  }
}

