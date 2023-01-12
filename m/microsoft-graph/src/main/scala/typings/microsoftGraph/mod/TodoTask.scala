package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodoTask
  extends StObject
     with Entity {
  
  var attachmentSessions: js.UndefOr[NullableOption[js.Array[AttachmentSession]]] = js.undefined
  
  var attachments: js.UndefOr[NullableOption[js.Array[AttachmentBase]]] = js.undefined
  
  // The task body that typically contains information about the task.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  /**
    * The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in
    * the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan
    * 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
    */
  var bodyLastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory
    * that the user has defined.
    */
  var categories: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // A collection of checklistItems linked to a task.
  var checklistItems: js.UndefOr[NullableOption[js.Array[ChecklistItem]]] = js.undefined
  
  // The date and time in the specified time zone that the task was finished.
  var completedDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  /**
    * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the
    * request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this:
    * '2020-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The date and time in the specified time zone that the task is to be finished.
  var dueDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The collection of open extensions defined for the task. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
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
  
  // The date and time in the specified time zone for a reminder alert of the task to occur.
  var reminderDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  var startDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  /**
    * Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers,
    * deferred.
    */
  var status: js.UndefOr[TaskStatus] = js.undefined
  
  // A brief description of the task.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
}
object TodoTask {
  
  inline def apply(): TodoTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TodoTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TodoTask] (val x: Self) extends AnyVal {
    
    inline def setAttachmentSessions(value: NullableOption[js.Array[AttachmentSession]]): Self = StObject.set(x, "attachmentSessions", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSessionsNull: Self = StObject.set(x, "attachmentSessions", null)
    
    inline def setAttachmentSessionsUndefined: Self = StObject.set(x, "attachmentSessions", js.undefined)
    
    inline def setAttachmentSessionsVarargs(value: AttachmentSession*): Self = StObject.set(x, "attachmentSessions", js.Array(value*))
    
    inline def setAttachments(value: NullableOption[js.Array[AttachmentBase]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AttachmentBase*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyLastModifiedDateTime(value: String): Self = StObject.set(x, "bodyLastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setBodyLastModifiedDateTimeUndefined: Self = StObject.set(x, "bodyLastModifiedDateTime", js.undefined)
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setChecklistItems(value: NullableOption[js.Array[ChecklistItem]]): Self = StObject.set(x, "checklistItems", value.asInstanceOf[js.Any])
    
    inline def setChecklistItemsNull: Self = StObject.set(x, "checklistItems", null)
    
    inline def setChecklistItemsUndefined: Self = StObject.set(x, "checklistItems", js.undefined)
    
    inline def setChecklistItemsVarargs(value: ChecklistItem*): Self = StObject.set(x, "checklistItems", js.Array(value*))
    
    inline def setCompletedDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDueDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDueDateTimeNull: Self = StObject.set(x, "dueDateTime", null)
    
    inline def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setHasAttachments(value: NullableOption[Boolean]): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsNull: Self = StObject.set(x, "hasAttachments", null)
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setImportance(value: Importance): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setIsReminderOn(value: Boolean): Self = StObject.set(x, "isReminderOn", value.asInstanceOf[js.Any])
    
    inline def setIsReminderOnUndefined: Self = StObject.set(x, "isReminderOn", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLinkedResources(value: NullableOption[js.Array[LinkedResource]]): Self = StObject.set(x, "linkedResources", value.asInstanceOf[js.Any])
    
    inline def setLinkedResourcesNull: Self = StObject.set(x, "linkedResources", null)
    
    inline def setLinkedResourcesUndefined: Self = StObject.set(x, "linkedResources", js.undefined)
    
    inline def setLinkedResourcesVarargs(value: LinkedResource*): Self = StObject.set(x, "linkedResources", js.Array(value*))
    
    inline def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setReminderDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "reminderDateTime", value.asInstanceOf[js.Any])
    
    inline def setReminderDateTimeNull: Self = StObject.set(x, "reminderDateTime", null)
    
    inline def setReminderDateTimeUndefined: Self = StObject.set(x, "reminderDateTime", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
