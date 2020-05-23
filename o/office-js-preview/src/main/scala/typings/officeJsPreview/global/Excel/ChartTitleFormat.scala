package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides access to the office art formatting for chart title.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartTitleFormat")
@js.native
class ChartTitleFormat ()
  extends typings.officeJsPreview.Excel.ChartTitleFormat {
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

