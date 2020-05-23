package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartParentLabelStrategy extends js.Object

/**
  *
  * Represents the parent label strategy of the chart series layout. This only applies to treemap charts
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends js.Object {
  @js.native
  sealed trait banner extends ChartParentLabelStrategy
  
  @js.native
  sealed trait none extends ChartParentLabelStrategy
  
  @js.native
  sealed trait overlapping extends ChartParentLabelStrategy
  
}

