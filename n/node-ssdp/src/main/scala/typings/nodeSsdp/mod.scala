package typings.nodeSsdp

import org.scalablytyped.runtime.StringDictionary
import typings.node.dgramMod.RemoteInfo
import typings.node.eventsMod.EventEmitter
import typings.nodeSsdp.nodeSsdpStrings.`advertise-alive`
import typings.nodeSsdp.nodeSsdpStrings.`advertise-bye`
import typings.nodeSsdp.nodeSsdpStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("node-ssdp", "Base")
  @js.native
  open class Base () extends EventEmitter {
    def this(opts: SsdpOptions) = this()
    
    def addUSN(device: String): Unit = js.native
  }
  
  @JSImport("node-ssdp", "Client")
  @js.native
  open class Client () extends Base {
    def this(opts: ClientOptions) = this()
    
    @JSName("emit")
    def emit_response(event: response, headers: SsdpHeaders, statusCode: Double, rinfo: RemoteInfo): Boolean = js.native
    
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function3[/* headers */ SsdpHeaders, /* statusCode */ Double, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_response(
      event: response,
      listener: js.Function3[/* headers */ SsdpHeaders, /* statusCode */ Double, /* rinfo */ RemoteInfo, Unit]
    ): this.type = js.native
    
    def search(serviceType: String): Unit | js.Promise[Unit] = js.native
    
    /**
      * Start the listener for multicast notifications from SSDP devices
      * @param cb callback to socket.bind
      * @returns promise when socket.bind is ready
      */
    def start(): js.Promise[Unit] = js.native
    def start(cb: js.Function1[/* error */ js.Error, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Close UDP socket.
      */
    def stop(): Unit = js.native
  }
  
  @JSImport("node-ssdp", "Server")
  @js.native
  open class Server () extends Base {
    def this(opts: ServerOptions) = this()
    
    def advertise(): Unit = js.native
    def advertise(alive: Boolean): Unit = js.native
    
    def emit(event: `advertise-alive` | `advertise-bye`, headers: SsdpHeaders): Boolean = js.native
    
    def on(
      event: `advertise-alive` | `advertise-bye`,
      listener: js.Function1[/* headers */ SsdpHeaders, Unit]
    ): this.type = js.native
    
    def once(
      event: `advertise-alive` | `advertise-bye`,
      listener: js.Function1[/* headers */ SsdpHeaders, Unit]
    ): this.type = js.native
    
    /**
      * Binds UDP socket to an interface/port and starts advertising.
      * @param cb callback to socket.bind
      * @returns promise when socket.bind is ready
      */
    def start(): Unit | js.Promise[Unit] = js.native
    def start(cb: js.Function1[/* error */ js.Error, Unit]): Unit | js.Promise[Unit] = js.native
    
    /**
      * Advertise shutdown and close UDP socket.
      */
    def stop(): Unit = js.native
  }
  
  trait ClientOptions
    extends StObject
       with SsdpOptions {
    
    /** Bind sockets to each discovered interface explicitly instead of relying on the system. Might help with issues with multiple NICs. */
    var explicitSocketBind: js.UndefOr[Boolean] = js.undefined
    
    /** List of interfaces to explicitly bind. By default, bind to all available interfaces. */
    var interfaces: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * When true socket.bind() will reuse the address, even if another process has already bound a socket on it.
      * @default true
      */
    var reuseAddr: js.UndefOr[Boolean] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setExplicitSocketBind(value: Boolean): Self = StObject.set(x, "explicitSocketBind", value.asInstanceOf[js.Any])
      
      inline def setExplicitSocketBindUndefined: Self = StObject.set(x, "explicitSocketBind", js.undefined)
      
      inline def setInterfaces(value: js.Array[String]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
      
      inline def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
      
      inline def setInterfacesVarargs(value: String*): Self = StObject.set(x, "interfaces", js.Array(value*))
      
      inline def setReuseAddr(value: Boolean): Self = StObject.set(x, "reuseAddr", value.asInstanceOf[js.Any])
      
      inline def setReuseAddrUndefined: Self = StObject.set(x, "reuseAddr", js.undefined)
    }
  }
  
  trait ServerOptions
    extends StObject
       with ClientOptions {
    
    /**
      * Interval at which to send out advertisement (ms)
      * @default 10000
      */
    var adInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow wildcards in M-SEARCH packets (non-standard)
      * @default false
      */
    var allowWildcards: js.UndefOr[Boolean] = js.undefined
    
    /**
      * URL pointing to description of your service, or a function that returns that URL.
      * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
      * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
      */
    var location: js.UndefOr[String | ServiceDescriptionLocation] = js.undefined
    
    /**
      * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
      * @default false
      */
    var suppressRootDeviceAdvertisements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Packet TTL
      * @default 1800
      */
    var ttl: js.UndefOr[Double] = js.undefined
    
    /**
      * SSDP Unique Device Name
      * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
      */
    var udn: js.UndefOr[String] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      inline def setAdInterval(value: Double): Self = StObject.set(x, "adInterval", value.asInstanceOf[js.Any])
      
      inline def setAdIntervalUndefined: Self = StObject.set(x, "adInterval", js.undefined)
      
      inline def setAllowWildcards(value: Boolean): Self = StObject.set(x, "allowWildcards", value.asInstanceOf[js.Any])
      
      inline def setAllowWildcardsUndefined: Self = StObject.set(x, "allowWildcards", js.undefined)
      
      inline def setLocation(value: String | ServiceDescriptionLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setSuppressRootDeviceAdvertisements(value: Boolean): Self = StObject.set(x, "suppressRootDeviceAdvertisements", value.asInstanceOf[js.Any])
      
      inline def setSuppressRootDeviceAdvertisementsUndefined: Self = StObject.set(x, "suppressRootDeviceAdvertisements", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUdn(value: String): Self = StObject.set(x, "udn", value.asInstanceOf[js.Any])
      
      inline def setUdnUndefined: Self = StObject.set(x, "udn", js.undefined)
    }
  }
  
  trait ServiceDescriptionLocation extends StObject {
    
    /**
      * Location path.
      */
    var path: String
    
    /**
      * Location port.
      */
    var port: Double
    
    /**
      * Location protocol.
      * @default 'http://'
      */
    var protocol: js.UndefOr[String] = js.undefined
  }
  object ServiceDescriptionLocation {
    
    inline def apply(path: String, port: Double): ServiceDescriptionLocation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceDescriptionLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceDescriptionLocation] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  trait SsdpHeaders
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | js.Symbol]] {
    
    /**
      * Available while handling an SSDP response. A URL where the service description can be found.
      */
    var LOCATION: js.UndefOr[String] = js.undefined
    
    var ST: js.UndefOr[String] = js.undefined
    
    /**
      * Available while handling an SSDP response. The Unique Service Name (USN) of the responding device.
      */
    var USN: js.UndefOr[String] = js.undefined
  }
  object SsdpHeaders {
    
    inline def apply(): SsdpHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SsdpHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SsdpHeaders] (val x: Self) extends AnyVal {
      
      inline def setLOCATION(value: String): Self = StObject.set(x, "LOCATION", value.asInstanceOf[js.Any])
      
      inline def setLOCATIONUndefined: Self = StObject.set(x, "LOCATION", js.undefined)
      
      inline def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setSTUndefined: Self = StObject.set(x, "ST", js.undefined)
      
      inline def setUSN(value: String): Self = StObject.set(x, "USN", value.asInstanceOf[js.Any])
      
      inline def setUSNUndefined: Self = StObject.set(x, "USN", js.undefined)
    }
  }
  
  trait SsdpOptions extends StObject {
    
    /** A logger function to use instead of the default. The first argument to the function can contain a format string. */
    var customLogger: js.UndefOr[js.Function2[/* format */ String, /* repeated */ Any, Unit]] = js.undefined
    
    /** Path to SSDP description file */
    var description: js.UndefOr[String] = js.undefined
    
    /** Additional headers */
    var headers: js.UndefOr[SsdpHeaders] = js.undefined
    
    /**
      * SSDP multicast group
      * @default '239.255.255.250'
      */
    var ssdpIp: js.UndefOr[String] = js.undefined
    
    /**
      * SSDP port
      * @default 1900
      */
    var ssdpPort: js.UndefOr[Double] = js.undefined
    
    /**
      * SSDP signature
      * @default 'node.js/NODE_VERSION UPnP/1.1 node-ssdp/PACKAGE_VERSION'
      */
    var ssdpSig: js.UndefOr[String] = js.undefined
    
    /**
      * Multicast TTL
      * @default 4
      */
    var ssdpTtl: js.UndefOr[Double] = js.undefined
  }
  object SsdpOptions {
    
    inline def apply(): SsdpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SsdpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SsdpOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomLogger(value: (/* format */ String, /* repeated */ Any) => Unit): Self = StObject.set(x, "customLogger", js.Any.fromFunction2(value))
      
      inline def setCustomLoggerUndefined: Self = StObject.set(x, "customLogger", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeaders(value: SsdpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setSsdpIp(value: String): Self = StObject.set(x, "ssdpIp", value.asInstanceOf[js.Any])
      
      inline def setSsdpIpUndefined: Self = StObject.set(x, "ssdpIp", js.undefined)
      
      inline def setSsdpPort(value: Double): Self = StObject.set(x, "ssdpPort", value.asInstanceOf[js.Any])
      
      inline def setSsdpPortUndefined: Self = StObject.set(x, "ssdpPort", js.undefined)
      
      inline def setSsdpSig(value: String): Self = StObject.set(x, "ssdpSig", value.asInstanceOf[js.Any])
      
      inline def setSsdpSigUndefined: Self = StObject.set(x, "ssdpSig", js.undefined)
      
      inline def setSsdpTtl(value: Double): Self = StObject.set(x, "ssdpTtl", value.asInstanceOf[js.Any])
      
      inline def setSsdpTtlUndefined: Self = StObject.set(x, "ssdpTtl", js.undefined)
    }
  }
}
