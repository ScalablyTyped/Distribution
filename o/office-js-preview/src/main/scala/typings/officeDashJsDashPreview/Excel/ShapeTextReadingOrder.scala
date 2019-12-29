package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextReadingOrder with String] = js.native
  /* "LeftToRight" */ @js.native
  object leftToRight extends TopLevel[leftToRight with String]
  
  /* "RightToLeft" */ @js.native
  object rightToLeft extends TopLevel[rightToLeft with String]
  
}

