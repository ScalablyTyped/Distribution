package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  sealed trait columns extends ChartPlotBy
  
  @js.native
  sealed trait rows extends ChartPlotBy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartPlotBy with String] = js.native
  /* "Columns" */ @js.native
  object columns extends TopLevel[columns with String]
  
  /* "Rows" */ @js.native
  object rows extends TopLevel[rows with String]
  
}

