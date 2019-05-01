package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadStyle extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadStyle")
@js.native
object ArrowheadStyle extends js.Object {
  @js.native
  sealed trait diamond
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait open
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait oval
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait stealth
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait triangle
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle
  
  /* "Diamond" */ val diamond: diamond with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Open" */ val open: open with java.lang.String = js.native
  /* "Oval" */ val oval: oval with java.lang.String = js.native
  /* "Stealth" */ val stealth: stealth with java.lang.String = js.native
  /* "Triangle" */ val triangle: triangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle with java.lang.String] = js.native
}

