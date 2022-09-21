package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the dimensions when getting values from chart series.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ChartSeriesDimension")
@js.native
object ChartSeriesDimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartSeriesDimension & String] = js.native
  
  /* "BubbleSizes" */ val bubbleSizes: typings.officeJsPreview.Excel.ChartSeriesDimension.bubbleSizes & String = js.native
  
  /* "Categories" */ val categories: typings.officeJsPreview.Excel.ChartSeriesDimension.categories & String = js.native
  
  /* "Values" */ val values: typings.officeJsPreview.Excel.ChartSeriesDimension.values & String = js.native
  
  /* "XValues" */ val xvalues: typings.officeJsPreview.Excel.ChartSeriesDimension.xvalues & String = js.native
  
  /* "YValues" */ val yvalues: typings.officeJsPreview.Excel.ChartSeriesDimension.yvalues & String = js.native
}
