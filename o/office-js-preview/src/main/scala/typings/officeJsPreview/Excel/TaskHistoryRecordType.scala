package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskHistoryRecordType extends StObject
/**
  *
  * Represents the type of change recorded in the task history record.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TaskHistoryRecordType")
@js.native
object TaskHistoryRecordType extends StObject {
  
  /**
    * Represents a user being assigned to a task.
    *
    */
  @js.native
  sealed trait assign extends TaskHistoryRecordType
  
  /**
    * Represents the creation of a new task.
    *
    */
  @js.native
  sealed trait create extends TaskHistoryRecordType
  
  /**
    * Represents the deletion of a task history record.
    *
    */
  @js.native
  sealed trait delete extends TaskHistoryRecordType
  
  /**
    * Represents an update to a task's priority.
    *
    */
  @js.native
  sealed trait priority extends TaskHistoryRecordType
  
  /**
    * Represents an update to a task's progress.
    *
    */
  @js.native
  sealed trait progress extends TaskHistoryRecordType
  
  /**
    * Represents an update to a task's start date or due date.
    *
    */
  @js.native
  sealed trait schedule extends TaskHistoryRecordType
  
  /**
    * Represents a change in the title of a task.
    *
    */
  @js.native
  sealed trait setTitle extends TaskHistoryRecordType
  
  /**
    * Represents a user being unassigned from a task.
    *
    */
  @js.native
  sealed trait unassign extends TaskHistoryRecordType
  
  /**
    * Represents all users being unassigned from a task.
    *
    */
  @js.native
  sealed trait unassignAll extends TaskHistoryRecordType
  
  /**
    * Represents the restoration of a history record after being deleted.
    *
    */
  @js.native
  sealed trait undelete extends TaskHistoryRecordType
  
  /**
    * Represents a previous task action being undone.
    *
    */
  @js.native
  sealed trait undo extends TaskHistoryRecordType
  
  /**
    * Represents unknown history type. This value will be returned when the version of Excel running doesn't understand the type of the history record that is in the loaded file.
    *
    */
  @js.native
  sealed trait unknown extends TaskHistoryRecordType
}
