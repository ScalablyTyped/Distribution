package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  sealed trait assign
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents the creation of a new task.
    *
    */
  @js.native
  sealed trait create
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents the deletion of a task history record.
    *
    */
  @js.native
  sealed trait delete
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents an update to a task's priority.
    *
    */
  @js.native
  sealed trait priority
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents an update to a task's progress.
    *
    */
  @js.native
  sealed trait progress
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents an update to a task's start date or due date.
    *
    */
  @js.native
  sealed trait schedule
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents a change in the title of a task.
    *
    */
  @js.native
  sealed trait setTitle
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents a user being unassigned from a task.
    *
    */
  @js.native
  sealed trait unassign
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents all users being unassigned from a task.
    *
    */
  @js.native
  sealed trait unassignAll
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents the restoration of a history record after being deleted.
    *
    */
  @js.native
  sealed trait undelete
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents a previous task action being undone.
    *
    */
  @js.native
  sealed trait undo
    extends StObject
       with TaskHistoryRecordType
  
  /**
    * Represents unknown history type. This value will be returned when the version of Excel running doesn't understand the type of the history record that is in the loaded file.
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with TaskHistoryRecordType
}
