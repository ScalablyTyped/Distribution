package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.SortBy.ascending
import typings.officeDashJsDashPreview.Excel.SortBy.descending
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortBy with String] = js.native
  /* "Ascending" */ @js.native
  object ascending extends TopLevel[ascending with String]
  
  /* "Descending" */ @js.native
  object descending extends TopLevel[descending with String]
  
}

