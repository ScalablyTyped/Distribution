package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Between
import typings.officeJsPreview.officeJsPreviewStrings.EqualTo
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqual
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.LessThan
import typings.officeJsPreview.officeJsPreviewStrings.LessThanOrEqual
import typings.officeJsPreview.officeJsPreviewStrings.NotBetween
import typings.officeJsPreview.officeJsPreviewStrings.NotEqualTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cell value conditional format rule.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalCellValueRule extends StObject {
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.undefined
  
  /**
    * The operator of the cell value conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
}
object ConditionalCellValueRule {
  
  inline def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalCellValueRule] (val x: Self) extends AnyVal {
    
    inline def setFormula1(value: String): Self = StObject.set(x, "formula1", value.asInstanceOf[js.Any])
    
    inline def setFormula2(value: String): Self = StObject.set(x, "formula2", value.asInstanceOf[js.Any])
    
    inline def setFormula2Undefined: Self = StObject.set(x, "formula2", js.undefined)
    
    inline def setOperator(
      value: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
