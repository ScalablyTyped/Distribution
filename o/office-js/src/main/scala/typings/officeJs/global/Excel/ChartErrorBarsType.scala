package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the range type for error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartErrorBarsType with String] = js.native
  
  /* "Custom" */ val custom: typings.officeJs.Excel.ChartErrorBarsType.custom with String = js.native
  
  /* "FixedValue" */ val fixedValue: typings.officeJs.Excel.ChartErrorBarsType.fixedValue with String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.ChartErrorBarsType.percent with String = js.native
  
  /* "StDev" */ val stDev: typings.officeJs.Excel.ChartErrorBarsType.stDev with String = js.native
  
  /* "StError" */ val stError: typings.officeJs.Excel.ChartErrorBarsType.stError with String = js.native
}
