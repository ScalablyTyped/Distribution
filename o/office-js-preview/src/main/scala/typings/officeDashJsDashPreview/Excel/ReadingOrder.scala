package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadingOrder extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ReadingOrder")
@js.native
object ReadingOrder extends js.Object {
  /**
    *
    * Reading order is determined by the language of the first character entered.
    If a right-to-left language character is entered first, reading order is right to left.
    If a left-to-right language character is entered first, reading order is left to right.
    *
    */
  @js.native
  sealed trait context extends ReadingOrder
  
  /**
    *
    * Left to right reading order
    *
    */
  @js.native
  sealed trait leftToRight extends ReadingOrder
  
  /**
    *
    * Right to left reading order
    *
    */
  @js.native
  sealed trait rightToLeft extends ReadingOrder
  
  /* "Context" */ val context: typings.officeDashJsDashPreview.Excel.ReadingOrder.context with String = js.native
  /* "LeftToRight" */ val leftToRight: typings.officeDashJsDashPreview.Excel.ReadingOrder.leftToRight with String = js.native
  /* "RightToLeft" */ val rightToLeft: typings.officeDashJsDashPreview.Excel.ReadingOrder.rightToLeft with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReadingOrder with String] = js.native
}

