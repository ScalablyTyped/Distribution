package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandlestickSeries extends StObject {
  
  /** The data of the CandlestickSeries. */
  var data: js.UndefOr[ChartData] = js.undefined
}
object CandlestickSeries {
  
  @scala.inline
  def apply(): CandlestickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickSeries]
  }
  
  @scala.inline
  implicit class CandlestickSeriesMutableBuilder[Self <: CandlestickSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
