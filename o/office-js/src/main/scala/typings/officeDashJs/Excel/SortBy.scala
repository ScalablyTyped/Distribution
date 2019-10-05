package typings.officeDashJs.Excel

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
  sealed trait ascending extends SortBy
  
  /**
    *
    * Descending sort. Largest to smallest or Z to A.
    *
    */
  @js.native
  sealed trait descending extends SortBy
  
  /* "Ascending" */ val ascending: typings.officeDashJs.Excel.SortBy.ascending with String = js.native
  /* "Descending" */ val descending: typings.officeDashJs.Excel.SortBy.descending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortBy with String] = js.native
}

