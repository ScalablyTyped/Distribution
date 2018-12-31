package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait context
    extends officeDashJsDashPreviewLib.ExcelNs.ReadingOrder
  
  /**
    *
    * Left to right reading order
    *
    */
  @js.native
  sealed trait leftToRight
    extends officeDashJsDashPreviewLib.ExcelNs.ReadingOrder
  
  /**
    *
    * Right to left reading order
    *
    */
  @js.native
  sealed trait rightToLeft
    extends officeDashJsDashPreviewLib.ExcelNs.ReadingOrder
  
  /* "Context" */ val context: context with java.lang.String = js.native
  /* "LeftToRight" */ val leftToRight: leftToRight with java.lang.String = js.native
  /* "RightToLeft" */ val rightToLeft: rightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ReadingOrder with java.lang.String] = js.native
}

