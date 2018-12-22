package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatDirection extends js.Object

/**
     *
     * Represents the direction for a selection.
     *
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalFormatDirection")
@js.native
object ConditionalFormatDirection extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatDirection
  
  @js.native
  sealed trait top
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatDirection
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatDirection with java.lang.String
  ] = js.native
}

