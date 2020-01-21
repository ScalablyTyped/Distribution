package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueRecord extends js.Object {
  var assigned_to: IssueRecordField
  var author: IssueRecordField
  var closed_on: String | Null
  var created_at: String
  var description: String
  var done_ratio: Double
  var due_date: String | Null
  var id: Double
  var is_private: Boolean
  var parent: js.UndefOr[IssueRecordField] = js.undefined
  var priority: IssueRecordField
  var project: IssueRecordField
  var start_date: String | Null
  var status: IssueRecordField
  var subject: String
  var total_estimated_hours: Double | Null
  var tracker: IssueRecordField
  var updated_at: String | Null
}

object IssueRecord {
  @scala.inline
  def apply(
    assigned_to: IssueRecordField,
    author: IssueRecordField,
    created_at: String,
    description: String,
    done_ratio: Double,
    id: Double,
    is_private: Boolean,
    priority: IssueRecordField,
    project: IssueRecordField,
    status: IssueRecordField,
    subject: String,
    tracker: IssueRecordField,
    closed_on: String = null,
    due_date: String = null,
    parent: IssueRecordField = null,
    start_date: String = null,
    total_estimated_hours: Int | Double = null,
    updated_at: String = null
  ): IssueRecord = {
    val __obj = js.Dynamic.literal(assigned_to = assigned_to.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], done_ratio = done_ratio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    if (closed_on != null) __obj.updateDynamic("closed_on")(closed_on.asInstanceOf[js.Any])
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (start_date != null) __obj.updateDynamic("start_date")(start_date.asInstanceOf[js.Any])
    if (total_estimated_hours != null) __obj.updateDynamic("total_estimated_hours")(total_estimated_hours.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueRecord]
  }
}

