package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextOrientationType extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeTextOrientationType")
@js.native
object ShapeTextOrientationType extends js.Object {
  @js.native
  sealed trait eastAsianVertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait horizontal
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait mongolianVertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait shapeTextOrientationType_MaxEnumIDs
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait vertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait vertical270
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait wordArtVertical
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  @js.native
  sealed trait wordArtVerticalRTL
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType
  
  /* "EastAsianVertical" */ val eastAsianVertical: eastAsianVertical with java.lang.String = js.native
  /* "Horizontal" */ val horizontal: horizontal with java.lang.String = js.native
  /* "MongolianVertical" */ val mongolianVertical: mongolianVertical with java.lang.String = js.native
  /* "ShapeTextOrientationType_MaxEnumIDs" */ val shapeTextOrientationType_MaxEnumIDs: shapeTextOrientationType_MaxEnumIDs with java.lang.String = js.native
  /* "Vertical" */ val vertical: vertical with java.lang.String = js.native
  /* "Vertical270" */ val vertical270: vertical270 with java.lang.String = js.native
  /* "WordArtVertical" */ val wordArtVertical: wordArtVertical with java.lang.String = js.native
  /* "WordArtVerticalRTL" */ val wordArtVerticalRTL: wordArtVerticalRTL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType with java.lang.String
  ] = js.native
}

