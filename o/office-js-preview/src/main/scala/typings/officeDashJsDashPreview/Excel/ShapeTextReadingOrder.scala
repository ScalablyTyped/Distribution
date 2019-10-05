package typings.officeDashJsDashPreview.Excel

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
  sealed trait leftToRight extends ShapeTextReadingOrder
  
  @js.native
  sealed trait rightToLeft extends ShapeTextReadingOrder
  
  /* "LeftToRight" */ val leftToRight: typings.officeDashJsDashPreview.Excel.ShapeTextReadingOrder.leftToRight with String = js.native
  /* "RightToLeft" */ val rightToLeft: typings.officeDashJsDashPreview.Excel.ShapeTextReadingOrder.rightToLeft with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextReadingOrder with String] = js.native
}

