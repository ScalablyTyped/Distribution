package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentTaskChangeAction extends StObject
/**
  * Represents the type of change recorded in the task change record.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.DocumentTaskChangeAction")
@js.native
object DocumentTaskChangeAction extends StObject {
  
  /**
    * Represents a user being assigned to a task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait assign
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents the creation of a new task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait create
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents the deletion of a task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait remove
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents the restoration of a task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait restore
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents an update to a task's percentage complete.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait setPercentComplete
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents an update to a task's priority.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait setPriority
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents an update to a task's `startDateTime` or `dueDateTime`.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait setSchedule
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents a change in the title of a task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait setTitle
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents a user being unassigned from a task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unassign
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents all users being unassigned from a task.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unassignAll
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents a previous task action being undone.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait undo
    extends StObject
       with DocumentTaskChangeAction
  
  /**
    * Represents an unknown change type. This value will be returned when the version of Excel running doesn't understand the type of the change record that is in the loaded file.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DocumentTaskChangeAction
}
