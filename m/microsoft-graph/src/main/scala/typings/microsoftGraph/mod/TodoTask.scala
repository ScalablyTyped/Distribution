package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodoTask
  extends StObject
     with Entity {
  
  // The task body that typically contains information about the task.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  /**
    * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1,
    * 2020 would look like this: '2020-01-01T00:00:00Z'.
    */
  var bodyLastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The date in the specified time zone that the task was finished.
  var completedDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  /**
    * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this:
    * '2020-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The date in the specified time zone that the task is to be finished.
  var dueDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The collection of open extensions defined for the task. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // The importance of the task. Possible values are: low, normal, high.
  var importance: js.UndefOr[Importance] = js.undefined
  
  // Set to true if an alert is set to remind the user of the task.
  var isReminderOn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1,
    * 2020 would look like this: '2020-01-01T00:00:00Z'.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // A collection of resources linked to the task.
  var linkedResources: js.UndefOr[NullableOption[js.Array[LinkedResource]]] = js.undefined
  
  // The recurrence pattern for the task.
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  // The date and time for a reminder alert of the task to occur.
  var reminderDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  /**
    * Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers,
    * deferred.
    */
  var status: js.UndefOr[TaskStatus] = js.undefined
  
  // A brief description of the task.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
}
object TodoTask {
  
  @scala.inline
  def apply(): TodoTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TodoTask]
  }
  
  @scala.inline
  implicit class TodoTaskMutableBuilder[Self <: TodoTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyLastModifiedDateTime(value: String): Self = StObject.set(x, "bodyLastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyLastModifiedDateTimeUndefined: Self = StObject.set(x, "bodyLastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCompletedDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    @scala.inline
    def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDueDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateTimeNull: Self = StObject.set(x, "dueDateTime", null)
    
    @scala.inline
    def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setImportance(value: Importance): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setIsReminderOn(value: Boolean): Self = StObject.set(x, "isReminderOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReminderOnUndefined: Self = StObject.set(x, "isReminderOn", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLinkedResources(value: NullableOption[js.Array[LinkedResource]]): Self = StObject.set(x, "linkedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedResourcesNull: Self = StObject.set(x, "linkedResources", null)
    
    @scala.inline
    def setLinkedResourcesUndefined: Self = StObject.set(x, "linkedResources", js.undefined)
    
    @scala.inline
    def setLinkedResourcesVarargs(value: LinkedResource*): Self = StObject.set(x, "linkedResources", js.Array(value :_*))
    
    @scala.inline
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    @scala.inline
    def setReminderDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "reminderDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderDateTimeNull: Self = StObject.set(x, "reminderDateTime", null)
    
    @scala.inline
    def setReminderDateTimeUndefined: Self = StObject.set(x, "reminderDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
