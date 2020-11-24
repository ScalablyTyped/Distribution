package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberRange extends js.Object {
  
  var numberRange: js.UndefOr[HintMessageDetail] = js.native
  
  var required: js.UndefOr[Hint] = js.native
  
  var tooltipDecrement: js.UndefOr[String] = js.native
  
  var tooltipIncrement: js.UndefOr[String] = js.native
}
object NumberRange {
  
  @scala.inline
  def apply(): NumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberRange]
  }
  
  @scala.inline
  implicit class NumberRangeOps[Self <: NumberRange] (val x: Self) extends AnyVal {
    
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
    def setNumberRange(value: HintMessageDetail): Self = this.set("numberRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberRange: Self = this.set("numberRange", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTooltipDecrement(value: String): Self = this.set("tooltipDecrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipDecrement: Self = this.set("tooltipDecrement", js.undefined)
    
    @scala.inline
    def setTooltipIncrement(value: String): Self = this.set("tooltipIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipIncrement: Self = this.set("tooltipIncrement", js.undefined)
  }
}
