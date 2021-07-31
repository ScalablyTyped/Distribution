package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartGradientStyle extends StObject
/**
  *
  * Represents the gradient style of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends StObject {
  
  @js.native
  sealed trait threePhaseColor
    extends StObject
       with ChartGradientStyle
  
  @js.native
  sealed trait twoPhaseColor
    extends StObject
       with ChartGradientStyle
}
