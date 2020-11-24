package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartTrendlineType extends js.Object
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTrendlineType")
@js.native
object ChartTrendlineType extends js.Object {
  
  @js.native
  sealed trait exponential extends ChartTrendlineType
  
  @js.native
  sealed trait linear extends ChartTrendlineType
  
  @js.native
  sealed trait logarithmic extends ChartTrendlineType
  
  @js.native
  sealed trait movingAverage extends ChartTrendlineType
  
  @js.native
  sealed trait polynomial extends ChartTrendlineType
  
  @js.native
  sealed trait power extends ChartTrendlineType
}
