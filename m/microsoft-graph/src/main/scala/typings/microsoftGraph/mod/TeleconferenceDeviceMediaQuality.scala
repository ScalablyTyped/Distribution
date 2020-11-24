package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeleconferenceDeviceMediaQuality extends js.Object {
  
  // The average inbound stream network jitter.
  var averageInboundJitter: js.UndefOr[NullableOption[String]] = js.native
  
  // The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var averageInboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.native
  
  // The average inbound stream network round trip delay.
  var averageInboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.native
  
  // The average outbound stream network jitter.
  var averageOutboundJitter: js.UndefOr[NullableOption[String]] = js.native
  
  // The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var averageOutboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.native
  
  // The average outbound stream network round trip delay.
  var averageOutboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The channel index of media. Indexing begins with 1. If a media session contains 3 video modalities, channel indexes
    * will be 1, 2, and 3.
    */
  var channelIndex: js.UndefOr[Double] = js.native
  
  // The total number of the inbound packets.
  var inboundPackets: js.UndefOr[NullableOption[Double]] = js.native
  
  // the local IP address for the media session.
  var localIPAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // The local media port.
  var localPort: js.UndefOr[NullableOption[Double]] = js.native
  
  // The maximum inbound stream network jitter.
  var maximumInboundJitter: js.UndefOr[NullableOption[String]] = js.native
  
  // The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var maximumInboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.native
  
  // The maximum inbound stream network round trip delay.
  var maximumInboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.native
  
  // The maximum outbound stream network jitter.
  var maximumOutboundJitter: js.UndefOr[NullableOption[String]] = js.native
  
  // The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var maximumOutboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.native
  
  // The maximum outbound stream network round trip delay.
  var maximumOutboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all
    * of the durations.
    */
  var mediaDuration: js.UndefOr[NullableOption[String]] = js.native
  
  // The network link speed in bytes
  var networkLinkSpeedInBytes: js.UndefOr[NullableOption[Double]] = js.native
  
  // The total number of the outbound packets.
  var outboundPackets: js.UndefOr[NullableOption[Double]] = js.native
  
  // The remote IP address for the media session.
  var remoteIPAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // The remote media port.
  var remotePort: js.UndefOr[NullableOption[Double]] = js.native
}
object TeleconferenceDeviceMediaQuality {
  
  @scala.inline
  def apply(): TeleconferenceDeviceMediaQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeleconferenceDeviceMediaQuality]
  }
  
  @scala.inline
  implicit class TeleconferenceDeviceMediaQualityOps[Self <: TeleconferenceDeviceMediaQuality] (val x: Self) extends AnyVal {
    
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
    def setAverageInboundJitter(value: NullableOption[String]): Self = this.set("averageInboundJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageInboundJitter: Self = this.set("averageInboundJitter", js.undefined)
    
    @scala.inline
    def setAverageInboundJitterNull: Self = this.set("averageInboundJitter", null)
    
    @scala.inline
    def setAverageInboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = this.set("averageInboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageInboundPacketLossRateInPercentage: Self = this.set("averageInboundPacketLossRateInPercentage", js.undefined)
    
    @scala.inline
    def setAverageInboundPacketLossRateInPercentageNull: Self = this.set("averageInboundPacketLossRateInPercentage", null)
    
    @scala.inline
    def setAverageInboundRoundTripDelay(value: NullableOption[String]): Self = this.set("averageInboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageInboundRoundTripDelay: Self = this.set("averageInboundRoundTripDelay", js.undefined)
    
    @scala.inline
    def setAverageInboundRoundTripDelayNull: Self = this.set("averageInboundRoundTripDelay", null)
    
    @scala.inline
    def setAverageOutboundJitter(value: NullableOption[String]): Self = this.set("averageOutboundJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageOutboundJitter: Self = this.set("averageOutboundJitter", js.undefined)
    
    @scala.inline
    def setAverageOutboundJitterNull: Self = this.set("averageOutboundJitter", null)
    
    @scala.inline
    def setAverageOutboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = this.set("averageOutboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageOutboundPacketLossRateInPercentage: Self = this.set("averageOutboundPacketLossRateInPercentage", js.undefined)
    
    @scala.inline
    def setAverageOutboundPacketLossRateInPercentageNull: Self = this.set("averageOutboundPacketLossRateInPercentage", null)
    
    @scala.inline
    def setAverageOutboundRoundTripDelay(value: NullableOption[String]): Self = this.set("averageOutboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageOutboundRoundTripDelay: Self = this.set("averageOutboundRoundTripDelay", js.undefined)
    
    @scala.inline
    def setAverageOutboundRoundTripDelayNull: Self = this.set("averageOutboundRoundTripDelay", null)
    
    @scala.inline
    def setChannelIndex(value: Double): Self = this.set("channelIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelIndex: Self = this.set("channelIndex", js.undefined)
    
    @scala.inline
    def setInboundPackets(value: NullableOption[Double]): Self = this.set("inboundPackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundPackets: Self = this.set("inboundPackets", js.undefined)
    
    @scala.inline
    def setInboundPacketsNull: Self = this.set("inboundPackets", null)
    
    @scala.inline
    def setLocalIPAddress(value: NullableOption[String]): Self = this.set("localIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalIPAddress: Self = this.set("localIPAddress", js.undefined)
    
    @scala.inline
    def setLocalIPAddressNull: Self = this.set("localIPAddress", null)
    
    @scala.inline
    def setLocalPort(value: NullableOption[Double]): Self = this.set("localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
    
    @scala.inline
    def setLocalPortNull: Self = this.set("localPort", null)
    
    @scala.inline
    def setMaximumInboundJitter(value: NullableOption[String]): Self = this.set("maximumInboundJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumInboundJitter: Self = this.set("maximumInboundJitter", js.undefined)
    
    @scala.inline
    def setMaximumInboundJitterNull: Self = this.set("maximumInboundJitter", null)
    
    @scala.inline
    def setMaximumInboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = this.set("maximumInboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumInboundPacketLossRateInPercentage: Self = this.set("maximumInboundPacketLossRateInPercentage", js.undefined)
    
    @scala.inline
    def setMaximumInboundPacketLossRateInPercentageNull: Self = this.set("maximumInboundPacketLossRateInPercentage", null)
    
    @scala.inline
    def setMaximumInboundRoundTripDelay(value: NullableOption[String]): Self = this.set("maximumInboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumInboundRoundTripDelay: Self = this.set("maximumInboundRoundTripDelay", js.undefined)
    
    @scala.inline
    def setMaximumInboundRoundTripDelayNull: Self = this.set("maximumInboundRoundTripDelay", null)
    
    @scala.inline
    def setMaximumOutboundJitter(value: NullableOption[String]): Self = this.set("maximumOutboundJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumOutboundJitter: Self = this.set("maximumOutboundJitter", js.undefined)
    
    @scala.inline
    def setMaximumOutboundJitterNull: Self = this.set("maximumOutboundJitter", null)
    
    @scala.inline
    def setMaximumOutboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = this.set("maximumOutboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumOutboundPacketLossRateInPercentage: Self = this.set("maximumOutboundPacketLossRateInPercentage", js.undefined)
    
    @scala.inline
    def setMaximumOutboundPacketLossRateInPercentageNull: Self = this.set("maximumOutboundPacketLossRateInPercentage", null)
    
    @scala.inline
    def setMaximumOutboundRoundTripDelay(value: NullableOption[String]): Self = this.set("maximumOutboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumOutboundRoundTripDelay: Self = this.set("maximumOutboundRoundTripDelay", js.undefined)
    
    @scala.inline
    def setMaximumOutboundRoundTripDelayNull: Self = this.set("maximumOutboundRoundTripDelay", null)
    
    @scala.inline
    def setMediaDuration(value: NullableOption[String]): Self = this.set("mediaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaDuration: Self = this.set("mediaDuration", js.undefined)
    
    @scala.inline
    def setMediaDurationNull: Self = this.set("mediaDuration", null)
    
    @scala.inline
    def setNetworkLinkSpeedInBytes(value: NullableOption[Double]): Self = this.set("networkLinkSpeedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkLinkSpeedInBytes: Self = this.set("networkLinkSpeedInBytes", js.undefined)
    
    @scala.inline
    def setNetworkLinkSpeedInBytesNull: Self = this.set("networkLinkSpeedInBytes", null)
    
    @scala.inline
    def setOutboundPackets(value: NullableOption[Double]): Self = this.set("outboundPackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutboundPackets: Self = this.set("outboundPackets", js.undefined)
    
    @scala.inline
    def setOutboundPacketsNull: Self = this.set("outboundPackets", null)
    
    @scala.inline
    def setRemoteIPAddress(value: NullableOption[String]): Self = this.set("remoteIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIPAddress: Self = this.set("remoteIPAddress", js.undefined)
    
    @scala.inline
    def setRemoteIPAddressNull: Self = this.set("remoteIPAddress", null)
    
    @scala.inline
    def setRemotePort(value: NullableOption[Double]): Self = this.set("remotePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemotePort: Self = this.set("remotePort", js.undefined)
    
    @scala.inline
    def setRemotePortNull: Self = this.set("remotePort", null)
  }
}
