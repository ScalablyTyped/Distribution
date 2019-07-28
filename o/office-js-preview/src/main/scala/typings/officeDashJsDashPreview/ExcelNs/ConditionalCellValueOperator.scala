package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Between" */ val between: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.between with String = js.native
  /* "EqualTo" */ val equalTo: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.equalTo with String = js.native
  /* "GreaterThan" */ val greaterThan: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.greaterThan with String = js.native
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.greaterThanOrEqual with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.invalid with String = js.native
  /* "LessThan" */ val lessThan: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.lessThan with String = js.native
  /* "LessThanOrEqual" */ val lessThanOrEqual: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.lessThanOrEqual with String = js.native
  /* "NotBetween" */ val notBetween: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.notBetween with String = js.native
  /* "NotEqualTo" */ val notEqualTo: typings.officeDashJsDashPreview.ExcelNs.ConditionalCellValueOperator.notEqualTo with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalCellValueOperator with String] = js.native
}

