package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipDisplayTooltipLabel extends js.Object {
  
  var tooltipDisplay: js.UndefOr[off | auto] = js.native
  
  var tooltipLabel: js.UndefOr[String] = js.native
}
object TooltipDisplayTooltipLabel {
  
  @scala.inline
  def apply(): TooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipDisplayTooltipLabel]
  }
  
  @scala.inline
  implicit class TooltipDisplayTooltipLabelOps[Self <: TooltipDisplayTooltipLabel] (val x: Self) extends AnyVal {
    
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
    def setTooltipDisplay(value: off | auto): Self = this.set("tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipDisplay: Self = this.set("tooltipDisplay", js.undefined)
    
    @scala.inline
    def setTooltipLabel(value: String): Self = this.set("tooltipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipLabel: Self = this.set("tooltipLabel", js.undefined)
  }
}
