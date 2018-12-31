package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotLayoutType extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotLayoutType")
@js.native
object PivotLayoutType extends js.Object {
  /**
    *
    * A horizontally compressed form with labels from the next field in the same column.
    *
    */
  @js.native
  sealed trait compact
    extends officeDashJsLib.ExcelNs.PivotLayoutType
  
  /**
    *
    * Inner fields' items are on same row as outer fields' items and subtotals are always on the bottom.
    *
    */
  @js.native
  sealed trait outline
    extends officeDashJsLib.ExcelNs.PivotLayoutType
  
  /**
    *
    * Inner fields' items are always on a new line relative to the outer fields' items.
    *
    */
  @js.native
  sealed trait tabular
    extends officeDashJsLib.ExcelNs.PivotLayoutType
  
  /* "Compact" */ val compact: compact with java.lang.String = js.native
  /* "Outline" */ val outline: outline with java.lang.String = js.native
  /* "Tabular" */ val tabular: tabular with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.PivotLayoutType with java.lang.String] = js.native
}

