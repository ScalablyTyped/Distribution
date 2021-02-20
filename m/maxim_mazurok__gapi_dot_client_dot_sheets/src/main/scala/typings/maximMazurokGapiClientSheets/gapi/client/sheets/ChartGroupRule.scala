package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartGroupRule extends StObject {
  
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
  implicit class ChartGroupRuleMutableBuilder[Self <: ChartGroupRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTimeRule(value: ChartDateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
    
    @scala.inline
    def setHistogramRule(value: ChartHistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
  }
}
