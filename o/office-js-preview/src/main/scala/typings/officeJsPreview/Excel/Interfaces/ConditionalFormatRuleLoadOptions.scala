package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a rule, for all traditional rule/format pairings.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalFormatRuleLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[Boolean] = js.undefined
}
object ConditionalFormatRuleLoadOptions {
  
  inline def apply(): ConditionalFormatRuleLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRuleLoadOptions]
  }
  
  extension [Self <: ConditionalFormatRuleLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFormula(value: Boolean): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaLocal(value: Boolean): Self = StObject.set(x, "formulaLocal", value.asInstanceOf[js.Any])
    
    inline def setFormulaLocalUndefined: Self = StObject.set(x, "formulaLocal", js.undefined)
    
    inline def setFormulaR1C1(value: Boolean): Self = StObject.set(x, "formulaR1C1", value.asInstanceOf[js.Any])
    
    inline def setFormulaR1C1Undefined: Self = StObject.set(x, "formulaR1C1", js.undefined)
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
  }
}
