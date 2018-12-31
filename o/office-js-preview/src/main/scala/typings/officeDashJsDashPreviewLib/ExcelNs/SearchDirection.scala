package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchDirection extends js.Object

/**
  *
  * Specifies the search direction.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
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
  sealed trait backwards
    extends officeDashJsDashPreviewLib.ExcelNs.SearchDirection
  
  /**
    *
    * Search in forward order.
    *
    */
  @js.native
  sealed trait forward
    extends officeDashJsDashPreviewLib.ExcelNs.SearchDirection
  
  /* "Backwards" */ val backwards: backwards with java.lang.String = js.native
  /* "Forward" */ val forward: forward with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SearchDirection with java.lang.String] = js.native
}

