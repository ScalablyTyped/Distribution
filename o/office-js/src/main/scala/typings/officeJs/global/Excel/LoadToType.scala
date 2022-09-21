package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enum that specifies the query load to destination.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@JSGlobal("Excel.LoadToType")
@js.native
object LoadToType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.LoadToType & String] = js.native
  
  /* "ConnectionOnly" */ val connectionOnly: typings.officeJs.Excel.LoadToType.connectionOnly & String = js.native
  
  /* "PivotChart" */ val pivotChart: typings.officeJs.Excel.LoadToType.pivotChart & String = js.native
  
  /* "PivotTable" */ val pivotTable: typings.officeJs.Excel.LoadToType.pivotTable & String = js.native
  
  /* "Table" */ val table: typings.officeJs.Excel.LoadToType.table & String = js.native
}
