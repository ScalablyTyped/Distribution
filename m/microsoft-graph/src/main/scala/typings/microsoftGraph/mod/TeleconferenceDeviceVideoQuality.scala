package typings.microsoftGraph.mod

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
  implicit class TeleconferenceDeviceVideoQualityOps[Self <: TeleconferenceDeviceVideoQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAverageInboundBitRate(value: NullableOption[Double]): Self = this.set("averageInboundBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageInboundBitRate: Self = this.set("averageInboundBitRate", js.undefined)
    
    @scala.inline
    def setAverageInboundBitRateNull: Self = this.set("averageInboundBitRate", null)
    
    @scala.inline
    def setAverageInboundFrameRate(value: NullableOption[Double]): Self = this.set("averageInboundFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageInboundFrameRate: Self = this.set("averageInboundFrameRate", js.undefined)
    
    @scala.inline
    def setAverageInboundFrameRateNull: Self = this.set("averageInboundFrameRate", null)
    
    @scala.inline
    def setAverageOutboundBitRate(value: NullableOption[Double]): Self = this.set("averageOutboundBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageOutboundBitRate: Self = this.set("averageOutboundBitRate", js.undefined)
    
    @scala.inline
    def setAverageOutboundBitRateNull: Self = this.set("averageOutboundBitRate", null)
    
    @scala.inline
    def setAverageOutboundFrameRate(value: NullableOption[Double]): Self = this.set("averageOutboundFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageOutboundFrameRate: Self = this.set("averageOutboundFrameRate", js.undefined)
    
    @scala.inline
    def setAverageOutboundFrameRateNull: Self = this.set("averageOutboundFrameRate", null)
  }
}
