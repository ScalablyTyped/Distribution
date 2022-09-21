package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the range type for error bars.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartErrorBarsType & String] = js.native
  
  /* "Custom" */ val custom: typings.officeJs.Excel.ChartErrorBarsType.custom & String = js.native
  
  /* "FixedValue" */ val fixedValue: typings.officeJs.Excel.ChartErrorBarsType.fixedValue & String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.ChartErrorBarsType.percent & String = js.native
  
  /* "StDev" */ val stDev: typings.officeJs.Excel.ChartErrorBarsType.stDev & String = js.native
  
  /* "StError" */ val stError: typings.officeJs.Excel.ChartErrorBarsType.stError & String = js.native
}
