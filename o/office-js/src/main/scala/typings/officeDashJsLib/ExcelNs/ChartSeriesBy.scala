package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartSeriesBy extends js.Object

/**
  *
  * Specifies whether the series are by rows or by columns. On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartSeriesBy")
@js.native
object ChartSeriesBy extends js.Object {
  /**
    *
    * On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
    *
    */
  @js.native
  sealed trait auto
    extends officeDashJsLib.ExcelNs.ChartSeriesBy
  
  @js.native
  sealed trait columns
    extends officeDashJsLib.ExcelNs.ChartSeriesBy
  
  @js.native
  sealed trait rows
    extends officeDashJsLib.ExcelNs.ChartSeriesBy
  
  /* "Auto" */ val auto: auto with java.lang.String = js.native
  /* "Columns" */ val columns: columns with java.lang.String = js.native
  /* "Rows" */ val rows: rows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartSeriesBy with java.lang.String] = js.native
}

