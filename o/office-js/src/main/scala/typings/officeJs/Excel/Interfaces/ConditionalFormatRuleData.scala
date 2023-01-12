package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalFormatRule.toJSON()`. */
trait ConditionalFormatRuleData extends StObject {
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.undefined
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule in the user's language.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[String] = js.undefined
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule in R1C1-style notation.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[String] = js.undefined
}
object ConditionalFormatRuleData {
  
  inline def apply(): ConditionalFormatRuleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRuleData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormatRuleData] (val x: Self) extends AnyVal {
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaLocal(value: String): Self = StObject.set(x, "formulaLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulaLocalUndefined: Self = StObject.set(x, "formulaLocal", js.undefined)
    
    inline def setFormulaR1C1(value: String): Self = StObject.set(x, "formulaR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulaR1C1Undefined: Self = StObject.set(x, "formulaR1C1", js.undefined)
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
  }
}
