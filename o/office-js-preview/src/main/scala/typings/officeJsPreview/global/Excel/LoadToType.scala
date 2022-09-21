package typings.officeJsPreview.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.LoadToType & String] = js.native
  
  /* "ConnectionOnly" */ val connectionOnly: typings.officeJsPreview.Excel.LoadToType.connectionOnly & String = js.native
  
  /* "PivotChart" */ val pivotChart: typings.officeJsPreview.Excel.LoadToType.pivotChart & String = js.native
  
  /* "PivotTable" */ val pivotTable: typings.officeJsPreview.Excel.LoadToType.pivotTable & String = js.native
  
  /* "Table" */ val table: typings.officeJsPreview.Excel.LoadToType.table & String = js.native
}
