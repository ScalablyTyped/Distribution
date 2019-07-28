package typings.officeDashJs.ExcelNs

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
  sealed trait between extends ConditionalCellValueOperator
  
  @js.native
  sealed trait equalTo extends ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThan extends ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThanOrEqual extends ConditionalCellValueOperator
  
  @js.native
  sealed trait invalid extends ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThan extends ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThanOrEqual extends ConditionalCellValueOperator
  
  @js.native
  sealed trait notBetween extends ConditionalCellValueOperator
  
  @js.native
  sealed trait notEqualTo extends ConditionalCellValueOperator
  
  /* "Between" */ val between: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.between with String = js.native
  /* "EqualTo" */ val equalTo: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.equalTo with String = js.native
  /* "GreaterThan" */ val greaterThan: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.greaterThan with String = js.native
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.greaterThanOrEqual with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.invalid with String = js.native
  /* "LessThan" */ val lessThan: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.lessThan with String = js.native
  /* "LessThanOrEqual" */ val lessThanOrEqual: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.lessThanOrEqual with String = js.native
  /* "NotBetween" */ val notBetween: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.notBetween with String = js.native
  /* "NotEqualTo" */ val notEqualTo: typings.officeDashJs.ExcelNs.ConditionalCellValueOperator.notEqualTo with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalCellValueOperator with String] = js.native
}

