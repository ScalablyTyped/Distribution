package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait clip
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalOverflow
  
  /**
    *
    * Hide text that does not fit vertically within the text frame, and add an ellipsis (...) at the end of the visible text.
    *
    */
  @js.native
  sealed trait ellipsis
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalOverflow
  
  /**
    *
    * Allow text to overflow the text frame vertically (can be from the top, bottom, or both depending on the text alignment).
    *
    */
  @js.native
  sealed trait overflow
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalOverflow
  
  /* "Clip" */ val clip: clip with java.lang.String = js.native
  /* "Ellipsis" */ val ellipsis: ellipsis with java.lang.String = js.native
  /* "Overflow" */ val overflow: overflow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalOverflow with java.lang.String
  ] = js.native
}

