package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextOrientation extends js.Object

/**
  *
  * Specifies the orientation for the text frame in a shape.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeTextOrientation")
@js.native
object ShapeTextOrientation extends js.Object {
  @js.native
  sealed trait eastAsianVertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait horizontal
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait mongolianVertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait vertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait vertical270
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVerticalRTL
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation
  
  /* "EastAsianVertical" */ val eastAsianVertical: eastAsianVertical with java.lang.String = js.native
  /* "Horizontal" */ val horizontal: horizontal with java.lang.String = js.native
  /* "MongolianVertical" */ val mongolianVertical: mongolianVertical with java.lang.String = js.native
  /* "Vertical" */ val vertical: vertical with java.lang.String = js.native
  /* "Vertical270" */ val vertical270: vertical270 with java.lang.String = js.native
  /* "WordArtVertical" */ val wordArtVertical: wordArtVertical with java.lang.String = js.native
  /* "WordArtVerticalRTL" */ val wordArtVerticalRTL: wordArtVerticalRTL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation with java.lang.String] = js.native
}

