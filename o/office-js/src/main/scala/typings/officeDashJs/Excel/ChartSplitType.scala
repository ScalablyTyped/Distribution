package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartSplitType extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartSplitType")
@js.native
object ChartSplitType extends js.Object {
  @js.native
  sealed trait splitByCustomSplit extends ChartSplitType
  
  @js.native
  sealed trait splitByPercentValue extends ChartSplitType
  
  @js.native
  sealed trait splitByPosition extends ChartSplitType
  
  @js.native
  sealed trait splitByValue extends ChartSplitType
  
  /* "SplitByCustomSplit" */ val splitByCustomSplit: typings.officeDashJs.Excel.ChartSplitType.splitByCustomSplit with String = js.native
  /* "SplitByPercentValue" */ val splitByPercentValue: typings.officeDashJs.Excel.ChartSplitType.splitByPercentValue with String = js.native
  /* "SplitByPosition" */ val splitByPosition: typings.officeDashJs.Excel.ChartSplitType.splitByPosition with String = js.native
  /* "SplitByValue" */ val splitByValue: typings.officeDashJs.Excel.ChartSplitType.splitByValue with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartSplitType with String] = js.native
}

