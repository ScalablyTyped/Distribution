package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapLabelStrategy extends js.Object

/**
  *
  * Represents the region level of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends js.Object {
  @js.native
  sealed trait bestFit extends ChartMapLabelStrategy
  
  @js.native
  sealed trait none extends ChartMapLabelStrategy
  
  @js.native
  sealed trait showAll extends ChartMapLabelStrategy
  
  /* "BestFit" */ val bestFit: typings.officeDashJs.ExcelNs.ChartMapLabelStrategy.bestFit with String = js.native
  /* "None" */ val none: typings.officeDashJs.ExcelNs.ChartMapLabelStrategy.none with String = js.native
  /* "ShowAll" */ val showAll: typings.officeDashJs.ExcelNs.ChartMapLabelStrategy.showAll with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapLabelStrategy with String] = js.native
}

