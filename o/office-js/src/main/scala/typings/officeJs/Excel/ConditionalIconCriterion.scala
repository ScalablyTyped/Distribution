package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Formula
import typings.officeJs.officeJsStrings.GreaterThan
import typings.officeJs.officeJsStrings.GreaterThanOrEqual
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.Number
import typings.officeJs.officeJsStrings.Percent
import typings.officeJs.officeJsStrings.Percentile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an icon criterion which contains a type, value, an operator, and an optional custom icon, if not using an icon set.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalIconCriterion extends StObject {
  
  /**
    * The custom icon for the current criterion, if different from the default icon set, else `null` will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var customIcon: js.UndefOr[Icon] = js.undefined
  
  /**
    * A number or a formula depending on the type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula: String
  
  /**
    * `greaterThan` or `greaterThanOrEqual` for each of the rule types for the icon conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual
  
  /**
    * What the icon conditional formula should be based on.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile
}
object ConditionalIconCriterion {
  
  inline def apply(
    formula: String,
    operator: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual,
    `type`: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile
  ): ConditionalIconCriterion = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalIconCriterion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalIconCriterion] (val x: Self) extends AnyVal {
    
    inline def setCustomIcon(value: Icon): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
    
    inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
