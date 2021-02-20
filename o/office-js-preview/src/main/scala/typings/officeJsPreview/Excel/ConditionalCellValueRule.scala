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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a cell value conditional format rule.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalCellValueRule extends StObject {
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String = js.native
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.native
  
  /**
    *
    * The operator of the cell value conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual = js.native
}
object ConditionalCellValueRule {
  
  @scala.inline
  def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
  
  @scala.inline
  implicit class ConditionalCellValueRuleMutableBuilder[Self <: ConditionalCellValueRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula1(value: String): Self = StObject.set(x, "formula1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula2(value: String): Self = StObject.set(x, "formula2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula2Undefined: Self = StObject.set(x, "formula2", js.undefined)
    
    @scala.inline
    def setOperator(
      value: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
