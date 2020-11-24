package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartSeriesDimension extends js.Object
/**
  *
  * Represents the dimensions when getting values from chart series.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ChartSeriesDimension")
@js.native
object ChartSeriesDimension extends js.Object {
  
  /**
    * The chart series axis for the bubble sizes in bubble charts.
    *
    */
  @js.native
  sealed trait bubbleSizes extends ChartSeriesDimension
  
  /**
    * The chart series axis for the categories.
    *
    */
  @js.native
  sealed trait categories extends ChartSeriesDimension
  
  /**
    * The chart series axis for the values.
    *
    */
  @js.native
  sealed trait values extends ChartSeriesDimension
  
  /**
    * The chart series axis for the x-axis values in scatter and bubble charts.
    *
    */
  @js.native
  sealed trait xvalues extends ChartSeriesDimension
  
  /**
    * The chart series axis for the y-axis values in scatter and bubble charts.
    *
    */
  @js.native
  sealed trait yvalues extends ChartSeriesDimension
}
