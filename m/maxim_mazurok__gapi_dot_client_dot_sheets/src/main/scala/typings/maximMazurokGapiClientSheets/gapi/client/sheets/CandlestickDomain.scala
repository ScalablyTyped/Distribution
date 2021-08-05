package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandlestickDomain extends StObject {
  
  /** The data of the CandlestickDomain. */
  var data: js.UndefOr[ChartData] = js.undefined
  
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object CandlestickDomain {
  
  inline def apply(): CandlestickDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickDomain]
  }
  
  extension [Self <: CandlestickDomain](x: Self) {
    
    inline def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
