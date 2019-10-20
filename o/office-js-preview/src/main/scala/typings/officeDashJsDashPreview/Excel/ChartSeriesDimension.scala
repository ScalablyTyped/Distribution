package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartSeriesDimension extends js.Object

/**
  *
  * Represents the dimensions when getting values from chart series.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ChartSeriesDimension")
@js.native
object ChartSeriesDimension extends js.Object {
  /**
    *
    * The chart series axis for the categories.
    *
    */
  @js.native
  sealed trait categories extends ChartSeriesDimension
  
  /**
    *
    * The chart series axis for the values.
    *
    */
  @js.native
  sealed trait values extends ChartSeriesDimension
  
  /**
    *
    * The chart series axis for the x-axis values in scatter and bubble charts.
    *
    */
  @js.native
  sealed trait xvalues extends ChartSeriesDimension
  
  /**
    *
    * The chart series axis for the y-axis values in scatter and bubble charts.
    *
    */
  @js.native
  sealed trait yvalues extends ChartSeriesDimension
  
  /* "Categories" */ val categories: typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.categories with String = js.native
  /* "Values" */ val values: typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.values with String = js.native
  /* "XValues" */ val xvalues: typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.xvalues with String = js.native
  /* "YValues" */ val yvalues: typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.yvalues with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartSeriesDimension with String] = js.native
}

