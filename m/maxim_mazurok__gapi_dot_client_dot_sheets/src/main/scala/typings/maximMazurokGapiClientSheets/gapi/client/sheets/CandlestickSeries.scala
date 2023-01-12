package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandlestickSeries extends StObject {
  
  /** The data of the CandlestickSeries. */
  var data: js.UndefOr[ChartData] = js.undefined
}
object CandlestickSeries {
  
  inline def apply(): CandlestickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CandlestickSeries] (val x: Self) extends AnyVal {
    
    inline def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
