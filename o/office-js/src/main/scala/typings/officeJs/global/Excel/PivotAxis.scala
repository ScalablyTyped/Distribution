package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the axis from which to get the PivotItems.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PivotAxis with String] = js.native
  
  /* "Column" */ val column: typings.officeJs.Excel.PivotAxis.column with String = js.native
  
  /* "Data" */ val data: typings.officeJs.Excel.PivotAxis.data with String = js.native
  
  /* "Filter" */ val filter: typings.officeJs.Excel.PivotAxis.filter with String = js.native
  
  /* "Row" */ val row: typings.officeJs.Excel.PivotAxis.row with String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.PivotAxis.unknown with String = js.native
}
