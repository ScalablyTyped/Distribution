package typings.officeDashJs.ExcelNs

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
  
  /* "SplitByCustomSplit" */ val splitByCustomSplit: typings.officeDashJs.ExcelNs.ChartSplitType.splitByCustomSplit with String = js.native
  /* "SplitByPercentValue" */ val splitByPercentValue: typings.officeDashJs.ExcelNs.ChartSplitType.splitByPercentValue with String = js.native
  /* "SplitByPosition" */ val splitByPosition: typings.officeDashJs.ExcelNs.ChartSplitType.splitByPosition with String = js.native
  /* "SplitByValue" */ val splitByValue: typings.officeDashJs.ExcelNs.ChartSplitType.splitByValue with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartSplitType with String] = js.native
}

