package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalFormatRule.toJSON()`. */
@js.native
trait ConditionalFormatRuleData extends js.Object {
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[String] = js.native
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[String] = js.native
}
object ConditionalFormatRuleData {
  
  @scala.inline
  def apply(): ConditionalFormatRuleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRuleData]
  }
  
  @scala.inline
  implicit class ConditionalFormatRuleDataOps[Self <: ConditionalFormatRuleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setFormulaLocal(value: String): Self = this.set("formulaLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulaLocal: Self = this.set("formulaLocal", js.undefined)
    
    @scala.inline
    def setFormulaR1C1(value: String): Self = this.set("formulaR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulaR1C1: Self = this.set("formulaR1C1", js.undefined)
  }
}
