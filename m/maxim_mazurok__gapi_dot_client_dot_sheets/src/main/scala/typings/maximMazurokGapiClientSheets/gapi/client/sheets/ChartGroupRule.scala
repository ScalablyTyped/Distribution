package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartGroupRule extends js.Object {
  
  /** A ChartDateTimeRule. */
  var dateTimeRule: js.UndefOr[ChartDateTimeRule] = js.native
  
  /** A ChartHistogramRule */
  var histogramRule: js.UndefOr[ChartHistogramRule] = js.native
}
object ChartGroupRule {
  
  @scala.inline
  def apply(): ChartGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGroupRule]
  }
  
  @scala.inline
  implicit class ChartGroupRuleOps[Self <: ChartGroupRule] (val x: Self) extends AnyVal {
    
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
    def setDateTimeRule(value: ChartDateTimeRule): Self = this.set("dateTimeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeRule: Self = this.set("dateTimeRule", js.undefined)
    
    @scala.inline
    def setHistogramRule(value: ChartHistogramRule): Self = this.set("histogramRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramRule: Self = this.set("histogramRule", js.undefined)
  }
}
