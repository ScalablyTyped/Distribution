package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinOptions")
@js.native
class ChartBinOptions ()
  extends typings.officeJs.Excel.ChartBinOptions {
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

