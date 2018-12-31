package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalCellValueOperator extends js.Object

/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalCellValueOperator")
@js.native
object ConditionalCellValueOperator extends js.Object {
  @js.native
  sealed trait between
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait equalTo
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThan
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThanOrEqual
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThan
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThanOrEqual
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait notBetween
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait notEqualTo
    extends officeDashJsLib.ExcelNs.ConditionalCellValueOperator
  
  /* "Between" */ val between: between with java.lang.String = js.native
  /* "EqualTo" */ val equalTo: equalTo with java.lang.String = js.native
  /* "GreaterThan" */ val greaterThan: greaterThan with java.lang.String = js.native
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: greaterThanOrEqual with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "LessThan" */ val lessThan: lessThan with java.lang.String = js.native
  /* "LessThanOrEqual" */ val lessThanOrEqual: lessThanOrEqual with java.lang.String = js.native
  /* "NotBetween" */ val notBetween: notBetween with java.lang.String = js.native
  /* "NotEqualTo" */ val notEqualTo: notEqualTo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalCellValueOperator with java.lang.String] = js.native
}

