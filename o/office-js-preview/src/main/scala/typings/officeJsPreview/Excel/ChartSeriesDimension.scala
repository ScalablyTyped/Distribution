package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartSeriesDimension extends StObject
/**
  *
  * Represents the dimensions when getting values from chart series.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ChartSeriesDimension")
@js.native
object ChartSeriesDimension extends StObject {
  
  /**
    * The chart series axis for the bubble sizes in bubble charts.
    *
    */
  @js.native
  sealed trait bubbleSizes
    extends StObject
       with ChartSeriesDimension
  
  /**
    * The chart series axis for the categories.
    *
    */
  @js.native
  sealed trait categories
    extends StObject
       with ChartSeriesDimension
  
  /**
    * The chart series axis for the values.
    *
    */
  @js.native
  sealed trait values
    extends StObject
       with ChartSeriesDimension
  
  /**
    * The chart series axis for the x-axis values in scatter and bubble charts.
    *
    */
  @js.native
  sealed trait xvalues
    extends StObject
       with ChartSeriesDimension
  
  /**
    * The chart series axis for the y-axis values in scatter and bubble charts.
    *
    */
  @js.native
  sealed trait yvalues
    extends StObject
       with ChartSeriesDimension
}
