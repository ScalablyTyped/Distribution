package typings.officeDashJs.ExcelNs

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
  sealed trait compact extends PivotLayoutType
  
  /**
    *
    * Inner fields' items are on same row as outer fields' items and subtotals are always on the bottom.
    *
    */
  @js.native
  sealed trait outline extends PivotLayoutType
  
  /**
    *
    * Inner fields' items are always on a new line relative to the outer fields' items.
    *
    */
  @js.native
  sealed trait tabular extends PivotLayoutType
  
  /* "Compact" */ val compact: typings.officeDashJs.ExcelNs.PivotLayoutType.compact with String = js.native
  /* "Outline" */ val outline: typings.officeDashJs.ExcelNs.PivotLayoutType.outline with String = js.native
  /* "Tabular" */ val tabular: typings.officeDashJs.ExcelNs.PivotLayoutType.tabular with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PivotLayoutType with String] = js.native
}

