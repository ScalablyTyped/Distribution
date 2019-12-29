package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextVerticalOverflow extends js.Object

/**
  *
  * Specifies the vertical overflow for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextVerticalOverflow")
@js.native
object ShapeTextVerticalOverflow extends js.Object {
  /**
    *
    * Hide text that does not fit vertically within the text frame.
    *
    */
  @js.native
  sealed trait clip extends ShapeTextVerticalOverflow
  
  /**
    *
    * Hide text that does not fit vertically within the text frame, and add an ellipsis (...) at the end of the visible text.
    *
    */
  @js.native
  sealed trait ellipsis extends ShapeTextVerticalOverflow
  
  /**
    *
    * Allow text to overflow the text frame vertically (can be from the top, bottom, or both depending on the text alignment).
    *
    */
  @js.native
  sealed trait overflow extends ShapeTextVerticalOverflow
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextVerticalOverflow with String] = js.native
  /* "Clip" */ @js.native
  object clip extends TopLevel[clip with String]
  
  /* "Ellipsis" */ @js.native
  object ellipsis extends TopLevel[ellipsis with String]
  
  /* "Overflow" */ @js.native
  object overflow extends TopLevel[overflow with String]
  
}

