package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueRecord extends js.Object {
  var assigned_to: IssueRecordField = js.native
  var author: IssueRecordField = js.native
  var closed_on: String | Null = js.native
  var created_at: String = js.native
  var description: String = js.native
  var done_ratio: Double = js.native
  var due_date: String | Null = js.native
  var id: Double = js.native
  var is_private: Boolean = js.native
  var parent: js.UndefOr[IssueRecordField] = js.native
  var priority: IssueRecordField = js.native
  var project: IssueRecordField = js.native
  var start_date: String | Null = js.native
  var status: IssueRecordField = js.native
  var subject: String = js.native
  var total_estimated_hours: Double | Null = js.native
  var tracker: IssueRecordField = js.native
  var updated_at: String | Null = js.native
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
    tracker: IssueRecordField
  ): IssueRecord = {
    val __obj = js.Dynamic.literal(assigned_to = assigned_to.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], done_ratio = done_ratio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueRecord]
  }
  @scala.inline
  implicit class IssueRecordOps[Self <: IssueRecord] (val x: Self) extends AnyVal {
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
    def setAssigned_to(value: IssueRecordField): Self = this.set("assigned_to", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: IssueRecordField): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone_ratio(value: Double): Self = this.set("done_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: IssueRecordField): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: IssueRecordField): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: IssueRecordField): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracker(value: IssueRecordField): Self = this.set("tracker", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_on(value: String): Self = this.set("closed_on", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_onNull: Self = this.set("closed_on", null)
    @scala.inline
    def setDue_date(value: String): Self = this.set("due_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDue_dateNull: Self = this.set("due_date", null)
    @scala.inline
    def setParent(value: IssueRecordField): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setStart_date(value: String): Self = this.set("start_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_dateNull: Self = this.set("start_date", null)
    @scala.inline
    def setTotal_estimated_hours(value: Double): Self = this.set("total_estimated_hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_estimated_hoursNull: Self = this.set("total_estimated_hours", null)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_atNull: Self = this.set("updated_at", null)
  }
  
}

