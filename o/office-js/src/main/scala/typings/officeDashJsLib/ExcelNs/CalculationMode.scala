package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalculationMode extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationMode")
@js.native
object CalculationMode extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.CalculationMode
  
  @js.native
  sealed trait automaticExceptTables
    extends officeDashJsLib.ExcelNs.CalculationMode
  
  @js.native
  sealed trait manual
    extends officeDashJsLib.ExcelNs.CalculationMode
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "AutomaticExceptTables" */ val automaticExceptTables: automaticExceptTables with java.lang.String = js.native
  /* "Manual" */ val manual: manual with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.CalculationMode with java.lang.String] = js.native
}

