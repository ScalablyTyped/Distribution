package typings.nodeWifi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-wifi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(opts: ConnectionOpts): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def connect(opts: ConnectionOpts, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteConnection(opts: DeletionOpts): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteConnection")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def deleteConnection(opts: DeletionOpts, cb: js.Function1[/* error */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteConnection")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disconnect(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[js.Promise[Unit]]
  inline def disconnect(cb: js.Function1[/* error */ js.Error | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getCurrentConnections(): js.Promise[js.Array[WiFiNetwork]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentConnections")().asInstanceOf[js.Promise[js.Array[WiFiNetwork]]]
  inline def getCurrentConnections(
    cb: js.Function2[/* error */ js.Error | Null, /* currentConnections */ js.Array[WiFiNetwork], Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentConnections")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def init(options: InitConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def scan(): js.Promise[js.Array[WiFiNetwork]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")().asInstanceOf[js.Promise[js.Array[WiFiNetwork]]]
  inline def scan(cb: js.Function2[/* error */ js.Error | Null, /* networks */ js.Array[WiFiNetwork], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ConnectionOpts extends StObject {
    
    var password: String
    
    var ssid: String
  }
  object ConnectionOpts {
    
    inline def apply(password: String, ssid: String): ConnectionOpts = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionOpts] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeletionOpts extends StObject {
    
    var ssid: String
  }
  object DeletionOpts {
    
    inline def apply(ssid: String): DeletionOpts = {
      val __obj = js.Dynamic.literal(ssid = ssid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeletionOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeletionOpts] (val x: Self) extends AnyVal {
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitConfig extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var iface: js.UndefOr[String | Null] = js.undefined
  }
  object InitConfig {
    
    inline def apply(): InitConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitConfig] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIface(value: String): Self = StObject.set(x, "iface", value.asInstanceOf[js.Any])
      
      inline def setIfaceNull: Self = StObject.set(x, "iface", null)
      
      inline def setIfaceUndefined: Self = StObject.set(x, "iface", js.undefined)
    }
  }
  
  trait WiFiNetwork extends StObject {
    
    var bssid: js.UndefOr[String] = js.undefined
    
    // equals to bssid (for retrocompatibility)
    var channel: Double
    
    var frequency: Double
    
    var mac: js.UndefOr[String] = js.undefined
    
    // encryption protocols (format currently depending of the OS)
    var mode: js.UndefOr[String] = js.undefined
    
    // in dB
    var quality: Double
    
    // same as signal level but in %
    var security: String
    
    // format depending on locale for open networks in Windows
    var security_flags: js.Array[String]
    
    // in MHz
    var signal_level: Double
    
    var ssid: String
  }
  object WiFiNetwork {
    
    inline def apply(
      channel: Double,
      frequency: Double,
      quality: Double,
      security: String,
      security_flags: js.Array[String],
      signal_level: Double,
      ssid: String
    ): WiFiNetwork = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], security_flags = security_flags.asInstanceOf[js.Any], signal_level = signal_level.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WiFiNetwork]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WiFiNetwork] (val x: Self) extends AnyVal {
      
      inline def setBssid(value: String): Self = StObject.set(x, "bssid", value.asInstanceOf[js.Any])
      
      inline def setBssidUndefined: Self = StObject.set(x, "bssid", js.undefined)
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurity_flags(value: js.Array[String]): Self = StObject.set(x, "security_flags", value.asInstanceOf[js.Any])
      
      inline def setSecurity_flagsVarargs(value: String*): Self = StObject.set(x, "security_flags", js.Array(value*))
      
      inline def setSignal_level(value: Double): Self = StObject.set(x, "signal_level", value.asInstanceOf[js.Any])
      
      inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
    }
  }
}
