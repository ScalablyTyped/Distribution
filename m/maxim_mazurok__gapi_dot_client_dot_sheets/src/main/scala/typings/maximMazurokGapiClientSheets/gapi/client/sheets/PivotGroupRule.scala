package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGroupRule extends StObject {
  
  /** A DateTimeRule. */
  var dateTimeRule: js.UndefOr[DateTimeRule] = js.undefined
  
  /** A HistogramRule. */
  var histogramRule: js.UndefOr[HistogramRule] = js.undefined
  
  /** A ManualRule. */
  var manualRule: js.UndefOr[ManualRule] = js.undefined
}
object PivotGroupRule {
  
  @scala.inline
  def apply(): PivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupRule]
  }
  
  @scala.inline
  implicit class PivotGroupRuleMutableBuilder[Self <: PivotGroupRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTimeRule(value: DateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
    
    @scala.inline
    def setHistogramRule(value: HistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
    
    @scala.inline
    def setManualRule(value: ManualRule): Self = StObject.set(x, "manualRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRuleUndefined: Self = StObject.set(x, "manualRule", js.undefined)
  }
}
