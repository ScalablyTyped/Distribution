package typings.officeDashJsDashPreview.Excel

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
  
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.Excel.ChartErrorBarsType.custom with String = js.native
  /* "FixedValue" */ val fixedValue: typings.officeDashJsDashPreview.Excel.ChartErrorBarsType.fixedValue with String = js.native
  /* "Percent" */ val percent: typings.officeDashJsDashPreview.Excel.ChartErrorBarsType.percent with String = js.native
  /* "StDev" */ val stDev: typings.officeDashJsDashPreview.Excel.ChartErrorBarsType.stDev with String = js.native
  /* "StError" */ val stError: typings.officeDashJsDashPreview.Excel.ChartErrorBarsType.stError with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartErrorBarsType with String] = js.native
}

