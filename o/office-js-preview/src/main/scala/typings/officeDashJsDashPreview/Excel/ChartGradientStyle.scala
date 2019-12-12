package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartGradientStyle.threePhaseColor
import typings.officeDashJsDashPreview.Excel.ChartGradientStyle.twoPhaseColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartGradientStyle extends js.Object

/**
  *
  * Represents the gradient style of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends js.Object {
  @js.native
  sealed trait threePhaseColor extends ChartGradientStyle
  
  @js.native
  sealed trait twoPhaseColor extends ChartGradientStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartGradientStyle with String] = js.native
  /* "ThreePhaseColor" */ @js.native
  object threePhaseColor extends TopLevel[threePhaseColor with String]
  
  /* "TwoPhaseColor" */ @js.native
  object twoPhaseColor extends TopLevel[twoPhaseColor with String]
  
}

