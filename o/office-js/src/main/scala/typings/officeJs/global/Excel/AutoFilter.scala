package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the AutoFilter object.
  AutoFilter turns the values in Excel column into specific filters based on the cell contents.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.AutoFilter")
@js.native
class AutoFilter ()
  extends typings.officeJs.Excel.AutoFilter {
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

