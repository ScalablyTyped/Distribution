package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Between
import typings.officeJsPreview.officeJsPreviewStrings.EqualTo
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.LessThan
import typings.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.NotBetween
import typings.officeJsPreview.officeJsPreviewStrings.NotEqualTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the date data validation criteria.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait DateTimeDataValidation extends StObject {
  
  /**
    * Specifies the right-hand operand when the operator property is set to a binary operator such as GreaterThan (the left-hand operand is the value the user tries to enter in the cell). With the ternary operators Between and NotBetween, specifies the lower bound operand.
    When setting the value, it can be passed in as a Date, a Range object, or a string formula (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula1: String | js.Date | Range
  
  /**
    * With the ternary operators Between and NotBetween, specifies the upper bound operand. Is not used with the binary operators, such as GreaterThan.
    When setting the value, it can be passed in as a Date, a Range object, or a string (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula2: js.UndefOr[String | js.Date | Range] = js.undefined
  
  /**
    * The operator to use for validating the data.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
}
object DateTimeDataValidation {
  
  inline def apply(
    formula1: String | js.Date | Range,
    operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
  ): DateTimeDataValidation = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeDataValidation]
  }
  
  extension [Self <: DateTimeDataValidation](x: Self) {
    
    inline def setFormula1(value: String | js.Date | Range): Self = StObject.set(x, "formula1", value.asInstanceOf[js.Any])
    
    inline def setFormula2(value: String | js.Date | Range): Self = StObject.set(x, "formula2", value.asInstanceOf[js.Any])
    
    inline def setFormula2Undefined: Self = StObject.set(x, "formula2", js.undefined)
    
    inline def setOperator(
      value: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
