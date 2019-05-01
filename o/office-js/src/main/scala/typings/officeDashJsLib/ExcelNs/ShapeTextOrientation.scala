package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextOrientation extends js.Object

/**
  *
  * Specifies the orientation for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextOrientation")
@js.native
object ShapeTextOrientation extends js.Object {
  @js.native
  sealed trait eastAsianVertical
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait horizontal
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait mongolianVertical
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait vertical
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait vertical270
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVertical
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVerticalRTL
    extends officeDashJsLib.ExcelNs.ShapeTextOrientation
  
  /* "EastAsianVertical" */ val eastAsianVertical: eastAsianVertical with java.lang.String = js.native
  /* "Horizontal" */ val horizontal: horizontal with java.lang.String = js.native
  /* "MongolianVertical" */ val mongolianVertical: mongolianVertical with java.lang.String = js.native
  /* "Vertical" */ val vertical: vertical with java.lang.String = js.native
  /* "Vertical270" */ val vertical270: vertical270 with java.lang.String = js.native
  /* "WordArtVertical" */ val wordArtVertical: wordArtVertical with java.lang.String = js.native
  /* "WordArtVerticalRTL" */ val wordArtVerticalRTL: wordArtVerticalRTL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeTextOrientation with java.lang.String] = js.native
}

