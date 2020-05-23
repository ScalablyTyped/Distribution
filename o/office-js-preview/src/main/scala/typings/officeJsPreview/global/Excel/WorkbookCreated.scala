package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The WorkbookCreated object is the top level object created by Application.CreateWorkbook. A WorkbookCreated object is a special Workbook object.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.WorkbookCreated")
@js.native
class WorkbookCreated ()
  extends typings.officeJsPreview.Excel.WorkbookCreated {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

