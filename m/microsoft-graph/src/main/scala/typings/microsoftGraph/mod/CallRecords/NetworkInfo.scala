package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends StObject {
  
  /**
    * Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to
    * cause poor quality of the audio sent.
    */
  var bandwidthLowEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
  var basicServiceSetIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Type of network used by the media endpoint. Possible values are: unknown, wired, wifi, mobile, tunnel,
    * unknownFutureValue.
    */
  var connectionType: js.UndefOr[NetworkConnectionType] = js.native
  
  /**
    * Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to
    * have real-time two-way communication.
    */
  var delayEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // DNS suffix associated with the network adapter of the media endpoint.
  var dnsSuffix: js.UndefOr[NullableOption[String]] = js.native
  
  // IP address of the media endpoint.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Link speed in bits per second reported by the network adapter used by the media endpoint.
  var linkSpeed: js.UndefOr[NullableOption[Double]] = js.native
  
  // The media access control (MAC) address of the media endpoint's network device.
  var macAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Network port number used by media endpoint.
  var port: js.UndefOr[NullableOption[Double]] = js.native
  
  // Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
  var receivedQualityEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address
    * associated to the endpoint.
    */
  var reflexiveIPAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // IP address of the media relay server allocated by the media endpoint.
  var relayIPAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Network port number allocated on the media relay server by the media endpoint.
  var relayPort: js.UndefOr[NullableOption[Double]] = js.native
  
  // Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
  var sentQualityEventRatio: js.UndefOr[NullableOption[Double]] = js.native
  
  // Subnet used for media stream by the media endpoint.
  var subnet: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * WiFi band used by the media endpoint. Possible values are: unknown, frequency24GHz, frequency50GHz, frequency60GHz,
    * unknownFutureValue.
    */
  var wifiBand: js.UndefOr[WifiBand] = js.native
  
  // Estimated remaining battery charge in percentage reported by the media endpoint.
  var wifiBatteryCharge: js.UndefOr[NullableOption[Double]] = js.native
  
  // WiFi channel used by the media endpoint.
  var wifiChannel: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by
    * endpoint.
    */
  var wifiMicrosoftDriver: js.UndefOr[NullableOption[String]] = js.native
  
  // Version of the Microsoft WiFi driver used by the media endpoint.
  var wifiMicrosoftDriverVersion: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Type of WiFi radio used by the media endpoint. Possible values are: unknown, wifi80211a, wifi80211b, wifi80211g,
    * wifi80211n, wifi80211ac, wifi80211ax, unknownFutureValue.
    */
  var wifiRadioType: js.UndefOr[WifiRadioType] = js.native
  
  // WiFi signal strength in percentage reported by the media endpoint.
  var wifiSignalStrength: js.UndefOr[NullableOption[Double]] = js.native
  
  // Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
  var wifiVendorDriver: js.UndefOr[NullableOption[String]] = js.native
  
  // Version of the WiFi driver used by the media endpoint.
  var wifiVendorDriverVersion: js.UndefOr[NullableOption[String]] = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidthLowEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "bandwidthLowEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthLowEventRatioNull: Self = StObject.set(x, "bandwidthLowEventRatio", null)
    
    @scala.inline
    def setBandwidthLowEventRatioUndefined: Self = StObject.set(x, "bandwidthLowEventRatio", js.undefined)
    
    @scala.inline
    def setBasicServiceSetIdentifier(value: NullableOption[String]): Self = StObject.set(x, "basicServiceSetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicServiceSetIdentifierNull: Self = StObject.set(x, "basicServiceSetIdentifier", null)
    
    @scala.inline
    def setBasicServiceSetIdentifierUndefined: Self = StObject.set(x, "basicServiceSetIdentifier", js.undefined)
    
    @scala.inline
    def setConnectionType(value: NetworkConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    @scala.inline
    def setDelayEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "delayEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayEventRatioNull: Self = StObject.set(x, "delayEventRatio", null)
    
    @scala.inline
    def setDelayEventRatioUndefined: Self = StObject.set(x, "delayEventRatio", js.undefined)
    
    @scala.inline
    def setDnsSuffix(value: NullableOption[String]): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSuffixNull: Self = StObject.set(x, "dnsSuffix", null)
    
    @scala.inline
    def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
    
    @scala.inline
    def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setLinkSpeed(value: NullableOption[Double]): Self = StObject.set(x, "linkSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkSpeedNull: Self = StObject.set(x, "linkSpeed", null)
    
    @scala.inline
    def setLinkSpeedUndefined: Self = StObject.set(x, "linkSpeed", js.undefined)
    
    @scala.inline
    def setMacAddress(value: NullableOption[String]): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressNull: Self = StObject.set(x, "macAddress", null)
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    @scala.inline
    def setPort(value: NullableOption[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setReceivedQualityEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "receivedQualityEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedQualityEventRatioNull: Self = StObject.set(x, "receivedQualityEventRatio", null)
    
    @scala.inline
    def setReceivedQualityEventRatioUndefined: Self = StObject.set(x, "receivedQualityEventRatio", js.undefined)
    
    @scala.inline
    def setReflexiveIPAddress(value: NullableOption[String]): Self = StObject.set(x, "reflexiveIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflexiveIPAddressNull: Self = StObject.set(x, "reflexiveIPAddress", null)
    
    @scala.inline
    def setReflexiveIPAddressUndefined: Self = StObject.set(x, "reflexiveIPAddress", js.undefined)
    
    @scala.inline
    def setRelayIPAddress(value: NullableOption[String]): Self = StObject.set(x, "relayIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayIPAddressNull: Self = StObject.set(x, "relayIPAddress", null)
    
    @scala.inline
    def setRelayIPAddressUndefined: Self = StObject.set(x, "relayIPAddress", js.undefined)
    
    @scala.inline
    def setRelayPort(value: NullableOption[Double]): Self = StObject.set(x, "relayPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayPortNull: Self = StObject.set(x, "relayPort", null)
    
    @scala.inline
    def setRelayPortUndefined: Self = StObject.set(x, "relayPort", js.undefined)
    
    @scala.inline
    def setSentQualityEventRatio(value: NullableOption[Double]): Self = StObject.set(x, "sentQualityEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentQualityEventRatioNull: Self = StObject.set(x, "sentQualityEventRatio", null)
    
    @scala.inline
    def setSentQualityEventRatioUndefined: Self = StObject.set(x, "sentQualityEventRatio", js.undefined)
    
    @scala.inline
    def setSubnet(value: NullableOption[String]): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetNull: Self = StObject.set(x, "subnet", null)
    
    @scala.inline
    def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    @scala.inline
    def setWifiBand(value: WifiBand): Self = StObject.set(x, "wifiBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiBandUndefined: Self = StObject.set(x, "wifiBand", js.undefined)
    
    @scala.inline
    def setWifiBatteryCharge(value: NullableOption[Double]): Self = StObject.set(x, "wifiBatteryCharge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiBatteryChargeNull: Self = StObject.set(x, "wifiBatteryCharge", null)
    
    @scala.inline
    def setWifiBatteryChargeUndefined: Self = StObject.set(x, "wifiBatteryCharge", js.undefined)
    
    @scala.inline
    def setWifiChannel(value: NullableOption[Double]): Self = StObject.set(x, "wifiChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiChannelNull: Self = StObject.set(x, "wifiChannel", null)
    
    @scala.inline
    def setWifiChannelUndefined: Self = StObject.set(x, "wifiChannel", js.undefined)
    
    @scala.inline
    def setWifiMicrosoftDriver(value: NullableOption[String]): Self = StObject.set(x, "wifiMicrosoftDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiMicrosoftDriverNull: Self = StObject.set(x, "wifiMicrosoftDriver", null)
    
    @scala.inline
    def setWifiMicrosoftDriverUndefined: Self = StObject.set(x, "wifiMicrosoftDriver", js.undefined)
    
    @scala.inline
    def setWifiMicrosoftDriverVersion(value: NullableOption[String]): Self = StObject.set(x, "wifiMicrosoftDriverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiMicrosoftDriverVersionNull: Self = StObject.set(x, "wifiMicrosoftDriverVersion", null)
    
    @scala.inline
    def setWifiMicrosoftDriverVersionUndefined: Self = StObject.set(x, "wifiMicrosoftDriverVersion", js.undefined)
    
    @scala.inline
    def setWifiRadioType(value: WifiRadioType): Self = StObject.set(x, "wifiRadioType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiRadioTypeUndefined: Self = StObject.set(x, "wifiRadioType", js.undefined)
    
    @scala.inline
    def setWifiSignalStrength(value: NullableOption[Double]): Self = StObject.set(x, "wifiSignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiSignalStrengthNull: Self = StObject.set(x, "wifiSignalStrength", null)
    
    @scala.inline
    def setWifiSignalStrengthUndefined: Self = StObject.set(x, "wifiSignalStrength", js.undefined)
    
    @scala.inline
    def setWifiVendorDriver(value: NullableOption[String]): Self = StObject.set(x, "wifiVendorDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiVendorDriverNull: Self = StObject.set(x, "wifiVendorDriver", null)
    
    @scala.inline
    def setWifiVendorDriverUndefined: Self = StObject.set(x, "wifiVendorDriver", js.undefined)
    
    @scala.inline
    def setWifiVendorDriverVersion(value: NullableOption[String]): Self = StObject.set(x, "wifiVendorDriverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiVendorDriverVersionNull: Self = StObject.set(x, "wifiVendorDriverVersion", null)
    
    @scala.inline
    def setWifiVendorDriverVersionUndefined: Self = StObject.set(x, "wifiVendorDriverVersion", js.undefined)
  }
}
