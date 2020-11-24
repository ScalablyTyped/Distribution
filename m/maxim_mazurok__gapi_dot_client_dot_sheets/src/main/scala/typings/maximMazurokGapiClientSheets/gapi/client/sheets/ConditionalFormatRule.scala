package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalFormatRule extends js.Object {
  
  /** The formatting is either "on" or "off" according to the rule. */
  var booleanRule: js.UndefOr[BooleanRule] = js.native
  
  /** The formatting will vary based on the gradients in the rule. */
  var gradientRule: js.UndefOr[GradientRule] = js.native
  
  /** The ranges that are formatted if the condition is true. All the ranges must be on the same grid. */
  var ranges: js.UndefOr[js.Array[GridRange]] = js.native
}
object ConditionalFormatRule {
  
  @scala.inline
  def apply(): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  
  @scala.inline
  implicit class ConditionalFormatRuleOps[Self <: ConditionalFormatRule] (val x: Self) extends AnyVal {
    
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
    def setBooleanRule(value: BooleanRule): Self = this.set("booleanRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanRule: Self = this.set("booleanRule", js.undefined)
    
    @scala.inline
    def setGradientRule(value: GradientRule): Self = this.set("gradientRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientRule: Self = this.set("gradientRule", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: GridRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[GridRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
}
