package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Excel PivotTable.
  To learn more about the PivotTable object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-pivottables | Work with PivotTables using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.3]
  */
@JSGlobal("Excel.PivotTable")
@js.native
class PivotTable ()
  extends StObject
     with typings.officeJsPreview.Excel.PivotTable {
  
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
