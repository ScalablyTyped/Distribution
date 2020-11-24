package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents Data validation operator enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationOperator")
@js.native
object DataValidationOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataValidationOperator with String] = js.native
  
  /* "Between" */ val between: typings.officeJs.Excel.DataValidationOperator.between with String = js.native
  
  /* "EqualTo" */ val equalTo: typings.officeJs.Excel.DataValidationOperator.equalTo with String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJs.Excel.DataValidationOperator.greaterThan with String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJs.Excel.DataValidationOperator.greaterThanOrEqualTo with String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJs.Excel.DataValidationOperator.lessThan with String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJs.Excel.DataValidationOperator.lessThanOrEqualTo with String = js.native
  
  /* "NotBetween" */ val notBetween: typings.officeJs.Excel.DataValidationOperator.notBetween with String = js.native
  
  /* "NotEqualTo" */ val notEqualTo: typings.officeJs.Excel.DataValidationOperator.notEqualTo with String = js.native
}
