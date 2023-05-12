package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a task's schedule.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait DocumentTaskSchedule extends StObject {
  
  /**
    * Gets the date and time that the task is due. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDateTime: js.Date
  
  /**
    * Gets the date and time that the task should start. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDateTime: js.Date
}
object DocumentTaskSchedule {
  
  inline def apply(dueDateTime: js.Date, startDateTime: js.Date): DocumentTaskSchedule = {
    val __obj = js.Dynamic.literal(dueDateTime = dueDateTime.asInstanceOf[js.Any], startDateTime = startDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentTaskSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentTaskSchedule] (val x: Self) extends AnyVal {
    
    inline def setDueDateTime(value: js.Date): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
  }
}
