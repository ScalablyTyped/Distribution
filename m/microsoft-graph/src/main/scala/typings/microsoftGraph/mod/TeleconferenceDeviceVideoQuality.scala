package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeleconferenceDeviceVideoQuality extends TeleconferenceDeviceMediaQuality {
  
  // The average inbound stream video bit rate per second.
  var averageInboundBitRate: js.UndefOr[NullableOption[Double]] = js.native
  
  // The average inbound stream video frame rate per second.
  var averageInboundFrameRate: js.UndefOr[NullableOption[Double]] = js.native
  
  // The average outbound stream video bit rate per second.
  var averageOutboundBitRate: js.UndefOr[NullableOption[Double]] = js.native
  
  // The average outbound stream video frame rate per second.
  var averageOutboundFrameRate: js.UndefOr[NullableOption[Double]] = js.native
}
object TeleconferenceDeviceVideoQuality {
  
  @scala.inline
  def apply(): TeleconferenceDeviceVideoQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeleconferenceDeviceVideoQuality]
  }
  
  @scala.inline
  implicit class TeleconferenceDeviceVideoQualityMutableBuilder[Self <: TeleconferenceDeviceVideoQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageInboundBitRate(value: NullableOption[Double]): Self = StObject.set(x, "averageInboundBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageInboundBitRateNull: Self = StObject.set(x, "averageInboundBitRate", null)
    
    @scala.inline
    def setAverageInboundBitRateUndefined: Self = StObject.set(x, "averageInboundBitRate", js.undefined)
    
    @scala.inline
    def setAverageInboundFrameRate(value: NullableOption[Double]): Self = StObject.set(x, "averageInboundFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageInboundFrameRateNull: Self = StObject.set(x, "averageInboundFrameRate", null)
    
    @scala.inline
    def setAverageInboundFrameRateUndefined: Self = StObject.set(x, "averageInboundFrameRate", js.undefined)
    
    @scala.inline
    def setAverageOutboundBitRate(value: NullableOption[Double]): Self = StObject.set(x, "averageOutboundBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageOutboundBitRateNull: Self = StObject.set(x, "averageOutboundBitRate", null)
    
    @scala.inline
    def setAverageOutboundBitRateUndefined: Self = StObject.set(x, "averageOutboundBitRate", js.undefined)
    
    @scala.inline
    def setAverageOutboundFrameRate(value: NullableOption[Double]): Self = StObject.set(x, "averageOutboundFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageOutboundFrameRateNull: Self = StObject.set(x, "averageOutboundFrameRate", null)
    
    @scala.inline
    def setAverageOutboundFrameRateUndefined: Self = StObject.set(x, "averageOutboundFrameRate", js.undefined)
  }
}
