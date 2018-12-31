package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperator extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOperator")
@js.native
object FilterOperator extends js.Object {
  @js.native
  sealed trait and
    extends officeDashJsLib.ExcelNs.FilterOperator
  
  @js.native
  sealed trait or
    extends officeDashJsLib.ExcelNs.FilterOperator
  
  /* "And" */ val and: and with java.lang.String = js.native
  /* "Or" */ val or: or with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.FilterOperator with java.lang.String] = js.native
}

