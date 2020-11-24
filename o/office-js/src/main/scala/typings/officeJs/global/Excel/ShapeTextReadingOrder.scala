package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the reading order for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextReadingOrder")
@js.native
object ShapeTextReadingOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeTextReadingOrder with String] = js.native
  
  /* "LeftToRight" */ val leftToRight: typings.officeJs.Excel.ShapeTextReadingOrder.leftToRight with String = js.native
  
  /* "RightToLeft" */ val rightToLeft: typings.officeJs.Excel.ShapeTextReadingOrder.rightToLeft with String = js.native
}
