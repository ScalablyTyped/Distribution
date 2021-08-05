package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.User
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `task.toJSON()`. */
trait TaskData extends StObject {
  
  /**
    *
    * Gets the users to which the task is assigned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignees: js.UndefOr[js.Array[User]] = js.undefined
  
  /**
    *
    * Gets the date and time the task is due. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Gets the id of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the completion percentage of the task. This is a value between 0 and 100, where 100 represents a completed task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the priority of the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets the date and time the task should start. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Gets title of the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.undefined
}
object TaskData {
  
  inline def apply(): TaskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskData]
  }
  
  extension [Self <: TaskData](x: Self) {
    
    inline def setAssignees(value: js.Array[User]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: User*): Self = StObject.set(x, "assignees", js.Array(value :_*))
    
    inline def setDueDate(value: Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
