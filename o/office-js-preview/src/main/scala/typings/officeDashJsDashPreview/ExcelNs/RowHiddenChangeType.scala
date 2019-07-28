package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait hidden extends RowHiddenChangeType
  
  /**
    *
    * Unhidden indicates the row is not hidden.
    *
    */
  @js.native
  sealed trait unhidden extends RowHiddenChangeType
  
  /* "Hidden" */ val hidden: typings.officeDashJsDashPreview.ExcelNs.RowHiddenChangeType.hidden with String = js.native
  /* "Unhidden" */ val unhidden: typings.officeDashJsDashPreview.ExcelNs.RowHiddenChangeType.unhidden with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowHiddenChangeType with String] = js.native
}

