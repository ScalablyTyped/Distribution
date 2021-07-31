package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandlestickChartSpec extends StObject {
  
  /** The Candlestick chart data. Only one CandlestickData is supported. */
  var data: js.UndefOr[js.Array[CandlestickData]] = js.undefined
  
  /** The domain data (horizontal axis) for the candlestick chart. String data will be treated as discrete labels, other data will be treated as continuous values. */
  var domain: js.UndefOr[CandlestickDomain] = js.undefined
}
object CandlestickChartSpec {
  
  @scala.inline
  def apply(): CandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickChartSpec]
  }
  
  @scala.inline
  implicit class CandlestickChartSpecMutableBuilder[Self <: CandlestickChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[CandlestickData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: CandlestickData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: CandlestickDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
