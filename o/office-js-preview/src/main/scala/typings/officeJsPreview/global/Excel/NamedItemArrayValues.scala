package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an object containing values and types of a named item.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.NamedItemArrayValues")
@js.native
class NamedItemArrayValues ()
  extends typings.officeJsPreview.Excel.NamedItemArrayValues {
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

