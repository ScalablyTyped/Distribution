package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartBoxQuartileCalculation extends js.Object

/**
  *
  * Represents the quartile calculation type of chart series layout. Only applies to a box and whisker chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBoxQuartileCalculation")
@js.native
object ChartBoxQuartileCalculation extends js.Object {
  @js.native
  sealed trait exclusive extends ChartBoxQuartileCalculation
  
  @js.native
  sealed trait inclusive extends ChartBoxQuartileCalculation
  
  /* "Exclusive" */ val exclusive: typings.officeDashJs.ExcelNs.ChartBoxQuartileCalculation.exclusive with String = js.native
  /* "Inclusive" */ val inclusive: typings.officeDashJs.ExcelNs.ChartBoxQuartileCalculation.inclusive with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartBoxQuartileCalculation with String] = js.native
}

