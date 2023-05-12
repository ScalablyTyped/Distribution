package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.DocumentTaskSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentTask object, for use in `documentTask.set({ ... })`. */
trait DocumentTaskUpdateData extends StObject {
  
  /**
    * Specifies the completion percentage of the task. This is a value between 0 and 100, where 100 represents a completed task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the priority of the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the date and time the task should start and is due.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startAndDueDateTime: js.UndefOr[DocumentTaskSchedule] = js.undefined
  
  /**
    * Specifies title of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.undefined
}
object DocumentTaskUpdateData {
  
  inline def apply(): DocumentTaskUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentTaskUpdateData] (val x: Self) extends AnyVal {
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartAndDueDateTime(value: DocumentTaskSchedule): Self = StObject.set(x, "startAndDueDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartAndDueDateTimeUndefined: Self = StObject.set(x, "startAndDueDateTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
