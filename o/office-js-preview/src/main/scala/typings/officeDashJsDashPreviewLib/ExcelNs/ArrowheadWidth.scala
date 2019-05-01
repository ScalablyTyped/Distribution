package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadWidth extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadWidth")
@js.native
object ArrowheadWidth extends js.Object {
  @js.native
  sealed trait medium
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth
  
  @js.native
  sealed trait narrow
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth
  
  @js.native
  sealed trait wide
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth
  
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Narrow" */ val narrow: narrow with java.lang.String = js.native
  /* "Wide" */ val wide: wide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth with java.lang.String] = js.native
}

