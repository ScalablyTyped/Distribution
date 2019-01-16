package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  /**
    *
    * The default recalculation behavior where Excel calculates new formula results every time the relevant data is changed.
    *
    */
  @js.native
  sealed trait automatic
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationMode
  
  /**
    *
    * Calculates new formula results every time the relevant data is changed, unless the formula is in a data table.
    *
    */
  @js.native
  sealed trait automaticExceptTables
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationMode
  
  /**
    *
    * Calculations only occur when the user or add-in requests them.
    *
    */
  @js.native
  sealed trait manual
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationMode
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "AutomaticExceptTables" */ val automaticExceptTables: automaticExceptTables with java.lang.String = js.native
  /* "Manual" */ val manual: manual with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.CalculationMode with java.lang.String] = js.native
}

