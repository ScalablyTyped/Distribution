package typings.officeDashJsDashPreview.Excel

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
  
  /* "Between" */ val between: typings.officeDashJsDashPreview.Excel.DataValidationOperator.between with String = js.native
  /* "EqualTo" */ val equalTo: typings.officeDashJsDashPreview.Excel.DataValidationOperator.equalTo with String = js.native
  /* "GreaterThan" */ val greaterThan: typings.officeDashJsDashPreview.Excel.DataValidationOperator.greaterThan with String = js.native
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeDashJsDashPreview.Excel.DataValidationOperator.greaterThanOrEqualTo with String = js.native
  /* "LessThan" */ val lessThan: typings.officeDashJsDashPreview.Excel.DataValidationOperator.lessThan with String = js.native
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeDashJsDashPreview.Excel.DataValidationOperator.lessThanOrEqualTo with String = js.native
  /* "NotBetween" */ val notBetween: typings.officeDashJsDashPreview.Excel.DataValidationOperator.notBetween with String = js.native
  /* "NotEqualTo" */ val notEqualTo: typings.officeDashJsDashPreview.Excel.DataValidationOperator.notEqualTo with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationOperator with String] = js.native
}

