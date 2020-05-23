package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the legendEntry in legendEntryCollection.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartLegendEntry")
@js.native
class ChartLegendEntry ()
  extends typings.officeJsPreview.Excel.ChartLegendEntry {
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

