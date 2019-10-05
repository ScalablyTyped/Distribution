package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchDirection extends js.Object

/**
  *
  * Specifies the search direction.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SearchDirection")
@js.native
object SearchDirection extends js.Object {
  /**
    *
    * Search in reverse order.
    *
    */
  @js.native
  sealed trait backwards extends SearchDirection
  
  /**
    *
    * Search in forward order.
    *
    */
  @js.native
  sealed trait forward extends SearchDirection
  
  /* "Backwards" */ val backwards: typings.officeDashJsDashPreview.Excel.SearchDirection.backwards with String = js.native
  /* "Forward" */ val forward: typings.officeDashJsDashPreview.Excel.SearchDirection.forward with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SearchDirection with String] = js.native
}

