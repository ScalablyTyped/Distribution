package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorkbookActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the workbook that raised the activated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.13]
  */
trait WorkbookActivatedEventArgs extends StObject {
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var `type`: WorkbookActivated
}
object WorkbookActivatedEventArgs {
  
  inline def apply(): WorkbookActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WorkbookActivated")
    __obj.asInstanceOf[WorkbookActivatedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookActivatedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setType(value: WorkbookActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
