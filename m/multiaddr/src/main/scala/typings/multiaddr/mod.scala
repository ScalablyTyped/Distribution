package typings.multiaddr

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.multiaddr.multiaddrStrings.IPv4
import typings.multiaddr.multiaddrStrings.IPv6
import typings.multiaddr.multiaddrStrings.ipv4_
import typings.multiaddr.multiaddrStrings.ipv6_
import typings.multiaddr.multiaddrStrings.tcp
import typings.multiaddr.multiaddrStrings.udp
import typings.std.Map
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a [multiaddr](https://github.com/multiformats/multiaddr) from
    * a Uint8Array, String or another Multiaddr instance
    * public key.
    * @param addr - If String or Uint8Array, needs to adhere
    * to the address format of a [multiaddr](https://github.com/multiformats/multiaddr#string-format)
    */
  @JSImport("multiaddr", JSImport.Namespace)
  @js.native
  def apply(): Multiaddr = js.native
  @JSImport("multiaddr", JSImport.Namespace)
  @js.native
  def apply(input: MultiaddrInput): Multiaddr = js.native
  
  @JSImport("multiaddr", JSImport.Namespace)
  @js.native
  /**
    * Creates a [multiaddr](https://github.com/multiformats/multiaddr) from
    * a Uint8Array, String or another Multiaddr instance
    * public key.
    * @param addr - If String or Uint8Array, needs to adhere
    * to the address format of a [multiaddr](https://github.com/multiformats/multiaddr#string-format)
    */
  class ^ () extends Multiaddr {
    def this(addr: MultiaddrInput) = this()
  }
  
  /**
    * Creates a Multiaddr from a node-friendly address object
    */
  @JSImport("multiaddr", "fromNodeAddress")
  @js.native
  def fromNodeAddress(addr: NodeAddress, transport: String): Multiaddr = js.native
  
  /**
    * Returns if something is a Multiaddr
    */
  @JSImport("multiaddr", "isMultiaddr")
  @js.native
  def isMultiaddr(addr: js.Any): /* is multiaddr.multiaddr.Multiaddr */ Boolean = js.native
  
  /**
    * Returns if something is a Multiaddr that is a name
    */
  @JSImport("multiaddr", "isName")
  @js.native
  def isName(addr: Multiaddr): Boolean = js.native
  
  /**
    * Object containing table, names and codes of all supported protocols.
    * To get the protocol values from a Multiaddr, you can use
    * [`.protos()`](#multiaddrprotos),
    * [`.protoCodes()`](#multiaddrprotocodes) or
    * [`.protoNames()`](#multiaddrprotonames)
    */
  @JSImport("multiaddr", "protocols")
  @js.native
  val protocols: Protocols_ = js.native
  
  /**
    * Returns an array of multiaddrs, by resolving the multiaddr that is a name
    */
  @JSImport("multiaddr", "resolve")
  @js.native
  def resolve(addr: Multiaddr): js.Promise[js.Array[Multiaddr]] = js.native
  
  @JSImport("multiaddr", "resolvers")
  @js.native
  val resolvers: Map[String, js.Function1[/* addr */ Multiaddr, js.Promise[js.Array[String]]]] = js.native
  
  @js.native
  trait Multiaddr extends StObject {
    
    var bytes: Uint8Array = js.native
    
    /**
      * Decapsulates a Multiaddr from another Multiaddr
      */
    def decapsulate(addr: MultiaddrInput): Multiaddr = js.native
    
    /**
      * A more reliable version of `decapsulate` if you are targeting a
      * specific code, such as 421 (the `p2p` protocol code). The last index of the code
      * will be removed from the `Multiaddr`, and a new instance will be returned.
      * If the code is not present, the original `Multiaddr` is returned.
      */
    def decapsulateCode(code: Double): Multiaddr = js.native
    
    /**
      * Encapsulates a Multiaddr in another Multiaddr
      */
    def encapsulate(addr: MultiaddrInput): Multiaddr = js.native
    
    /**
      * Checks if two Multiaddrs are the same
      */
    def equals(addr: Multiaddr): Boolean = js.native
    
    /**
      * Extract the path if the multiaddr contains one
      */
    def getPath(): String | Null = js.native
    
    /**
      * Extract the peerId if the multiaddr contains one
      */
    def getPeerId(): String = js.native
    
    /**
      * Returns Multiaddr as a human-readable string
      */
    def inspect(): String = js.native
    
    /**
      * Returns if a Multiaddr is a Thin Waist address or not.
      *
      * Thin Waist is if a Multiaddr adheres to the standard combination of:
      *
      * `{IPv4, IPv6}/{TCP, UDP}`
      */
    def isThinWaistAddress(): Boolean = js.native
    def isThinWaistAddress(addr: Multiaddr): Boolean = js.native
    
    /**
      * Gets a Multiaddrs node-friendly address object. Note that protocol information
      * is left out: in Node (and most network systems) the protocol is unknowable
      * given only the address.
      *
      * Has to be a ThinWaist Address, otherwise throws error
      */
    def nodeAddress(): NodeAddress = js.native
    
    /**
      * Returns the codes of the protocols in left-to-right order.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      */
    def protoCodes(): js.Array[Double] = js.native
    
    /**
      * Returns the names of the protocols in left-to-right order.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      */
    def protoNames(): js.Array[String] = js.native
    
    /**
      * Returns the protocols the Multiaddr is defined with, as an array of objects, in
      * left-to-right order. Each object contains the protocol code, protocol name,
      * and the size of its address space in bits.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      */
    def protos(): js.Array[Protocol] = js.native
    
    /**
      * Resolve multiaddr if containing resolvable hostname.
      */
    def resolve(): js.Promise[js.Array[Multiaddr]] = js.native
    
    /**
      * Returns a tuple of string/number parts
      */
    def stringTuples(): js.Array[js.Tuple2[Double, String | Double]] = js.native
    
    /**
      * Returns Multiaddr as a JSON encoded object
      */
    def toJSON(): String = js.native
    
    /**
      * Returns Multiaddr as a convinient options object to be used with net.createConnection
      */
    def toOptions(): NetOptions = js.native
    
    /**
      * Returns a tuple of parts
      */
    def tuples(): js.Array[js.Tuple2[Double, Uint8Array]] = js.native
  }
  
  type MultiaddrInput = String | Uint8Array | Multiaddr | Null
  
  @js.native
  trait NetOptions extends StObject {
    
    var family: ipv4_ | ipv6_ = js.native
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var transport: tcp | udp = js.native
  }
  object NetOptions {
    
    @scala.inline
    def apply(family: ipv4_ | ipv6_, host: String, port: Double, transport: tcp | udp): NetOptions = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetOptions]
    }
    
    @scala.inline
    implicit class NetOptionsMutableBuilder[Self <: NetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: ipv4_ | ipv6_): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport(value: tcp | udp): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeAddress extends StObject {
    
    var address: String = js.native
    
    var family: IPv4 | IPv6 = js.native
    
    var port: String = js.native
  }
  object NodeAddress {
    
    @scala.inline
    def apply(address: String, family: IPv4 | IPv6, port: String): NodeAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeAddress]
    }
    
    @scala.inline
    implicit class NodeAddressMutableBuilder[Self <: NodeAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: IPv4 | IPv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Protocol extends StObject {
    
    var code: Double = js.native
    
    var name: String = js.native
    
    var path: js.UndefOr[Boolean] = js.native
    
    var resolvable: js.UndefOr[Boolean] = js.native
    
    var size: Double = js.native
  }
  object Protocol {
    
    @scala.inline
    def apply(code: Double, name: String, size: Double): Protocol = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setResolvable(value: Boolean): Self = StObject.set(x, "resolvable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvableUndefined: Self = StObject.set(x, "resolvable", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Protocols_ extends StObject {
    
    var codes: NumberDictionary[Protocol] = js.native
    
    var names: StringDictionary[Protocol] = js.native
    
    def `object`(code: Double, size: Double, name: String): Protocol = js.native
    def `object`(code: Double, size: Double, name: String, resolvable: js.UndefOr[scala.Nothing], path: js.Any): Protocol = js.native
    def `object`(code: Double, size: Double, name: String, resolvable: js.Any): Protocol = js.native
    def `object`(code: Double, size: Double, name: String, resolvable: js.Any, path: js.Any): Protocol = js.native
    
    var table: NumberDictionary[Protocol] = js.native
  }
}
