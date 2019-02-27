package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowHeadWidth extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ArrowHeadWidth")
@js.native
object ArrowHeadWidth extends js.Object {
  @js.native
  sealed trait medium
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth
  
  @js.native
  sealed trait narrow
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth
  
  @js.native
  sealed trait wide
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth
  
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Narrow" */ val narrow: narrow with java.lang.String = js.native
  /* "Wide" */ val wide: wide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth with java.lang.String] = js.native
}

