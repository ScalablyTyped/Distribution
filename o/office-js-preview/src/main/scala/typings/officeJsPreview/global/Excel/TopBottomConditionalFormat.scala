package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Top/Bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.TopBottomConditionalFormat")
@js.native
class TopBottomConditionalFormat ()
  extends typings.officeJsPreview.Excel.TopBottomConditionalFormat {
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

