package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineDate extends js.Object {
  
  var baselineDate: js.UndefOr[ConverterTooltipDisplay] = js.native
  
  var baselineEnd: js.UndefOr[ConverterTooltipDisplay] = js.native
  
  var baselineStart: js.UndefOr[ConverterTooltipDisplay] = js.native
  
  var date: js.UndefOr[ConverterTooltipDisplay] = js.native
  
  var end: js.UndefOr[ConverterTooltipDisplay] = js.native
  
  var label: js.UndefOr[TooltipDisplayTooltipLabel] = js.native
  
  var progress: js.UndefOr[ConverterTooltipDisplayTooltipLabel] = js.native
  
  var row: js.UndefOr[TooltipDisplayTooltipLabel] = js.native
  
  var start: js.UndefOr[ConverterTooltipDisplay] = js.native
}
object BaselineDate {
  
  @scala.inline
  def apply(): BaselineDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineDate]
  }
  
  @scala.inline
  implicit class BaselineDateOps[Self <: BaselineDate] (val x: Self) extends AnyVal {
    
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
    def setBaselineDate(value: ConverterTooltipDisplay): Self = this.set("baselineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineDate: Self = this.set("baselineDate", js.undefined)
    
    @scala.inline
    def setBaselineEnd(value: ConverterTooltipDisplay): Self = this.set("baselineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineEnd: Self = this.set("baselineEnd", js.undefined)
    
    @scala.inline
    def setBaselineStart(value: ConverterTooltipDisplay): Self = this.set("baselineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineStart: Self = this.set("baselineStart", js.undefined)
    
    @scala.inline
    def setDate(value: ConverterTooltipDisplay): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEnd(value: ConverterTooltipDisplay): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setLabel(value: TooltipDisplayTooltipLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setProgress(value: ConverterTooltipDisplayTooltipLabel): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRow(value: TooltipDisplayTooltipLabel): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setStart(value: ConverterTooltipDisplay): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
