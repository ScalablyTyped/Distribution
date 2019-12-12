package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.categories
import typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.values
import typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.xvalues
import typings.officeDashJsDashPreview.Excel.ChartSeriesDimension.yvalues
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartSeriesDimension with String] = js.native
  /* "Categories" */ @js.native
  object categories extends TopLevel[categories with String]
  
  /* "Values" */ @js.native
  object values extends TopLevel[values with String]
  
  /* "XValues" */ @js.native
  object xvalues extends TopLevel[xvalues with String]
  
  /* "YValues" */ @js.native
  object yvalues extends TopLevel[yvalues with String]
  
}

