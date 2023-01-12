package typings.piWifi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pi-wifi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description Returns the state of the network with the specified ssid
    * @param ssid Network ssid
    * @param callback if unable to get network status, Object with connection details
    * {
    *   selected: true | false,
    *   connected: true | false,
    *   ip: 192.168.0.2
    * }
    */
  inline def check(ssid: String, callback: js.Function2[/* err */ js.Error, /* result */ ConnectionCheck, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(ssid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @description Connects to a network with the ssid specified using the password provided
    * @param ssid Network ssid
    * @param ssid Network psk
    * @param callback Returns error if the connection isn't successful
    */
  inline def connect(ssid: String, password: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(ssid.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @description Connects to a network with the ssid specified using the password provided
    * @param ssid Network ssid
    * @param username User/identity to use on authentication
    * @param password Password to use on authentication
    * @param callback Returns error if the connection isn't successful
    */
  inline def connectEAP(
    ssid: String,
    username: String,
    password: String,
    callback: js.Function1[/* error */ js.Error, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectEAP")(ssid.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @description Connects to an open network with the ssid specified
    * @param ssid Network ssid
    * @param callback Returns error if the connection isn't successful
    */
  inline def connectOpen(ssid: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectOpen")(ssid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @description Connects to a network with the parameters specified (This can connect to open and secure networks including EAP 802.1x)
    * @param details Network details
    * - {string} key_mgmt You can specify the type of security to use. (Optional)
    * - {string} ssid (Optional, required for secure and enterprise networks)
    * - {string} username (Optional, required for enterprise networks)
    * - {string} password (Optional, required for secure or enterprise networks)
    * @param callback Returns error if the network creation isn't successful
    */
  inline def connectTo(details: NetworkDetails, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def connectToId(networkId: Double, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectToId")(networkId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def detectSupplicant(callback: js.Function3[/* error */ js.Error, /* iface */ String, /* configFile */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("detectSupplicant")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def disconnect(callback: js.Function1[/* error */ js.Error, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def interfaceDown(iface: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceDown")(iface.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def interfaceUp(iface: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interfaceUp")(iface.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @description Kills the supplicant process for the specified interface
    * @param iface Interface used by supplicant (If not iface is supplied the current one will be used)
    * @param callback (err) returns err if unable to kill the process
    */
  inline def killSupplicant(iface: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("killSupplicant")(iface.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def listNetworks(callback: js.Function2[/* error */ js.Error, /* networksArray */ js.Array[ListNetwork], Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("listNetworks")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def restartInterface(iface: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("restartInterface")(iface.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scan(callback: js.Function2[/* error */ js.Error, /* data */ js.Array[ScanNetwork], Any]): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<any>[any] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(callback.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<any>[any] */ js.Any]
  
  inline def setCurrentInterface(iface: String, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentInterface")(iface.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def startSupplicant(options: js.Object, callback: js.Function1[/* error */ js.Error, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("startSupplicant")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def status(iface: String, callback: js.Function2[/* error */ js.Error, /* status */ Status_, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("status")(iface.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ConnectionCheck extends StObject {
    
    var connected: Boolean
    
    var ip: js.UndefOr[String] = js.undefined
    
    var selected: Boolean
  }
  object ConnectionCheck {
    
    inline def apply(connected: Boolean, selected: Boolean): ConnectionCheck = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionCheck]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionCheck] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListNetwork extends StObject {
    
    var bssid: String
    
    var flags: String
    
    var network_id: Double
    
    var ssid: String
  }
  object ListNetwork {
    
    inline def apply(bssid: String, flags: String, network_id: Double, ssid: String): ListNetwork = {
      val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListNetwork]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListNetwork] (val x: Self) extends AnyVal {
      
      inline def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setNetwork_id(value: Double): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkDetails extends StObject {
    
    var eap: js.UndefOr[String] = js.undefined
    
    var key_mgmt: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var phase1: js.UndefOr[String] = js.undefined
    
    var phase2: js.UndefOr[String] = js.undefined
    
    var ssid: String
    
    var username: js.UndefOr[String] = js.undefined
  }
  object NetworkDetails {
    
    inline def apply(ssid: String): NetworkDetails = {
      val __obj = js.Dynamic.literal(ssid = ssid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkDetails] (val x: Self) extends AnyVal {
      
      inline def setEap(value: String): Self = StObject.set(x, "eap", value.asInstanceOf[js.Any])
      
      inline def setEapUndefined: Self = StObject.set(x, "eap", js.undefined)
      
      inline def setKey_mgmt(value: String): Self = StObject.set(x, "key_mgmt", value.asInstanceOf[js.Any])
      
      inline def setKey_mgmtUndefined: Self = StObject.set(x, "key_mgmt", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPhase1(value: String): Self = StObject.set(x, "phase1", value.asInstanceOf[js.Any])
      
      inline def setPhase1Undefined: Self = StObject.set(x, "phase1", js.undefined)
      
      inline def setPhase2(value: String): Self = StObject.set(x, "phase2", value.asInstanceOf[js.Any])
      
      inline def setPhase2Undefined: Self = StObject.set(x, "phase2", js.undefined)
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait ScanNetwork extends StObject {
    
    var bssid: String
    
    var flags: String
    
    var frequency: Double
    
    var signalLevel: Double
    
    var ssid: String
  }
  object ScanNetwork {
    
    inline def apply(bssid: String, flags: String, frequency: Double, signalLevel: Double, ssid: String): ScanNetwork = {
      val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], signalLevel = signalLevel.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanNetwork]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanNetwork] (val x: Self) extends AnyVal {
      
      inline def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setSignalLevel(value: Double): Self = StObject.set(x, "signalLevel", value.asInstanceOf[js.Any])
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status_ extends StObject {
    
    var bssid: String
    
    var frequency: Double
    
    var group_cipher: String
    
    var id: Double
    
    var ip: String
    
    var key_mgmt: String
    
    var mac: String
    
    var mode: String
    
    var p2p_device_address: String
    
    var pairwise_cipher: String
    
    var ssid: String
    
    var uuid: String
    
    var wpa_state: String
  }
  object Status_ {
    
    inline def apply(
      bssid: String,
      frequency: Double,
      group_cipher: String,
      id: Double,
      ip: String,
      key_mgmt: String,
      mac: String,
      mode: String,
      p2p_device_address: String,
      pairwise_cipher: String,
      ssid: String,
      uuid: String,
      wpa_state: String
    ): Status_ = {
      val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], group_cipher = group_cipher.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], key_mgmt = key_mgmt.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], p2p_device_address = p2p_device_address.asInstanceOf[js.Any], pairwise_cipher = pairwise_cipher.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], wpa_state = wpa_state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status_] (val x: Self) extends AnyVal {
      
      inline def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setGroup_cipher(value: String): Self = StObject.set(x, "group_cipher", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setKey_mgmt(value: String): Self = StObject.set(x, "key_mgmt", value.asInstanceOf[js.Any])
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setP2p_device_address(value: String): Self = StObject.set(x, "p2p_device_address", value.asInstanceOf[js.Any])
      
      inline def setPairwise_cipher(value: String): Self = StObject.set(x, "pairwise_cipher", value.asInstanceOf[js.Any])
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setWpa_state(value: String): Self = StObject.set(x, "wpa_state", value.asInstanceOf[js.Any])
    }
  }
}
