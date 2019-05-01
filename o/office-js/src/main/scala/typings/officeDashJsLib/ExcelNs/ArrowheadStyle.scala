package typings
package officeDashJsLib.ExcelNs

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
    extends officeDashJsLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait open
    extends officeDashJsLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait oval
    extends officeDashJsLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait stealth
    extends officeDashJsLib.ExcelNs.ArrowheadStyle
  
  @js.native
  sealed trait triangle
    extends officeDashJsLib.ExcelNs.ArrowheadStyle
  
  /* "Diamond" */ val diamond: diamond with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Open" */ val open: open with java.lang.String = js.native
  /* "Oval" */ val oval: oval with java.lang.String = js.native
  /* "Stealth" */ val stealth: stealth with java.lang.String = js.native
  /* "Triangle" */ val triangle: triangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ArrowheadStyle with java.lang.String] = js.native
}

