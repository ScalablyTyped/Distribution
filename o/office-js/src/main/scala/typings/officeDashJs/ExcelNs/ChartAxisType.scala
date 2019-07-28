package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisType")
@js.native
object ChartAxisType extends js.Object {
  /**
    *
    * Axis displays categories.
    *
    */
  @js.native
  sealed trait category extends ChartAxisType
  
  @js.native
  sealed trait invalid extends ChartAxisType
  
  /**
    *
    * Axis displays data series.
    *
    */
  @js.native
  sealed trait series extends ChartAxisType
  
  /**
    *
    * Axis displays values.
    *
    */
  @js.native
  sealed trait value extends ChartAxisType
  
  /* "Category" */ val category: typings.officeDashJs.ExcelNs.ChartAxisType.category with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.ExcelNs.ChartAxisType.invalid with String = js.native
  /* "Series" */ val series: typings.officeDashJs.ExcelNs.ChartAxisType.series with String = js.native
  /* "Value" */ val value: typings.officeDashJs.ExcelNs.ChartAxisType.value with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisType with String] = js.native
}

