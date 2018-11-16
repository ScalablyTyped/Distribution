package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrientation extends js.Object

/**
     * [Api set: ExcelApi 1.2]
     */
@JSGlobal("Excel.SortOrientation")
@js.native
object SortOrientation extends js.Object {
  @js.native
  sealed trait columns
    extends officeDashJsLib.ExcelNs.SortOrientation
  
  @js.native
  sealed trait rows
    extends officeDashJsLib.ExcelNs.SortOrientation
  
  /* "Columns" */ val columns: columns with java.lang.String = js.native
  /* "Rows" */ val rows: rows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.SortOrientation with java.lang.String] = js.native
}

