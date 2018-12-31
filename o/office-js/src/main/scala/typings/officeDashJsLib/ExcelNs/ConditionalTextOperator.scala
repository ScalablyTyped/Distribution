package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTextOperator extends js.Object

/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends js.Object {
  @js.native
  sealed trait beginsWith
    extends officeDashJsLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait contains
    extends officeDashJsLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait endsWith
    extends officeDashJsLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait notContains
    extends officeDashJsLib.ExcelNs.ConditionalTextOperator
  
  /* "BeginsWith" */ val beginsWith: beginsWith with java.lang.String = js.native
  /* "Contains" */ val contains: contains with java.lang.String = js.native
  /* "EndsWith" */ val endsWith: endsWith with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "NotContains" */ val notContains: notContains with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalTextOperator with java.lang.String] = js.native
}

