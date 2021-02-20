package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartGradientStyle with String] = js.native
  
  /* "ThreePhaseColor" */ val threePhaseColor: typings.officeJs.Excel.ChartGradientStyle.threePhaseColor with String = js.native
  
  /* "TwoPhaseColor" */ val twoPhaseColor: typings.officeJs.Excel.ChartGradientStyle.twoPhaseColor with String = js.native
}
