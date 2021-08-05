package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeleconferenceDeviceVideoQuality
  extends StObject
     with TeleconferenceDeviceMediaQuality {
  
  // The average inbound stream video bit rate per second.
  var averageInboundBitRate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The average inbound stream video frame rate per second.
  var averageInboundFrameRate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The average outbound stream video bit rate per second.
  var averageOutboundBitRate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The average outbound stream video frame rate per second.
  var averageOutboundFrameRate: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TeleconferenceDeviceVideoQuality {
  
  inline def apply(): TeleconferenceDeviceVideoQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeleconferenceDeviceVideoQuality]
  }
  
  extension [Self <: TeleconferenceDeviceVideoQuality](x: Self) {
    
    inline def setAverageInboundBitRate(value: NullableOption[Double]): Self = StObject.set(x, "averageInboundBitRate", value.asInstanceOf[js.Any])
    
    inline def setAverageInboundBitRateNull: Self = StObject.set(x, "averageInboundBitRate", null)
    
    inline def setAverageInboundBitRateUndefined: Self = StObject.set(x, "averageInboundBitRate", js.undefined)
    
    inline def setAverageInboundFrameRate(value: NullableOption[Double]): Self = StObject.set(x, "averageInboundFrameRate", value.asInstanceOf[js.Any])
    
    inline def setAverageInboundFrameRateNull: Self = StObject.set(x, "averageInboundFrameRate", null)
    
    inline def setAverageInboundFrameRateUndefined: Self = StObject.set(x, "averageInboundFrameRate", js.undefined)
    
    inline def setAverageOutboundBitRate(value: NullableOption[Double]): Self = StObject.set(x, "averageOutboundBitRate", value.asInstanceOf[js.Any])
    
    inline def setAverageOutboundBitRateNull: Self = StObject.set(x, "averageOutboundBitRate", null)
    
    inline def setAverageOutboundBitRateUndefined: Self = StObject.set(x, "averageOutboundBitRate", js.undefined)
    
    inline def setAverageOutboundFrameRate(value: NullableOption[Double]): Self = StObject.set(x, "averageOutboundFrameRate", value.asInstanceOf[js.Any])
    
    inline def setAverageOutboundFrameRateNull: Self = StObject.set(x, "averageOutboundFrameRate", null)
    
    inline def setAverageOutboundFrameRateUndefined: Self = StObject.set(x, "averageOutboundFrameRate", js.undefined)
  }
}
