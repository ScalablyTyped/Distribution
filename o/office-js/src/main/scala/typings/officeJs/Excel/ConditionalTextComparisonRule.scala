package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.BeginsWith
import typings.officeJs.officeJsStrings.Contains
import typings.officeJs.officeJsStrings.EndsWith
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.NotContains
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cell value conditional format rule.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTextComparisonRule extends StObject {
  
  /**
    * The operator of the text conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith
  
  /**
    * The text value of the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var text: String
}
object ConditionalTextComparisonRule {
  
  inline def apply(
    operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith,
    text: String
  ): ConditionalTextComparisonRule = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTextComparisonRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalTextComparisonRule] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
