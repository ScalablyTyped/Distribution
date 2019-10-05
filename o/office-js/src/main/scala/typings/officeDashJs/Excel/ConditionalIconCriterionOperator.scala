package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalIconCriterionOperator extends js.Object

/**
  *
  * Represents the operator for each icon criteria.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalIconCriterionOperator")
@js.native
object ConditionalIconCriterionOperator extends js.Object {
  @js.native
  sealed trait greaterThan extends ConditionalIconCriterionOperator
  
  @js.native
  sealed trait greaterThanOrEqual extends ConditionalIconCriterionOperator
  
  @js.native
  sealed trait invalid extends ConditionalIconCriterionOperator
  
  /* "GreaterThan" */ val greaterThan: typings.officeDashJs.Excel.ConditionalIconCriterionOperator.greaterThan with String = js.native
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: typings.officeDashJs.Excel.ConditionalIconCriterionOperator.greaterThanOrEqual with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.Excel.ConditionalIconCriterionOperator.invalid with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalIconCriterionOperator with String] = js.native
}

