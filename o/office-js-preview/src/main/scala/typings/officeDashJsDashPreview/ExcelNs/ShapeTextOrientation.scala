package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait eastAsianVertical extends ShapeTextOrientation
  
  @js.native
  sealed trait horizontal extends ShapeTextOrientation
  
  @js.native
  sealed trait mongolianVertical extends ShapeTextOrientation
  
  @js.native
  sealed trait vertical extends ShapeTextOrientation
  
  @js.native
  sealed trait vertical270 extends ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVertical extends ShapeTextOrientation
  
  @js.native
  sealed trait wordArtVerticalRTL extends ShapeTextOrientation
  
  /* "EastAsianVertical" */ val eastAsianVertical: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.eastAsianVertical with String = js.native
  /* "Horizontal" */ val horizontal: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.horizontal with String = js.native
  /* "MongolianVertical" */ val mongolianVertical: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.mongolianVertical with String = js.native
  /* "Vertical" */ val vertical: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.vertical with String = js.native
  /* "Vertical270" */ val vertical270: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.vertical270 with String = js.native
  /* "WordArtVertical" */ val wordArtVertical: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.wordArtVertical with String = js.native
  /* "WordArtVerticalRTL" */ val wordArtVerticalRTL: typings.officeDashJsDashPreview.ExcelNs.ShapeTextOrientation.wordArtVerticalRTL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextOrientation with String] = js.native
}

