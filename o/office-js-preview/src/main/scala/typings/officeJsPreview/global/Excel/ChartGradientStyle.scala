package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the gradient style of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartGradientStyle & String] = js.native
  
  /* "ThreePhaseColor" */ val threePhaseColor: typings.officeJsPreview.Excel.ChartGradientStyle.threePhaseColor & String = js.native
  
  /* "TwoPhaseColor" */ val twoPhaseColor: typings.officeJsPreview.Excel.ChartGradientStyle.twoPhaseColor & String = js.native
}
