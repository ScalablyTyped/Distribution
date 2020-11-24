package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TodoTask extends Entity {
  
  // The task body that typically contains information about the task.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.native
  
  /**
    * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1,
    * 2020 would look like this: '2020-01-01T00:00:00Z'.
    */
  var bodyLastModifiedDateTime: js.UndefOr[String] = js.native
  
  // The date in the specified time zone that the task was finished.
  var completedDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  /**
    * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this:
    * '2020-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  // The date in the specified time zone that the task is to be finished.
  var dueDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The collection of open extensions defined for the task. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  // The importance of the task. Possible values are: low, normal, high.
  var importance: js.UndefOr[Importance] = js.native
  
  // Set to true if an alert is set to remind the user of the task.
  var isReminderOn: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1,
    * 2020 would look like this: '2020-01-01T00:00:00Z'.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // A collection of resources linked to the task.
  var linkedResources: js.UndefOr[NullableOption[js.Array[LinkedResource]]] = js.native
  
  // The recurrence pattern for the task.
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.native
  
  // The date and time for a reminder alert of the task to occur.
  var reminderDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  /**
    * Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers,
    * deferred.
    */
  var status: js.UndefOr[TaskStatus] = js.native
  
  // A brief description of the task.
  var title: js.UndefOr[NullableOption[String]] = js.native
}
object TodoTask {
  
  @scala.inline
  def apply(): TodoTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TodoTask]
  }
  
  @scala.inline
  implicit class TodoTaskOps[Self <: TodoTask] (val x: Self) extends AnyVal {
    
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
    def setBody(value: NullableOption[ItemBody]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setBodyLastModifiedDateTime(value: String): Self = this.set("bodyLastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLastModifiedDateTime: Self = this.set("bodyLastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setCompletedDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    
    @scala.inline
    def setCompletedDateTimeNull: Self = this.set("completedDateTime", null)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setDueDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("dueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDateTime: Self = this.set("dueDateTime", js.undefined)
    
    @scala.inline
    def setDueDateTimeNull: Self = this.set("dueDateTime", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setImportance(value: Importance): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    
    @scala.inline
    def setIsReminderOn(value: Boolean): Self = this.set("isReminderOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReminderOn: Self = this.set("isReminderOn", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLinkedResourcesVarargs(value: LinkedResource*): Self = this.set("linkedResources", js.Array(value :_*))
    
    @scala.inline
    def setLinkedResources(value: NullableOption[js.Array[LinkedResource]]): Self = this.set("linkedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedResources: Self = this.set("linkedResources", js.undefined)
    
    @scala.inline
    def setLinkedResourcesNull: Self = this.set("linkedResources", null)
    
    @scala.inline
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setRecurrenceNull: Self = this.set("recurrence", null)
    
    @scala.inline
    def setReminderDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("reminderDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderDateTime: Self = this.set("reminderDateTime", js.undefined)
    
    @scala.inline
    def setReminderDateTimeNull: Self = this.set("reminderDateTime", null)
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
