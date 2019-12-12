package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ChartBoxQuartileCalculation.exclusive
import typings.officeDashJs.Excel.ChartBoxQuartileCalculation.inclusive
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartBoxQuartileCalculation with String] = js.native
  /* "Exclusive" */ @js.native
  object exclusive extends TopLevel[exclusive with String]
  
  /* "Inclusive" */ @js.native
  object inclusive extends TopLevel[inclusive with String]
  
}

