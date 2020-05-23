package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel RowColumnPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.RowColumnPivotHierarchy")
@js.native
class RowColumnPivotHierarchy ()
  extends typings.officeJsPreview.Excel.RowColumnPivotHierarchy {
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

