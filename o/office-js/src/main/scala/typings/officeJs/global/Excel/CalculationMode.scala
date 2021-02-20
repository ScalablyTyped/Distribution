package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationMode")
@js.native
object CalculationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CalculationMode with String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJs.Excel.CalculationMode.automatic with String = js.native
  
  /* "AutomaticExceptTables" */ val automaticExceptTables: typings.officeJs.Excel.CalculationMode.automaticExceptTables with String = js.native
  
  /* "Manual" */ val manual: typings.officeJs.Excel.CalculationMode.manual with String = js.native
}
