package typings.nodeSsdp

import org.scalablytyped.runtime.StringDictionary
import typings.node.dgramMod.RemoteInfo
import typings.node.eventsMod.EventEmitter
import typings.nodeSsdp.nodeSsdpStrings.`advertise-alive`
import typings.nodeSsdp.nodeSsdpStrings.`advertise-bye`
import typings.nodeSsdp.nodeSsdpStrings.response
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ssdp", "Base")
  @js.native
  abstract class Base () extends EventEmitter {
    def this(opts: SsdpOptions) = this()
    
    def addUSN(device: String): Unit = js.native
  }
  
  @JSImport("node-ssdp", "Client")
  @js.native
  class Client () extends Base {
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
    def start(cb: js.Function1[/* error */ Error, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Close UDP socket.
      */
    def stop(): Unit = js.native
  }
  
  @JSImport("node-ssdp", "Server")
  @js.native
  class Server () extends Base {
    def this(opts: ServerOptions) = this()
    
    def advertise(): Unit = js.native
    def advertise(alive: Boolean): Unit = js.native
    
    @JSName("emit")
    def emit_advertisealive(event: `advertise-alive`, headers: SsdpHeaders): Boolean = js.native
    @JSName("emit")
    def emit_advertisebye(event: `advertise-bye`, headers: SsdpHeaders): Boolean = js.native
    
    @JSName("on")
    def on_advertisealive(event: `advertise-alive`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisebye(event: `advertise-bye`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
    
    @JSName("once")
    def once_advertisealive(event: `advertise-alive`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
    @JSName("once")
    def once_advertisebye(event: `advertise-bye`, listener: js.Function1[/* headers */ SsdpHeaders, Unit]): this.type = js.native
    
    /**
      * Binds UDP socket to an interface/port and starts advertising.
      * @param cb callback to socket.bind
      * @returns promise when socket.bind is ready
      */
    def start(): Unit | js.Promise[Unit] = js.native
    def start(cb: js.Function1[/* error */ Error, Unit]): Unit | js.Promise[Unit] = js.native
    
    /**
      * Advertise shutdown and close UDP socket.
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  trait ClientOptions extends SsdpOptions {
    
    /** Bind sockets to each discovered interface explicitly instead of relying on the system. Might help with issues with multiple NICs. */
    var explicitSocketBind: js.UndefOr[Boolean] = js.native
    
    /** List of interfaces to explicitly bind. By default, bind to all available interfaces. */
    var interfaces: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * When true socket.bind() will reuse the address, even if another process has already bound a socket on it.
      * @default true
      */
    var reuseAddr: js.UndefOr[Boolean] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplicitSocketBind(value: Boolean): Self = StObject.set(x, "explicitSocketBind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitSocketBindUndefined: Self = StObject.set(x, "explicitSocketBind", js.undefined)
      
      @scala.inline
      def setInterfaces(value: js.Array[String]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
      
      @scala.inline
      def setInterfacesVarargs(value: String*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
      
      @scala.inline
      def setReuseAddr(value: Boolean): Self = StObject.set(x, "reuseAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReuseAddrUndefined: Self = StObject.set(x, "reuseAddr", js.undefined)
    }
  }
  
  @js.native
  trait ServerOptions extends ClientOptions {
    
    /**
      * Interval at which to send out advertisement (ms)
      * @default 10000
      */
    var adInterval: js.UndefOr[Double] = js.native
    
    /**
      * Allow wildcards in M-SEARCH packets (non-standard)
      * @default false
      */
    var allowWildcards: js.UndefOr[Boolean] = js.native
    
    /**
      * URL pointing to description of your service, or a function that returns that URL.
      * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
      * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
      */
    var location: js.UndefOr[String | ServiceDescriptionLocation] = js.native
    
    /**
      * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
      * @default false
      */
    var suppressRootDeviceAdvertisements: js.UndefOr[Boolean] = js.native
    
    /**
      * Packet TTL
      * @default 1800
      */
    var ttl: js.UndefOr[Double] = js.native
    
    /**
      * SSDP Unique Device Name
      * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
      */
    var udn: js.UndefOr[String] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdInterval(value: Double): Self = StObject.set(x, "adInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdIntervalUndefined: Self = StObject.set(x, "adInterval", js.undefined)
      
      @scala.inline
      def setAllowWildcards(value: Boolean): Self = StObject.set(x, "allowWildcards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowWildcardsUndefined: Self = StObject.set(x, "allowWildcards", js.undefined)
      
      @scala.inline
      def setLocation(value: String | ServiceDescriptionLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setSuppressRootDeviceAdvertisements(value: Boolean): Self = StObject.set(x, "suppressRootDeviceAdvertisements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRootDeviceAdvertisementsUndefined: Self = StObject.set(x, "suppressRootDeviceAdvertisements", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setUdn(value: String): Self = StObject.set(x, "udn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUdnUndefined: Self = StObject.set(x, "udn", js.undefined)
    }
  }
  
  @js.native
  trait ServiceDescriptionLocation extends StObject {
    
    /**
      * Location path.
      */
    var path: String = js.native
    
    /**
      * Location port.
      */
    var port: Double = js.native
    
    /**
      * Location protocol.
      * @default 'http://'
      */
    var protocol: js.UndefOr[String] = js.native
  }
  object ServiceDescriptionLocation {
    
    @scala.inline
    def apply(path: String, port: Double): ServiceDescriptionLocation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceDescriptionLocation]
    }
    
    @scala.inline
    implicit class ServiceDescriptionLocationMutableBuilder[Self <: ServiceDescriptionLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  @js.native
  trait SsdpHeaders
    extends /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | js.Symbol]] {
    
    /**
      * Available while handling an SSDP response. A URL where the service description can be found.
      */
    var LOCATION: js.UndefOr[String] = js.native
    
    var ST: js.UndefOr[String] = js.native
    
    /**
      * Available while handling an SSDP response. The Unique Service Name (USN) of the responding device.
      */
    var USN: js.UndefOr[String] = js.native
  }
  object SsdpHeaders {
    
    @scala.inline
    def apply(): SsdpHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SsdpHeaders]
    }
    
    @scala.inline
    implicit class SsdpHeadersMutableBuilder[Self <: SsdpHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOCATION(value: String): Self = StObject.set(x, "LOCATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOCATIONUndefined: Self = StObject.set(x, "LOCATION", js.undefined)
      
      @scala.inline
      def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTUndefined: Self = StObject.set(x, "ST", js.undefined)
      
      @scala.inline
      def setUSN(value: String): Self = StObject.set(x, "USN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSNUndefined: Self = StObject.set(x, "USN", js.undefined)
    }
  }
  
  @js.native
  trait SsdpOptions extends StObject {
    
    /** A logger function to use instead of the default. The first argument to the function can contain a format string. */
    var customLogger: js.UndefOr[js.Function2[/* format */ String, /* repeated */ js.Any, Unit]] = js.native
    
    /** Path to SSDP description file */
    var description: js.UndefOr[String] = js.native
    
    /** Additional headers */
    var headers: js.UndefOr[SsdpHeaders] = js.native
    
    /**
      * SSDP multicast group
      * @default '239.255.255.250'
      */
    var ssdpIp: js.UndefOr[String] = js.native
    
    /**
      * SSDP port
      * @default 1900
      */
    var ssdpPort: js.UndefOr[Double] = js.native
    
    /**
      * SSDP signature
      * @default 'node.js/NODE_VERSION UPnP/1.1 node-ssdp/PACKAGE_VERSION'
      */
    var ssdpSig: js.UndefOr[String] = js.native
    
    /**
      * Multicast TTL
      * @default 4
      */
    var ssdpTtl: js.UndefOr[Double] = js.native
  }
  object SsdpOptions {
    
    @scala.inline
    def apply(): SsdpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SsdpOptions]
    }
    
    @scala.inline
    implicit class SsdpOptionsMutableBuilder[Self <: SsdpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomLogger(value: (/* format */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "customLogger", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomLoggerUndefined: Self = StObject.set(x, "customLogger", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHeaders(value: SsdpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setSsdpIp(value: String): Self = StObject.set(x, "ssdpIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsdpIpUndefined: Self = StObject.set(x, "ssdpIp", js.undefined)
      
      @scala.inline
      def setSsdpPort(value: Double): Self = StObject.set(x, "ssdpPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsdpPortUndefined: Self = StObject.set(x, "ssdpPort", js.undefined)
      
      @scala.inline
      def setSsdpSig(value: String): Self = StObject.set(x, "ssdpSig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsdpSigUndefined: Self = StObject.set(x, "ssdpSig", js.undefined)
      
      @scala.inline
      def setSsdpTtl(value: Double): Self = StObject.set(x, "ssdpTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsdpTtlUndefined: Self = StObject.set(x, "ssdpTtl", js.undefined)
    }
  }
}
