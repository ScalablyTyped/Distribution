package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeleconferenceDeviceMediaQuality extends StObject {
  
  // The average inbound stream network jitter.
  var averageInboundJitter: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var averageInboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The average inbound stream network round trip delay.
  var averageInboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The average outbound stream network jitter.
  var averageOutboundJitter: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var averageOutboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The average outbound stream network round trip delay.
  var averageOutboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The channel index of media. Indexing begins with 1. If a media session contains 3 video modalities, channel indexes
    * will be 1, 2, and 3.
    */
  var channelIndex: js.UndefOr[Double] = js.undefined
  
  // The total number of the inbound packets.
  var inboundPackets: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // the local IP address for the media session.
  var localIPAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The local media port.
  var localPort: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The maximum inbound stream network jitter.
  var maximumInboundJitter: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var maximumInboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The maximum inbound stream network round trip delay.
  var maximumInboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The maximum outbound stream network jitter.
  var maximumOutboundJitter: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
  var maximumOutboundPacketLossRateInPercentage: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The maximum outbound stream network round trip delay.
  var maximumOutboundRoundTripDelay: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all
    * of the durations.
    */
  var mediaDuration: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The network link speed in bytes
  var networkLinkSpeedInBytes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The total number of the outbound packets.
  var outboundPackets: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The remote IP address for the media session.
  var remoteIPAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The remote media port.
  var remotePort: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TeleconferenceDeviceMediaQuality {
  
  inline def apply(): TeleconferenceDeviceMediaQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeleconferenceDeviceMediaQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeleconferenceDeviceMediaQuality] (val x: Self) extends AnyVal {
    
    inline def setAverageInboundJitter(value: NullableOption[String]): Self = StObject.set(x, "averageInboundJitter", value.asInstanceOf[js.Any])
    
    inline def setAverageInboundJitterNull: Self = StObject.set(x, "averageInboundJitter", null)
    
    inline def setAverageInboundJitterUndefined: Self = StObject.set(x, "averageInboundJitter", js.undefined)
    
    inline def setAverageInboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = StObject.set(x, "averageInboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    inline def setAverageInboundPacketLossRateInPercentageNull: Self = StObject.set(x, "averageInboundPacketLossRateInPercentage", null)
    
    inline def setAverageInboundPacketLossRateInPercentageUndefined: Self = StObject.set(x, "averageInboundPacketLossRateInPercentage", js.undefined)
    
    inline def setAverageInboundRoundTripDelay(value: NullableOption[String]): Self = StObject.set(x, "averageInboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    inline def setAverageInboundRoundTripDelayNull: Self = StObject.set(x, "averageInboundRoundTripDelay", null)
    
    inline def setAverageInboundRoundTripDelayUndefined: Self = StObject.set(x, "averageInboundRoundTripDelay", js.undefined)
    
    inline def setAverageOutboundJitter(value: NullableOption[String]): Self = StObject.set(x, "averageOutboundJitter", value.asInstanceOf[js.Any])
    
    inline def setAverageOutboundJitterNull: Self = StObject.set(x, "averageOutboundJitter", null)
    
    inline def setAverageOutboundJitterUndefined: Self = StObject.set(x, "averageOutboundJitter", js.undefined)
    
    inline def setAverageOutboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = StObject.set(x, "averageOutboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    inline def setAverageOutboundPacketLossRateInPercentageNull: Self = StObject.set(x, "averageOutboundPacketLossRateInPercentage", null)
    
    inline def setAverageOutboundPacketLossRateInPercentageUndefined: Self = StObject.set(x, "averageOutboundPacketLossRateInPercentage", js.undefined)
    
    inline def setAverageOutboundRoundTripDelay(value: NullableOption[String]): Self = StObject.set(x, "averageOutboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    inline def setAverageOutboundRoundTripDelayNull: Self = StObject.set(x, "averageOutboundRoundTripDelay", null)
    
    inline def setAverageOutboundRoundTripDelayUndefined: Self = StObject.set(x, "averageOutboundRoundTripDelay", js.undefined)
    
    inline def setChannelIndex(value: Double): Self = StObject.set(x, "channelIndex", value.asInstanceOf[js.Any])
    
    inline def setChannelIndexUndefined: Self = StObject.set(x, "channelIndex", js.undefined)
    
    inline def setInboundPackets(value: NullableOption[Double]): Self = StObject.set(x, "inboundPackets", value.asInstanceOf[js.Any])
    
    inline def setInboundPacketsNull: Self = StObject.set(x, "inboundPackets", null)
    
    inline def setInboundPacketsUndefined: Self = StObject.set(x, "inboundPackets", js.undefined)
    
    inline def setLocalIPAddress(value: NullableOption[String]): Self = StObject.set(x, "localIPAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalIPAddressNull: Self = StObject.set(x, "localIPAddress", null)
    
    inline def setLocalIPAddressUndefined: Self = StObject.set(x, "localIPAddress", js.undefined)
    
    inline def setLocalPort(value: NullableOption[Double]): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setLocalPortNull: Self = StObject.set(x, "localPort", null)
    
    inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
    
    inline def setMaximumInboundJitter(value: NullableOption[String]): Self = StObject.set(x, "maximumInboundJitter", value.asInstanceOf[js.Any])
    
    inline def setMaximumInboundJitterNull: Self = StObject.set(x, "maximumInboundJitter", null)
    
    inline def setMaximumInboundJitterUndefined: Self = StObject.set(x, "maximumInboundJitter", js.undefined)
    
    inline def setMaximumInboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = StObject.set(x, "maximumInboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    inline def setMaximumInboundPacketLossRateInPercentageNull: Self = StObject.set(x, "maximumInboundPacketLossRateInPercentage", null)
    
    inline def setMaximumInboundPacketLossRateInPercentageUndefined: Self = StObject.set(x, "maximumInboundPacketLossRateInPercentage", js.undefined)
    
    inline def setMaximumInboundRoundTripDelay(value: NullableOption[String]): Self = StObject.set(x, "maximumInboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    inline def setMaximumInboundRoundTripDelayNull: Self = StObject.set(x, "maximumInboundRoundTripDelay", null)
    
    inline def setMaximumInboundRoundTripDelayUndefined: Self = StObject.set(x, "maximumInboundRoundTripDelay", js.undefined)
    
    inline def setMaximumOutboundJitter(value: NullableOption[String]): Self = StObject.set(x, "maximumOutboundJitter", value.asInstanceOf[js.Any])
    
    inline def setMaximumOutboundJitterNull: Self = StObject.set(x, "maximumOutboundJitter", null)
    
    inline def setMaximumOutboundJitterUndefined: Self = StObject.set(x, "maximumOutboundJitter", js.undefined)
    
    inline def setMaximumOutboundPacketLossRateInPercentage(value: NullableOption[Double]): Self = StObject.set(x, "maximumOutboundPacketLossRateInPercentage", value.asInstanceOf[js.Any])
    
    inline def setMaximumOutboundPacketLossRateInPercentageNull: Self = StObject.set(x, "maximumOutboundPacketLossRateInPercentage", null)
    
    inline def setMaximumOutboundPacketLossRateInPercentageUndefined: Self = StObject.set(x, "maximumOutboundPacketLossRateInPercentage", js.undefined)
    
    inline def setMaximumOutboundRoundTripDelay(value: NullableOption[String]): Self = StObject.set(x, "maximumOutboundRoundTripDelay", value.asInstanceOf[js.Any])
    
    inline def setMaximumOutboundRoundTripDelayNull: Self = StObject.set(x, "maximumOutboundRoundTripDelay", null)
    
    inline def setMaximumOutboundRoundTripDelayUndefined: Self = StObject.set(x, "maximumOutboundRoundTripDelay", js.undefined)
    
    inline def setMediaDuration(value: NullableOption[String]): Self = StObject.set(x, "mediaDuration", value.asInstanceOf[js.Any])
    
    inline def setMediaDurationNull: Self = StObject.set(x, "mediaDuration", null)
    
    inline def setMediaDurationUndefined: Self = StObject.set(x, "mediaDuration", js.undefined)
    
    inline def setNetworkLinkSpeedInBytes(value: NullableOption[Double]): Self = StObject.set(x, "networkLinkSpeedInBytes", value.asInstanceOf[js.Any])
    
    inline def setNetworkLinkSpeedInBytesNull: Self = StObject.set(x, "networkLinkSpeedInBytes", null)
    
    inline def setNetworkLinkSpeedInBytesUndefined: Self = StObject.set(x, "networkLinkSpeedInBytes", js.undefined)
    
    inline def setOutboundPackets(value: NullableOption[Double]): Self = StObject.set(x, "outboundPackets", value.asInstanceOf[js.Any])
    
    inline def setOutboundPacketsNull: Self = StObject.set(x, "outboundPackets", null)
    
    inline def setOutboundPacketsUndefined: Self = StObject.set(x, "outboundPackets", js.undefined)
    
    inline def setRemoteIPAddress(value: NullableOption[String]): Self = StObject.set(x, "remoteIPAddress", value.asInstanceOf[js.Any])
    
    inline def setRemoteIPAddressNull: Self = StObject.set(x, "remoteIPAddress", null)
    
    inline def setRemoteIPAddressUndefined: Self = StObject.set(x, "remoteIPAddress", js.undefined)
    
    inline def setRemotePort(value: NullableOption[Double]): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    inline def setRemotePortNull: Self = StObject.set(x, "remotePort", null)
    
    inline def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
  }
}
