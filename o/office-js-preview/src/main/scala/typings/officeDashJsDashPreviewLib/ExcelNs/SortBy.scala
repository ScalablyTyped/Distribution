package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortBy extends js.Object

/**
  *
  * Represents the sort direction.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SortBy")
@js.native
object SortBy extends js.Object {
  /**
    *
    * Ascending sort. Smallest to largest or A to Z.
    *
    */
  @js.native
  sealed trait ascending
    extends officeDashJsDashPreviewLib.ExcelNs.SortBy
  
  /**
    *
    * Descending sort. Largest to smallest or Z to A.
    *
    */
  @js.native
  sealed trait descending
    extends officeDashJsDashPreviewLib.ExcelNs.SortBy
  
  /* "Ascending" */ val ascending: ascending with java.lang.String = js.native
  /* "Descending" */ val descending: descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SortBy with java.lang.String] = js.native
}

