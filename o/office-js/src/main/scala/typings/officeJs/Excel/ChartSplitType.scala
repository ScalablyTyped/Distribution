package typings.officeJs.Excel

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
  
}

