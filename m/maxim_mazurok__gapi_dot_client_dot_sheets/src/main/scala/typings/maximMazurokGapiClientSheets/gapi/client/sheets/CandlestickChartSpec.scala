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
  
  inline def apply(): CandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickChartSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CandlestickChartSpec] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[CandlestickData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: CandlestickData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDomain(value: CandlestickDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
