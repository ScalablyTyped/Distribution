package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartPlotAreaPosition extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartPlotAreaPosition")
@js.native
object ChartPlotAreaPosition extends js.Object {
  @js.native
  sealed trait automatic extends ChartPlotAreaPosition
  
  @js.native
  sealed trait custom extends ChartPlotAreaPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartPlotAreaPosition with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
}

