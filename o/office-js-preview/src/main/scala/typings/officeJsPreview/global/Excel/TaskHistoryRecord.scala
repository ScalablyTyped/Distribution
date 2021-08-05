package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a recorded change to the task.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TaskHistoryRecord")
@js.native
class TaskHistoryRecord ()
  extends StObject
     with typings.officeJsPreview.Excel.TaskHistoryRecord {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
object TaskHistoryRecord {
  
  @JSGlobal("Excel.TaskHistoryRecord")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new instance of Excel.TaskHistoryRecord object
    */
  /* static member */
  inline def newObject(context: ClientRequestContext): typings.officeJsPreview.Excel.TaskHistoryRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJsPreview.Excel.TaskHistoryRecord]
}
