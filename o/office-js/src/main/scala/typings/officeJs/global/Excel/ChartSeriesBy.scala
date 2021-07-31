package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies whether the series are by rows or by columns. On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartSeriesBy")
@js.native
object ChartSeriesBy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartSeriesBy & String] = js.native
  
  /* "Auto" */ val auto: typings.officeJs.Excel.ChartSeriesBy.auto & String = js.native
  
  /* "Columns" */ val columns: typings.officeJs.Excel.ChartSeriesBy.columns & String = js.native
  
  /* "Rows" */ val rows: typings.officeJs.Excel.ChartSeriesBy.rows & String = js.native
}
