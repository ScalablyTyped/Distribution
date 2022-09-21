package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data validation operator enum.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationOperator")
@js.native
object DataValidationOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataValidationOperator & String] = js.native
  
  /* "Between" */ val between: typings.officeJs.Excel.DataValidationOperator.between & String = js.native
  
  /* "EqualTo" */ val equalTo: typings.officeJs.Excel.DataValidationOperator.equalTo & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJs.Excel.DataValidationOperator.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJs.Excel.DataValidationOperator.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJs.Excel.DataValidationOperator.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJs.Excel.DataValidationOperator.lessThanOrEqualTo & String = js.native
  
  /* "NotBetween" */ val notBetween: typings.officeJs.Excel.DataValidationOperator.notBetween & String = js.native
  
  /* "NotEqualTo" */ val notEqualTo: typings.officeJs.Excel.DataValidationOperator.notEqualTo & String = js.native
}
