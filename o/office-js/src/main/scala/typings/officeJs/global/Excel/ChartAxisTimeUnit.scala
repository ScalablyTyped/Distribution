package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the unit of time for chart axes and data series.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTimeUnit")
@js.native
object ChartAxisTimeUnit extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartAxisTimeUnit & String] = js.native
  
  /* "Days" */ val days: typings.officeJs.Excel.ChartAxisTimeUnit.days & String = js.native
  
  /* "Months" */ val months: typings.officeJs.Excel.ChartAxisTimeUnit.months & String = js.native
  
  /* "Years" */ val years: typings.officeJs.Excel.ChartAxisTimeUnit.years & String = js.native
}
