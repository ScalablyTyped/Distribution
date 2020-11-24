package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends js.Object {
  
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
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
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
    def setBandwidthLowEventRatio(value: NullableOption[Double]): Self = this.set("bandwidthLowEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidthLowEventRatio: Self = this.set("bandwidthLowEventRatio", js.undefined)
    
    @scala.inline
    def setBandwidthLowEventRatioNull: Self = this.set("bandwidthLowEventRatio", null)
    
    @scala.inline
    def setBasicServiceSetIdentifier(value: NullableOption[String]): Self = this.set("basicServiceSetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicServiceSetIdentifier: Self = this.set("basicServiceSetIdentifier", js.undefined)
    
    @scala.inline
    def setBasicServiceSetIdentifierNull: Self = this.set("basicServiceSetIdentifier", null)
    
    @scala.inline
    def setConnectionType(value: NetworkConnectionType): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    
    @scala.inline
    def setDelayEventRatio(value: NullableOption[Double]): Self = this.set("delayEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayEventRatio: Self = this.set("delayEventRatio", js.undefined)
    
    @scala.inline
    def setDelayEventRatioNull: Self = this.set("delayEventRatio", null)
    
    @scala.inline
    def setDnsSuffix(value: NullableOption[String]): Self = this.set("dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSuffix: Self = this.set("dnsSuffix", js.undefined)
    
    @scala.inline
    def setDnsSuffixNull: Self = this.set("dnsSuffix", null)
    
    @scala.inline
    def setIpAddress(value: NullableOption[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setIpAddressNull: Self = this.set("ipAddress", null)
    
    @scala.inline
    def setLinkSpeed(value: NullableOption[Double]): Self = this.set("linkSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSpeed: Self = this.set("linkSpeed", js.undefined)
    
    @scala.inline
    def setLinkSpeedNull: Self = this.set("linkSpeed", null)
    
    @scala.inline
    def setMacAddress(value: NullableOption[String]): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
    
    @scala.inline
    def setMacAddressNull: Self = this.set("macAddress", null)
    
    @scala.inline
    def setPort(value: NullableOption[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    
    @scala.inline
    def setReceivedQualityEventRatio(value: NullableOption[Double]): Self = this.set("receivedQualityEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedQualityEventRatio: Self = this.set("receivedQualityEventRatio", js.undefined)
    
    @scala.inline
    def setReceivedQualityEventRatioNull: Self = this.set("receivedQualityEventRatio", null)
    
    @scala.inline
    def setReflexiveIPAddress(value: NullableOption[String]): Self = this.set("reflexiveIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflexiveIPAddress: Self = this.set("reflexiveIPAddress", js.undefined)
    
    @scala.inline
    def setReflexiveIPAddressNull: Self = this.set("reflexiveIPAddress", null)
    
    @scala.inline
    def setRelayIPAddress(value: NullableOption[String]): Self = this.set("relayIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelayIPAddress: Self = this.set("relayIPAddress", js.undefined)
    
    @scala.inline
    def setRelayIPAddressNull: Self = this.set("relayIPAddress", null)
    
    @scala.inline
    def setRelayPort(value: NullableOption[Double]): Self = this.set("relayPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelayPort: Self = this.set("relayPort", js.undefined)
    
    @scala.inline
    def setRelayPortNull: Self = this.set("relayPort", null)
    
    @scala.inline
    def setSentQualityEventRatio(value: NullableOption[Double]): Self = this.set("sentQualityEventRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentQualityEventRatio: Self = this.set("sentQualityEventRatio", js.undefined)
    
    @scala.inline
    def setSentQualityEventRatioNull: Self = this.set("sentQualityEventRatio", null)
    
    @scala.inline
    def setSubnet(value: NullableOption[String]): Self = this.set("subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnet: Self = this.set("subnet", js.undefined)
    
    @scala.inline
    def setSubnetNull: Self = this.set("subnet", null)
    
    @scala.inline
    def setWifiBand(value: WifiBand): Self = this.set("wifiBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiBand: Self = this.set("wifiBand", js.undefined)
    
    @scala.inline
    def setWifiBatteryCharge(value: NullableOption[Double]): Self = this.set("wifiBatteryCharge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiBatteryCharge: Self = this.set("wifiBatteryCharge", js.undefined)
    
    @scala.inline
    def setWifiBatteryChargeNull: Self = this.set("wifiBatteryCharge", null)
    
    @scala.inline
    def setWifiChannel(value: NullableOption[Double]): Self = this.set("wifiChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiChannel: Self = this.set("wifiChannel", js.undefined)
    
    @scala.inline
    def setWifiChannelNull: Self = this.set("wifiChannel", null)
    
    @scala.inline
    def setWifiMicrosoftDriver(value: NullableOption[String]): Self = this.set("wifiMicrosoftDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiMicrosoftDriver: Self = this.set("wifiMicrosoftDriver", js.undefined)
    
    @scala.inline
    def setWifiMicrosoftDriverNull: Self = this.set("wifiMicrosoftDriver", null)
    
    @scala.inline
    def setWifiMicrosoftDriverVersion(value: NullableOption[String]): Self = this.set("wifiMicrosoftDriverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiMicrosoftDriverVersion: Self = this.set("wifiMicrosoftDriverVersion", js.undefined)
    
    @scala.inline
    def setWifiMicrosoftDriverVersionNull: Self = this.set("wifiMicrosoftDriverVersion", null)
    
    @scala.inline
    def setWifiRadioType(value: WifiRadioType): Self = this.set("wifiRadioType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiRadioType: Self = this.set("wifiRadioType", js.undefined)
    
    @scala.inline
    def setWifiSignalStrength(value: NullableOption[Double]): Self = this.set("wifiSignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiSignalStrength: Self = this.set("wifiSignalStrength", js.undefined)
    
    @scala.inline
    def setWifiSignalStrengthNull: Self = this.set("wifiSignalStrength", null)
    
    @scala.inline
    def setWifiVendorDriver(value: NullableOption[String]): Self = this.set("wifiVendorDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiVendorDriver: Self = this.set("wifiVendorDriver", js.undefined)
    
    @scala.inline
    def setWifiVendorDriverNull: Self = this.set("wifiVendorDriver", null)
    
    @scala.inline
    def setWifiVendorDriverVersion(value: NullableOption[String]): Self = this.set("wifiVendorDriverVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiVendorDriverVersion: Self = this.set("wifiVendorDriverVersion", js.undefined)
    
    @scala.inline
    def setWifiVendorDriverVersionNull: Self = this.set("wifiVendorDriverVersion", null)
  }
}
