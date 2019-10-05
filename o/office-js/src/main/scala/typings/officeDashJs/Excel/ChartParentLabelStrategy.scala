package typings.officeDashJs.Excel

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
  
  /* "Banner" */ val banner: typings.officeDashJs.Excel.ChartParentLabelStrategy.banner with String = js.native
  /* "None" */ val none: typings.officeDashJs.Excel.ChartParentLabelStrategy.none with String = js.native
  /* "Overlapping" */ val overlapping: typings.officeDashJs.Excel.ChartParentLabelStrategy.overlapping with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartParentLabelStrategy with String] = js.native
}

