package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.BeginsWith
import typings.officeJsPreview.officeJsPreviewStrings.Contains
import typings.officeJsPreview.officeJsPreviewStrings.EndsWith
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.NotContains
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a Cell Value Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTextComparisonRule extends StObject {
  
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith
  
  /**
    *
    * The Text value of conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var text: String
}
object ConditionalTextComparisonRule {
  
  @scala.inline
  def apply(
    operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith,
    text: String
  ): ConditionalTextComparisonRule = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTextComparisonRule]
  }
  
  @scala.inline
  implicit class ConditionalTextComparisonRuleMutableBuilder[Self <: ConditionalTextComparisonRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
