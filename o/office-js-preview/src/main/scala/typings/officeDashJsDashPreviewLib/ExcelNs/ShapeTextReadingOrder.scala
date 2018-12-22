package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextReadingOrder extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeTextReadingOrder")
@js.native
object ShapeTextReadingOrder extends js.Object {
  @js.native
  sealed trait ltr
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder
  
  @js.native
  sealed trait rtl
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder
  
  /* "LTR" */ val ltr: ltr with java.lang.String = js.native
  /* "RTL" */ val rtl: rtl with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder with java.lang.String] = js.native
}

