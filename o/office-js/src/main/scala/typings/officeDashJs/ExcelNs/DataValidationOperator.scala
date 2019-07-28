package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationOperator extends js.Object

/**
  *
  * Represents Data validation operator enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationOperator")
@js.native
object DataValidationOperator extends js.Object {
  @js.native
  sealed trait between extends DataValidationOperator
  
  @js.native
  sealed trait equalTo extends DataValidationOperator
  
  @js.native
  sealed trait greaterThan extends DataValidationOperator
  
  @js.native
  sealed trait greaterThanOrEqualTo extends DataValidationOperator
  
  @js.native
  sealed trait lessThan extends DataValidationOperator
  
  @js.native
  sealed trait lessThanOrEqualTo extends DataValidationOperator
  
  @js.native
  sealed trait notBetween extends DataValidationOperator
  
  @js.native
  sealed trait notEqualTo extends DataValidationOperator
  
  /* "Between" */ val between: typings.officeDashJs.ExcelNs.DataValidationOperator.between with String = js.native
  /* "EqualTo" */ val equalTo: typings.officeDashJs.ExcelNs.DataValidationOperator.equalTo with String = js.native
  /* "GreaterThan" */ val greaterThan: typings.officeDashJs.ExcelNs.DataValidationOperator.greaterThan with String = js.native
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeDashJs.ExcelNs.DataValidationOperator.greaterThanOrEqualTo with String = js.native
  /* "LessThan" */ val lessThan: typings.officeDashJs.ExcelNs.DataValidationOperator.lessThan with String = js.native
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeDashJs.ExcelNs.DataValidationOperator.lessThanOrEqualTo with String = js.native
  /* "NotBetween" */ val notBetween: typings.officeDashJs.ExcelNs.DataValidationOperator.notBetween with String = js.native
  /* "NotEqualTo" */ val notEqualTo: typings.officeDashJs.ExcelNs.DataValidationOperator.notEqualTo with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationOperator with String] = js.native
}

