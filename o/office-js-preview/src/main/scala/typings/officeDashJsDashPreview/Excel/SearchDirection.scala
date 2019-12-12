package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.SearchDirection.backwards
import typings.officeDashJsDashPreview.Excel.SearchDirection.forward
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SearchDirection with String] = js.native
  /* "Backwards" */ @js.native
  object backwards extends TopLevel[backwards with String]
  
  /* "Forward" */ @js.native
  object forward extends TopLevel[forward with String]
  
}

