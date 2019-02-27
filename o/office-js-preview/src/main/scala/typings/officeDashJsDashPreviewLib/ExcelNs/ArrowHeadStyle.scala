package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowHeadStyle extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ArrowHeadStyle")
@js.native
object ArrowHeadStyle extends js.Object {
  @js.native
  sealed trait diamond
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle
  
  @js.native
  sealed trait open
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle
  
  @js.native
  sealed trait oval
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle
  
  @js.native
  sealed trait stealth
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle
  
  @js.native
  sealed trait triangle
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle
  
  /* "Diamond" */ val diamond: diamond with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Open" */ val open: open with java.lang.String = js.native
  /* "Oval" */ val oval: oval with java.lang.String = js.native
  /* "Stealth" */ val stealth: stealth with java.lang.String = js.native
  /* "Triangle" */ val triangle: triangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle with java.lang.String] = js.native
}

