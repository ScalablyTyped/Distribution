package typings.natUpnp

import typings.natUpnp.anon.ControlURL
import typings.natUpnp.anon.Device
import typings.natUpnp.anon.Devices
import typings.natUpnp.anon.Dictkey
import typings.natUpnp.anon.Host
import typings.natUpnp.anon.Port
import typings.natUpnp.anon.Service
import typings.natUpnp.anon._empty
import typings.natUpnp.anon.`0`
import typings.node.eventsMod.EventEmitter
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nat-upnp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[Client]
  
  object device {
    
    @JSImport("nat-upnp", "device")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a gateway device object with the specified url
      * @param url
      */
    inline def create(url: String): Device_ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[Device_]
  }
  
  object ssdp {
    
    @JSImport("nat-upnp", "ssdp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Simple Service Discovery Protocol client
      */
    inline def create(): Ssdp_ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Ssdp_]
  }
  
  object utils {
    
    @JSImport("nat-upnp", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getNamespace(data: _empty, uri: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamespace")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type CB[T] = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[T], Unit]
  
  @js.native
  trait Client extends StObject {
    
    /**
      * Close the underlaying sockets and resources
      */
    def close(): Unit = js.native
    
    /**
      * Fetch the external IP from the gateway
      * @param callback Callback to be run when completed, or on error
      */
    def externalIp(callback: CB[String]): Unit = js.native
    
    /**
      * Get the gateway device for communication
      * @param callback
      */
    def findGateway(callback: CB[Device_]): Unit = js.native
    
    /**
      * Get a list of existing mappings
      * @param callback Callback to be run when completed, or on error
      */
    def getMappings(callback: CB[js.Array[Mapping]]): Unit = js.native
    /**
      * Get a list of existing mappings
      * @param options Filter mappings based on these options
      * @param callback Callback to be run when completed, or on error
      */
    def getMappings(options: GetMappingOpts, callback: CB[js.Array[Mapping]]): Unit = js.native
    
    /**
      * Create a new port mapping
      * @param options Options for the new port mapping
      * @param [callback] Callback to be run when completed, or on error
      */
    def portMapping(options: NewPortMappingOpts): Unit = js.native
    def portMapping(options: NewPortMappingOpts, callback: CB[RawResponse]): Unit = js.native
    
    /**
      * Remove a port mapping
      * @param options Specify which port mapping to remove
      * @param [callback] Callback to be run when completed, or on error
      */
    def portUnmapping(options: DeletePortMappingOpts): Unit = js.native
    def portUnmapping(options: DeletePortMappingOpts, callback: CB[RawResponse]): Unit = js.native
  }
  
  type DeletePortMappingOpts = StandardOpts
  
  trait Device_ extends StObject {
    
    /**
      * Get the available services on the network device
      * @param types List of service types to look for
      * @param callback
      */
    def getService(types: js.Array[String], callback: CB[ControlURL]): Unit
    
    /**
      * Parse out available services
      * and devices from a root device
      * @param info
      * @returns the available devices and services in array form
      */
    def parseDescription(info: `0`): Devices
    
    /**
      * Perform a SSDP/UPNP request
      * @param action the action to perform
      * @param args key-value pair arguments of said action
      * @param callback Callback to be run when completed, or on error
      */
    def run(action: String, args: js.Array[js.Tuple2[String, String | Double]], callback: CB[RawResponse]): Unit
  }
  object Device_ {
    
    inline def apply(
      getService: (js.Array[String], CB[ControlURL]) => Unit,
      parseDescription: `0` => Devices,
      run: (String, js.Array[js.Tuple2[String, String | Double]], CB[RawResponse]) => Unit
    ): Device_ = {
      val __obj = js.Dynamic.literal(getService = js.Any.fromFunction2(getService), parseDescription = js.Any.fromFunction1(parseDescription), run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[Device_]
    }
    
    extension [Self <: Device_](x: Self) {
      
      inline def setGetService(value: (js.Array[String], CB[ControlURL]) => Unit): Self = StObject.set(x, "getService", js.Any.fromFunction2(value))
      
      inline def setParseDescription(value: `0` => Devices): Self = StObject.set(x, "parseDescription", js.Any.fromFunction1(value))
      
      inline def setRun(value: (String, js.Array[js.Tuple2[String, String | Double]], CB[RawResponse]) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  trait GetMappingOpts extends StObject {
    
    var description: js.UndefOr[js.RegExp | String] = js.undefined
    
    var local: js.UndefOr[Boolean] = js.undefined
  }
  object GetMappingOpts {
    
    inline def apply(): GetMappingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMappingOpts]
    }
    
    extension [Self <: GetMappingOpts](x: Self) {
      
      inline def setDescription(value: js.RegExp | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    }
  }
  
  trait Mapping extends StObject {
    
    var description: String
    
    var enabled: Boolean
    
    var local: Boolean
    
    var `private`: Port
    
    var protocol: String
    
    var public: Port
    
    var ttl: Double
  }
  object Mapping {
    
    inline def apply(
      description: String,
      enabled: Boolean,
      local: Boolean,
      `private`: Port,
      protocol: String,
      public: Port,
      ttl: Double
    ): Mapping = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapping]
    }
    
    extension [Self <: Mapping](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: Port): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Port): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewPortMappingOpts
    extends StObject
       with StandardOpts {
    
    var description: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object NewPortMappingOpts {
    
    inline def apply(): NewPortMappingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewPortMappingOpts]
    }
    
    extension [Self <: NewPortMappingOpts](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait RawDevice extends StObject {
    
    var UDN: String
    
    var UPC: String
    
    var deviceList: js.UndefOr[Device] = js.undefined
    
    var deviceType: String
    
    var friendlyName: String
    
    var manufacturer: String
    
    var manufacturerURL: String
    
    var modelDescription: String
    
    var modelName: String
    
    var modelNumber: String
    
    var modelURL: String
    
    var presentationURL: String
    
    var serialNumber: String
    
    var serviceList: js.UndefOr[Service] = js.undefined
  }
  object RawDevice {
    
    inline def apply(
      UDN: String,
      UPC: String,
      deviceType: String,
      friendlyName: String,
      manufacturer: String,
      manufacturerURL: String,
      modelDescription: String,
      modelName: String,
      modelNumber: String,
      modelURL: String,
      presentationURL: String,
      serialNumber: String
    ): RawDevice = {
      val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], UPC = UPC.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], manufacturerURL = manufacturerURL.asInstanceOf[js.Any], modelDescription = modelDescription.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], modelURL = modelURL.asInstanceOf[js.Any], presentationURL = presentationURL.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDevice]
    }
    
    extension [Self <: RawDevice](x: Self) {
      
      inline def setDeviceList(value: Device): Self = StObject.set(x, "deviceList", value.asInstanceOf[js.Any])
      
      inline def setDeviceListUndefined: Self = StObject.set(x, "deviceList", js.undefined)
      
      inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setManufacturerURL(value: String): Self = StObject.set(x, "manufacturerURL", value.asInstanceOf[js.Any])
      
      inline def setModelDescription(value: String): Self = StObject.set(x, "modelDescription", value.asInstanceOf[js.Any])
      
      inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
      
      inline def setModelURL(value: String): Self = StObject.set(x, "modelURL", value.asInstanceOf[js.Any])
      
      inline def setPresentationURL(value: String): Self = StObject.set(x, "presentationURL", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setServiceList(value: Service): Self = StObject.set(x, "serviceList", value.asInstanceOf[js.Any])
      
      inline def setServiceListUndefined: Self = StObject.set(x, "serviceList", js.undefined)
      
      inline def setUDN(value: String): Self = StObject.set(x, "UDN", value.asInstanceOf[js.Any])
      
      inline def setUPC(value: String): Self = StObject.set(x, "UPC", value.asInstanceOf[js.Any])
    }
  }
  
  type RawResponse = Partial[Record[String, Dictkey]]
  
  trait RawService extends StObject {
    
    var SCPDURL: js.UndefOr[String] = js.undefined
    
    var controlURL: js.UndefOr[String] = js.undefined
    
    var eventSubURL: js.UndefOr[String] = js.undefined
    
    var serviceId: String
    
    var serviceType: String
  }
  object RawService {
    
    inline def apply(serviceId: String, serviceType: String): RawService = {
      val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawService]
    }
    
    extension [Self <: RawService](x: Self) {
      
      inline def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      inline def setControlURLUndefined: Self = StObject.set(x, "controlURL", js.undefined)
      
      inline def setEventSubURL(value: String): Self = StObject.set(x, "eventSubURL", value.asInstanceOf[js.Any])
      
      inline def setEventSubURLUndefined: Self = StObject.set(x, "eventSubURL", js.undefined)
      
      inline def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      inline def setSCPDURLUndefined: Self = StObject.set(x, "SCPDURL", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ssdp_ extends EventEmitter {
    
    /**
      * Close all sockets
      */
    def close(): Unit = js.native
    
    /**
      * Search for a SSDP compatible server on the network
      * @param device Search Type (ST) header, specifying which device to search for
      * @param promise An existing EventEmitter to emit event on
      * @returns The event emitter provided in Promise, or a newly instantiated one.
      */
    def search(device: String): EventEmitter = js.native
    def search(device: String, promise: EventEmitter): EventEmitter = js.native
  }
  
  trait StandardOpts extends StObject {
    
    var `private`: js.UndefOr[Double | Null | Host] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var public: js.UndefOr[Double | Null | Host] = js.undefined
  }
  object StandardOpts {
    
    inline def apply(): StandardOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardOpts]
    }
    
    extension [Self <: StandardOpts](x: Self) {
      
      inline def setPrivate(value: Double | Host): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateNull: Self = StObject.set(x, "private", null)
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setPublic(value: Double | Host): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicNull: Self = StObject.set(x, "public", null)
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
}
