package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextReadingOrder extends js.Object

/**
  *
  * Specifies the reading order for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextReadingOrder")
@js.native
object ShapeTextReadingOrder extends js.Object {
  @js.native
  sealed trait leftToRight
    extends officeDashJsLib.ExcelNs.ShapeTextReadingOrder
  
  @js.native
  sealed trait rightToLeft
    extends officeDashJsLib.ExcelNs.ShapeTextReadingOrder
  
  /* "LeftToRight" */ val leftToRight: leftToRight with java.lang.String = js.native
  /* "RightToLeft" */ val rightToLeft: rightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeTextReadingOrder with java.lang.String] = js.native
}

