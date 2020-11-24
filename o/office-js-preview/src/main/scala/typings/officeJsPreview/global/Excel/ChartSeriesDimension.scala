package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the dimensions when getting values from chart series.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ChartSeriesDimension")
@js.native
object ChartSeriesDimension extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartSeriesDimension with String] = js.native
  
  /* "BubbleSizes" */ val bubbleSizes: typings.officeJsPreview.Excel.ChartSeriesDimension.bubbleSizes with String = js.native
  
  /* "Categories" */ val categories: typings.officeJsPreview.Excel.ChartSeriesDimension.categories with String = js.native
  
  /* "Values" */ val values: typings.officeJsPreview.Excel.ChartSeriesDimension.values with String = js.native
  
  /* "XValues" */ val xvalues: typings.officeJsPreview.Excel.ChartSeriesDimension.xvalues with String = js.native
  
  /* "YValues" */ val yvalues: typings.officeJsPreview.Excel.ChartSeriesDimension.yvalues with String = js.native
}
