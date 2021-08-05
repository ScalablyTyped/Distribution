package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartGroupRule extends StObject {
  
  /** A ChartDateTimeRule. */
  var dateTimeRule: js.UndefOr[ChartDateTimeRule] = js.undefined
  
  /** A ChartHistogramRule */
  var histogramRule: js.UndefOr[ChartHistogramRule] = js.undefined
}
object ChartGroupRule {
  
  inline def apply(): ChartGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGroupRule]
  }
  
  extension [Self <: ChartGroupRule](x: Self) {
    
    inline def setDateTimeRule(value: ChartDateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
    
    inline def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
    
    inline def setHistogramRule(value: ChartHistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
    
    inline def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
  }
}
