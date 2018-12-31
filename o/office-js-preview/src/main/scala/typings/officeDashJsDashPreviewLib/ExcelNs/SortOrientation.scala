package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.SortOrientation
  
  @js.native
  sealed trait rows
    extends officeDashJsDashPreviewLib.ExcelNs.SortOrientation
  
  /* "Columns" */ val columns: columns with java.lang.String = js.native
  /* "Rows" */ val rows: rows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SortOrientation with java.lang.String] = js.native
}

