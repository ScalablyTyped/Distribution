package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of worksheet objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.WorksheetCollection")
@js.native
class WorksheetCollection ()
  extends typings.officeJsPreview.Excel.WorksheetCollection {
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

