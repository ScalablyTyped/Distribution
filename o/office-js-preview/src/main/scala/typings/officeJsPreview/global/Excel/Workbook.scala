package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Workbook is the top level object which contains related workbook objects such as worksheets, tables, ranges, etc.
  To learn more about the workbook object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-workbooks | Work with workbooks using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Workbook")
@js.native
class Workbook ()
  extends StObject
     with typings.officeJsPreview.Excel.Workbook {
  
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
