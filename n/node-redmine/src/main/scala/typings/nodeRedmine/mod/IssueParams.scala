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
    assigned_to_id: Int | Double = null,
    category_id: Int | Double = null,
    description: String = null,
    notes: String = null,
    parent_issue_id: Int | Double = null,
    priority_id: Int | Double = null,
    project_id: Int | Double = null,
    status_id: Int | Double = null,
    subject: String = null,
    tracker_id: Int | Double = null,
    uploads: js.Array[UploadRecord] = null
  ): IssueParams = {
    val __obj = js.Dynamic.literal()
    if (assigned_to_id != null) __obj.updateDynamic("assigned_to_id")(assigned_to_id.asInstanceOf[js.Any])
    if (category_id != null) __obj.updateDynamic("category_id")(category_id.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parent_issue_id != null) __obj.updateDynamic("parent_issue_id")(parent_issue_id.asInstanceOf[js.Any])
    if (priority_id != null) __obj.updateDynamic("priority_id")(priority_id.asInstanceOf[js.Any])
    if (project_id != null) __obj.updateDynamic("project_id")(project_id.asInstanceOf[js.Any])
    if (status_id != null) __obj.updateDynamic("status_id")(status_id.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (tracker_id != null) __obj.updateDynamic("tracker_id")(tracker_id.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueParams]
  }
}

