package typings.netgear.mod

import typings.netgear.anon.CurrentDeviceDownBandwidth
import typings.netgear.anon.CurrentVersion
import typings.netgear.anon.DaylightSaving
import typings.netgear.anon.Enabled
import typings.netgear.anon.NTPServer1
import typings.netgear.anon.NewPortMappingInfo
import typings.netgear.netgearBooleans.`false`
import typings.netgear.netgearBooleans.`true`
import typings.netgear.netgearStrings.Allow
import typings.netgear.netgearStrings.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetgearRouter extends StObject {
  
  def checkNewFirmware(): js.Promise[CurrentVersion] = js.native
  
  val cookie: js.UndefOr[String] = js.native
  
  /**
    * Discovers a netgear router in the network. Also sets the discovered ip address and soap port for this session.
    * @returns The discovered router info, including host ip address and soap port.
    */
  def discover(): js.Promise[Settings] = js.native
  
  def enableParentalControl(enabled: Boolean): js.Promise[Unit] = js.native
  
  def enableTrafficMeter(enabled: Boolean): js.Promise[Unit] = js.native
  
  def get5G1ChannelInfo(): js.Promise[Channel] = js.native
  
  def get5GChannelInfo(): js.Promise[Channel] = js.native
  
  def get5GGuestWifi2Enabled(): js.Promise[Boolean] = js.native
  
  def get5GGuestWifiEnabled(): js.Promise[Boolean] = js.native
  
  def getAttachedDevices(): js.Promise[js.Array[Device]] = js.native
  
  def getBandwidthControlOptions(): js.Promise[Enabled] = js.native
  
  def getBlockDeviceEnableStatus(): js.Promise[Boolean] = js.native
  
  /** for 2.4G */
  def getChannelInfo(): js.Promise[Channel] = js.native
  
  def getCurrentBandwidthByMAC(mac: String): js.Promise[CurrentDeviceDownBandwidth] = js.native
  
  def getCurrentDeviceBandwidth(): js.Promise[String] = js.native
  
  /**
    * Get router information without need for credentials.
    */
  def getCurrentSetting(): js.Promise[Settings] = js.native
  def getCurrentSetting(host: String): js.Promise[Settings] = js.native
  def getCurrentSetting(host: String, timeout: Double): js.Promise[Settings] = js.native
  def getCurrentSetting(host: Unit, timeout: Double): js.Promise[Settings] = js.native
  
  def getDeviceConfig(): js.Promise[DeviceConfig] = js.native
  
  def getGuestWifiEnabled(): js.Promise[Boolean] = js.native
  
  def getInfo(): js.Promise[Info] = js.native
  
  def getLANConfig(): js.Promise[LANConfig] = js.native
  
  def getNTPServers(): js.Promise[NTPServer1] = js.native
  
  def getParentalControlEnableStatus(): js.Promise[Boolean] = js.native
  
  def getPortMappingInfo(): js.Promise[NewPortMappingInfo] = js.native
  
  def getQoSEnableStatus(): js.Promise[Boolean] = js.native
  
  def getSmartConnectEnabled(): js.Promise[Boolean] = js.native
  
  def getSupportFeatureListXML(): js.Promise[SupportedFeatures] = js.native
  
  def getSysUpTime(): js.Promise[String] = js.native
  
  def getSystemInfo(): js.Promise[SystemInfo] = js.native
  
  def getSystemLogs(): js.Promise[js.Array[String]] = js.native
  @JSName("getSystemLogs")
  def getSystemLogs_false(returnAsJson: `false`): js.Promise[js.Array[String]] = js.native
  @JSName("getSystemLogs")
  def getSystemLogs_true(returnAsJson: `true`): js.Promise[js.Array[Log]] = js.native
  
  def getTimeZoneInfo(): js.Promise[DaylightSaving] = js.native
  
  def getTrafficMeter(): js.Promise[TrafficStats] = js.native
  
  def getTrafficMeterEnabled(): js.Promise[Boolean] = js.native
  
  def getTrafficMeterOptions(): js.Promise[TrafficOptions] = js.native
  
  def getWANConfig(): js.Promise[WANConfig] = js.native
  
  def getWifiChannels(): js.Promise[js.Array[Channel]] = js.native
  def getWifiChannels(band: Band): js.Promise[js.Array[Channel]] = js.native
  
  /** @deprecated */
  val lastResponse: js.UndefOr[String] = js.native
  
  val loggedIn: Boolean = js.native
  
  /** If you don't provide options, you must pass them to the `constructor()` instead */
  def login(): js.Promise[Unit] = js.native
  def login(options: Options): js.Promise[Unit] = js.native
  
  val loginMethod: LoginMethod = js.native
  
  def logout(): js.Promise[Unit] = js.native
  
  val password: String = js.native
  
  def reboot(): js.Promise[Unit] = js.native
  
  def set5GGuestWifi(enabled: Boolean): js.Promise[Unit] = js.native
  
  def set5GGuestWifi2(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * sets Qos bandwidth options
    * @param maxUplinkBandwidth - maximum uplink bandwidth (Mb/s).
    * @param maxDownlinkBandwidth - maximum downlink bandwidth (Mb/s).
    */
  def setBandwidthControlOptions(maxUplinkBandwidth: Double, maxDownlinkBandwidth: Double): js.Promise[Unit] = js.native
  
  def setBlockDevice(macAddress: String, action: Block | Allow): js.Promise[`true`] = js.native
  
  def setBlockDeviceEnable(enabled: Boolean): js.Promise[`true`] = js.native
  
  def setGuestWifi(enabled: Boolean): js.Promise[Unit] = js.native
  
  def setNetgearDeviceName(deviceName: String): js.Promise[Unit] = js.native
  
  def setQoSEnableStatus(enabled: Boolean): js.Promise[Unit] = js.native
  
  def setSmartConnectEnabled(enabled: Boolean): js.Promise[Unit] = js.native
  
  def setWifiChannel(channel: Channel, mode: Band): js.Promise[`true`] = js.native
  
  /** takes 1 minute to resolve! */
  def speedTest(): js.Promise[SpeedTest] = js.native
  
  val timeout: Double = js.native
  
  def updateNewFirmware(): js.Promise[Unit] = js.native
  
  def wol(macAddress: String, secureOnPassword: String): js.Promise[Unit] = js.native
}
