package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartPlotBy extends js.Object

/**
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.ChartPlotBy")
@js.native
object ChartPlotBy extends js.Object {
  @js.native
  sealed trait columns
    extends officeDashJsDashPreviewLib.ExcelNs.ChartPlotBy
  
  @js.native
  sealed trait rows
    extends officeDashJsDashPreviewLib.ExcelNs.ChartPlotBy
  
  /* "Columns" */ val columns: columns with java.lang.String = js.native
  /* "Rows" */ val rows: rows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartPlotBy with java.lang.String] = js.native
}

