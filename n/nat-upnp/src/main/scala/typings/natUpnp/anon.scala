package typings.natUpnp

import org.scalablytyped.runtime.StringDictionary
import typings.natUpnp.mod.RawDevice
import typings.natUpnp.mod.RawService
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var device: js.UndefOr[RawDevice] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setDevice(value: RawDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    }
  }
  
  trait ControlURL extends StObject {
    
    var SCPDURL: String
    
    var controlURL: String
    
    var service: String
  }
  object ControlURL {
    
    inline def apply(SCPDURL: String, controlURL: String, service: String): ControlURL = {
      val __obj = js.Dynamic.literal(SCPDURL = SCPDURL.asInstanceOf[js.Any], controlURL = controlURL.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlURL] (val x: Self) extends AnyVal {
      
      inline def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      inline def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait Device extends StObject {
    
    var device: RawDevice | js.Array[RawDevice]
  }
  object Device {
    
    inline def apply(device: RawDevice | js.Array[RawDevice]): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      inline def setDevice(value: RawDevice | js.Array[RawDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceVarargs(value: RawDevice*): Self = StObject.set(x, "device", js.Array(value*))
    }
  }
  
  trait Devices extends StObject {
    
    var devices: js.Array[RawDevice]
    
    var services: js.Array[RawService]
  }
  object Devices {
    
    inline def apply(devices: js.Array[RawDevice], services: js.Array[RawService]): Devices = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[Devices]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: js.Array[RawDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: RawDevice*): Self = StObject.set(x, "devices", js.Array(value*))
      
      inline def setServices(value: js.Array[RawService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: RawService*): Self = StObject.set(x, "services", js.Array(value*))
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `@`: Xmlnsu
  }
  object Dictkey {
    
    inline def apply(`@`: Xmlnsu): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@")(`@`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def `set@`(value: Xmlnsu): Self = StObject.set(x, "@", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object Host {
    
    inline def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var host: String
    
    var port: Double
  }
  object Port {
    
    inline def apply(host: String, port: Double): Port = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Service extends StObject {
    
    var service: RawService | js.Array[RawService]
  }
  object Service {
    
    inline def apply(service: RawService | js.Array[RawService]): Service = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      inline def setService(value: RawService | js.Array[RawService]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceVarargs(value: RawService*): Self = StObject.set(x, "service", js.Array(value*))
    }
  }
  
  trait Xmlnsu extends StObject {
    
    @JSName("xmlns:u")
    var xmlnsColonu: String
  }
  object Xmlnsu {
    
    inline def apply(xmlnsColonu: String): Xmlnsu = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("xmlns:u")(xmlnsColonu.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xmlnsu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Xmlnsu] (val x: Self) extends AnyVal {
      
      inline def setXmlnsColonu(value: String): Self = StObject.set(x, "xmlns:u", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    var `@`: js.UndefOr[Record[String, String]] = js.undefined
  }
  object _empty {
    
    inline def apply(): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def `set@`(value: Record[String, String]): Self = StObject.set(x, "@", value.asInstanceOf[js.Any])
      
      inline def `set@Undefined`: Self = StObject.set(x, "@", js.undefined)
    }
  }
}
