package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandlestickData extends StObject {
  
  /**
    * The range data (vertical axis) for the close/final value for each candle. This is the top of the candle body. If greater than the open value the candle will be filled. Otherwise the
    * candle will be hollow.
    */
  var closeSeries: js.UndefOr[CandlestickSeries] = js.native
  
  /** The range data (vertical axis) for the high/maximum value for each candle. This is the top of the candle's center line. */
  var highSeries: js.UndefOr[CandlestickSeries] = js.native
  
  /** The range data (vertical axis) for the low/minimum value for each candle. This is the bottom of the candle's center line. */
  var lowSeries: js.UndefOr[CandlestickSeries] = js.native
  
  /**
    * The range data (vertical axis) for the open/initial value for each candle. This is the bottom of the candle body. If less than the close value the candle will be filled. Otherwise
    * the candle will be hollow.
    */
  var openSeries: js.UndefOr[CandlestickSeries] = js.native
}
object CandlestickData {
  
  @scala.inline
  def apply(): CandlestickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickData]
  }
  
  @scala.inline
  implicit class CandlestickDataMutableBuilder[Self <: CandlestickData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseSeries(value: CandlestickSeries): Self = StObject.set(x, "closeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseSeriesUndefined: Self = StObject.set(x, "closeSeries", js.undefined)
    
    @scala.inline
    def setHighSeries(value: CandlestickSeries): Self = StObject.set(x, "highSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighSeriesUndefined: Self = StObject.set(x, "highSeries", js.undefined)
    
    @scala.inline
    def setLowSeries(value: CandlestickSeries): Self = StObject.set(x, "lowSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowSeriesUndefined: Self = StObject.set(x, "lowSeries", js.undefined)
    
    @scala.inline
    def setOpenSeries(value: CandlestickSeries): Self = StObject.set(x, "openSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenSeriesUndefined: Self = StObject.set(x, "openSeries", js.undefined)
  }
}
