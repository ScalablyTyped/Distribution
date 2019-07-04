package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowHiddenChangeType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.RowHiddenChangeType")
@js.native
object RowHiddenChangeType extends js.Object {
  /**
    *
    * Hidden indicates the row is hidden.
    *
    */
  @js.native
  sealed trait hidden
    extends officeDashJsDashPreviewLib.ExcelNs.RowHiddenChangeType
  
  /**
    *
    * Unhidden indicates the row is not hidden.
    *
    */
  @js.native
  sealed trait unhidden
    extends officeDashJsDashPreviewLib.ExcelNs.RowHiddenChangeType
  
  /* "Hidden" */ val hidden: hidden with java.lang.String = js.native
  /* "Unhidden" */ val unhidden: unhidden with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.RowHiddenChangeType with java.lang.String] = js.native
}

