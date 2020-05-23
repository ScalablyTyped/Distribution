package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorBarsType extends js.Object

/**
  *
  * Represents the range type for error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends js.Object {
  @js.native
  sealed trait custom extends ChartErrorBarsType
  
  @js.native
  sealed trait fixedValue extends ChartErrorBarsType
  
  @js.native
  sealed trait percent extends ChartErrorBarsType
  
  @js.native
  sealed trait stDev extends ChartErrorBarsType
  
  @js.native
  sealed trait stError extends ChartErrorBarsType
  
}

