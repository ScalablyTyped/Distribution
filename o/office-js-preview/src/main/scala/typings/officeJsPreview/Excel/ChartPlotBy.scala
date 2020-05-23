package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartPlotBy extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartPlotBy")
@js.native
object ChartPlotBy extends js.Object {
  @js.native
  sealed trait columns extends ChartPlotBy
  
  @js.native
  sealed trait rows extends ChartPlotBy
  
}

