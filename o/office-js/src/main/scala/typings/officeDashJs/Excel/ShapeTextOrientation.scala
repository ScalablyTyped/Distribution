package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextOrientation with String] = js.native
  /* "EastAsianVertical" */ @js.native
  object eastAsianVertical extends TopLevel[eastAsianVertical with String]
  
  /* "Horizontal" */ @js.native
  object horizontal extends TopLevel[horizontal with String]
  
  /* "MongolianVertical" */ @js.native
  object mongolianVertical extends TopLevel[mongolianVertical with String]
  
  /* "Vertical" */ @js.native
  object vertical extends TopLevel[vertical with String]
  
  /* "Vertical270" */ @js.native
  object vertical270 extends TopLevel[vertical270 with String]
  
  /* "WordArtVertical" */ @js.native
  object wordArtVertical extends TopLevel[wordArtVertical with String]
  
  /* "WordArtVerticalRTL" */ @js.native
  object wordArtVerticalRTL extends TopLevel[wordArtVerticalRTL with String]
  
}

