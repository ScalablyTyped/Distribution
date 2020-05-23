package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a PivotTable Style, which defines style elements by PivotTable region.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.PivotTableStyle")
@js.native
class PivotTableStyle ()
  extends typings.officeJs.Excel.PivotTableStyle {
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

