package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Clip" */ val clip: typings.officeDashJsDashPreview.ExcelNs.ShapeTextVerticalOverflow.clip with String = js.native
  /* "Ellipsis" */ val ellipsis: typings.officeDashJsDashPreview.ExcelNs.ShapeTextVerticalOverflow.ellipsis with String = js.native
  /* "Overflow" */ val overflow: typings.officeDashJsDashPreview.ExcelNs.ShapeTextVerticalOverflow.overflow with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextVerticalOverflow with String] = js.native
}

