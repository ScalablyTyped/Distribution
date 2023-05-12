package typings.multiformatsMultiaddr

import typings.multiformatsMultiaddr.anon.Bytes
import typings.multiformatsMultiaddr.multiformatsMultiaddrInts.`4`
import typings.multiformatsMultiaddr.multiformatsMultiaddrInts.`6`
import typings.std.AbortSignal
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@multiformats/multiaddr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@multiformats/multiaddr", "MultiaddrFilter")
  @js.native
  open class MultiaddrFilter protected ()
    extends typings.multiformatsMultiaddr.distSrcFilterMultiaddrFilterMod.MultiaddrFilter {
    def this(input: MultiaddrInput) = this()
  }
  
  inline def fromNodeAddress(addr: NodeAddress, transport: String): Multiaddr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeAddress")(addr.asInstanceOf[js.Any], transport.asInstanceOf[js.Any])).asInstanceOf[Multiaddr_]
  
  inline def isMultiaddr(value: Any): /* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiaddr")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @multiformats/multiaddr.@multiformats/multiaddr.Multiaddr */ Boolean]
  
  inline def isName(addr: Multiaddr_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isName")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def multiaddr(): Multiaddr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddr")().asInstanceOf[Multiaddr_]
  inline def multiaddr(addr: MultiaddrInput): Multiaddr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddr")(addr.asInstanceOf[js.Any]).asInstanceOf[Multiaddr_]
  
  inline def protocols(proto: String): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("protocols")(proto.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  inline def protocols(proto: Double): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("protocols")(proto.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  
  @JSImport("@multiformats/multiaddr", "resolvers")
  @js.native
  val resolvers: Map[String, Resolver] = js.native
  
  trait AbortOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object AbortOptions {
    
    inline def apply(): AbortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortOptions] (val x: Self) extends AnyVal {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type MultiaddrInput = String | Multiaddr_ | js.typedarray.Uint8Array | Null
  
  trait MultiaddrObject extends StObject {
    
    var family: `4` | `6`
    
    var host: String
    
    var port: Double
    
    var transport: String
  }
  object MultiaddrObject {
    
    inline def apply(family: `4` | `6`, host: String, port: Double, transport: String): MultiaddrObject = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiaddrObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiaddrObject] (val x: Self) extends AnyVal {
      
      inline def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Multiaddr_ extends StObject {
    
    var bytes: js.typedarray.Uint8Array = js.native
    
    def decapsulate(addr: String): Multiaddr_ = js.native
    /**
      * Decapsulates a Multiaddr from another Multiaddr
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const mh1 = multiaddr('/ip4/8.8.8.8/tcp/1080')
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080)
      *
      * const mh2 = multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // Multiaddr(/ip4/127.0.0.1/tcp/4001)
      *
      * const mh3 = mh1.encapsulate(mh2)
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001)
      *
      * mh3.decapsulate(mh2).toString()
      * // '/ip4/8.8.8.8/tcp/1080'
      * ```
      *
      * @param {Multiaddr | string} addr - Multiaddr to remove from this Multiaddr
      */
    def decapsulate(addr: Multiaddr_): Multiaddr_ = js.native
    
    /**
      * A more reliable version of `decapsulate` if you are targeting a
      * specific code, such as 421 (the `p2p` protocol code). The last index of the code
      * will be removed from the `Multiaddr`, and a new instance will be returned.
      * If the code is not present, the original `Multiaddr` is returned.
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const addr = multiaddr('/ip4/0.0.0.0/tcp/8080/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSupNKC')
      * // Multiaddr(/ip4/0.0.0.0/tcp/8080/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSupNKC)
      *
      * addr.decapsulateCode(421).toString()
      * // '/ip4/0.0.0.0/tcp/8080'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/8080').decapsulateCode(421).toString()
      * // '/ip4/127.0.0.1/tcp/8080'
      * ```
      */
    def decapsulateCode(code: Double): Multiaddr_ = js.native
    
    /**
      * Encapsulates a Multiaddr in another Multiaddr
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const mh1 = multiaddr('/ip4/8.8.8.8/tcp/1080')
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080)
      *
      * const mh2 = multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // Multiaddr(/ip4/127.0.0.1/tcp/4001)
      *
      * const mh3 = mh1.encapsulate(mh2)
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001)
      *
      * mh3.toString()
      * // '/ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001'
      * ```
      *
      * @param {MultiaddrInput} addr - Multiaddr to add into this Multiaddr
      */
    def encapsulate(addr: MultiaddrInput): Multiaddr_ = js.native
    
    /**
      * Checks if two Multiaddrs are the same
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const mh1 = multiaddr('/ip4/8.8.8.8/tcp/1080')
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080)
      *
      * const mh2 = multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // Multiaddr(/ip4/127.0.0.1/tcp/4001)
      *
      * mh1.equals(mh1)
      * // true
      *
      * mh1.equals(mh2)
      * // false
      * ```
      */
    def equals(addr: Bytes): Boolean = js.native
    
    /**
      * Extract the path if the multiaddr contains one
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const mh1 = multiaddr('/ip4/8.8.8.8/tcp/1080/unix/tmp/p2p.sock')
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080/unix/tmp/p2p.sock)
      *
      * // should return utf8 string or null if the id is missing or invalid
      * const path = mh1.getPath()
      * ```
      */
    def getPath(): String | Null = js.native
    
    /**
      * Extract the peerId if the multiaddr contains one
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const mh1 = multiaddr('/ip4/8.8.8.8/tcp/1080/ipfs/QmValidBase58string')
      * // Multiaddr(/ip4/8.8.8.8/tcp/1080/ipfs/QmValidBase58string)
      *
      * // should return QmValidBase58string or null if the id is missing or invalid
      * const peerId = mh1.getPeerId()
      * ```
      */
    def getPeerId(): String | Null = js.native
    
    /**
      * Returns if a Multiaddr is a Thin Waist address or not.
      *
      * Thin Waist is if a Multiaddr adheres to the standard combination of:
      *
      * `{IPv4, IPv6}/{TCP, UDP}`
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * const mh1 = multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // Multiaddr(/ip4/127.0.0.1/tcp/4001)
      * const mh2 = multiaddr('/ip4/192.168.2.1/tcp/5001')
      * // Multiaddr(/ip4/192.168.2.1/tcp/5001)
      * const mh3 = mh1.encapsulate(mh2)
      * // Multiaddr(/ip4/127.0.0.1/tcp/4001/ip4/192.168.2.1/tcp/5001)
      * const mh4 = multiaddr('/ip4/127.0.0.1/tcp/2000/wss/p2p-webrtc-star/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSooo2a')
      * // Multiaddr(/ip4/127.0.0.1/tcp/2000/wss/p2p-webrtc-star/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSooo2a)
      * mh1.isThinWaistAddress()
      * // true
      * mh2.isThinWaistAddress()
      * // true
      * mh3.isThinWaistAddress()
      * // false
      * mh4.isThinWaistAddress()
      * // false
      * ```
      */
    def isThinWaistAddress(): Boolean = js.native
    def isThinWaistAddress(addr: Multiaddr_): Boolean = js.native
    
    /**
      * Gets a Multiaddrs node-friendly address object. Note that protocol information
      * is left out: in Node (and most network systems) the protocol is unknowable
      * given only the address.
      *
      * Has to be a ThinWaist Address, otherwise throws error
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').nodeAddress()
      * // {family: 4, address: '127.0.0.1', port: 4001}
      * ```
      */
    def nodeAddress(): NodeAddress = js.native
    
    /**
      * Returns the codes of the protocols in left-to-right order.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').protoCodes()
      * // [ 4, 6 ]
      * ```
      */
    def protoCodes(): js.Array[Double] = js.native
    
    /**
      * Returns the names of the protocols in left-to-right order.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').protoNames()
      * // [ 'ip4', 'tcp' ]
      * ```
      */
    def protoNames(): js.Array[String] = js.native
    
    /**
      * Returns the protocols the Multiaddr is defined with, as an array of objects, in
      * left-to-right order. Each object contains the protocol code, protocol name,
      * and the size of its address space in bits.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').protos()
      * // [ { code: 4, size: 32, name: 'ip4' },
      * //   { code: 6, size: 16, name: 'tcp' } ]
      * ```
      */
    def protos(): js.Array[Protocol] = js.native
    
    /**
      * Resolve multiaddr if containing resolvable hostname.
      *
      * @example
      * ```js
      * import { multiaddr, resolvers } from '@multiformats/multiaddr'
      *
      * resolvers.set('dnsaddr', resolverFunction)
      * const mh1 = multiaddr('/dnsaddr/bootstrap.libp2p.io/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb')
      * const resolvedMultiaddrs = await mh1.resolve()
      * // [
      * //   Multiaddr(/ip4/147.75.83.83/tcp/4001/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb),
      * //   Multiaddr(/ip4/147.75.83.83/tcp/443/wss/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb),
      * //   Multiaddr(/ip4/147.75.83.83/udp/4001/quic/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb)
      * // ]
      * ```
      */
    def resolve(): js.Promise[js.Array[Multiaddr_]] = js.native
    def resolve(options: AbortOptions): js.Promise[js.Array[Multiaddr_]] = js.native
    
    /**
      * Returns a tuple of string/number parts
      * - tuples[][0] = code of protocol
      * - tuples[][1] = contents of address
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').stringTuples()
      * // [ [ 4, '127.0.0.1' ], [ 6, '4001' ] ]
      * ```
      */
    def stringTuples(): js.Array[StringTuple] = js.native
    
    /**
      * Returns Multiaddr as a JSON encoded object
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * JSON.stringify(multiaddr('/ip4/127.0.0.1/tcp/4001'))
      * // '/ip4/127.0.0.1/tcp/4001'
      * ```
      */
    def toJSON(): String = js.native
    
    /**
      * Returns Multiaddr as a convinient options object to be used with net.createConnection
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').toOptions()
      * // { family: 4, host: '127.0.0.1', transport: 'tcp', port: 4001 }
      * ```
      */
    def toOptions(): MultiaddrObject = js.native
    
    /**
      * Returns a tuple of parts
      *
      * @example
      * ```js
      * import { multiaddr } from '@multiformats/multiaddr'
      *
      * multiaddr('/ip4/127.0.0.1/tcp/4001').tuples()
      * // [ [ 4, <Buffer 7f 00 00 01> ], [ 6, <Buffer 0f a1> ] ]
      * ```
      */
    def tuples(): js.Array[Tuple] = js.native
  }
  
  trait NodeAddress extends StObject {
    
    var address: String
    
    var family: `4` | `6`
    
    var port: Double
  }
  object NodeAddress {
    
    inline def apply(address: String, family: `4` | `6`, port: Double): NodeAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Protocol extends StObject {
    
    var code: Double
    
    var name: String
    
    var path: js.UndefOr[Boolean] = js.undefined
    
    var resolvable: js.UndefOr[Boolean] = js.undefined
    
    var size: Double
  }
  object Protocol {
    
    inline def apply(code: Double, name: String, size: Double): Protocol = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setResolvable(value: Boolean): Self = StObject.set(x, "resolvable", value.asInstanceOf[js.Any])
      
      inline def setResolvableUndefined: Self = StObject.set(x, "resolvable", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type Resolver = js.Function2[
    /* addr */ Multiaddr_, 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[js.Array[String]]
  ]
  
  type StringTuple = js.Tuple2[Double, js.UndefOr[String]]
  
  type Tuple = js.Tuple2[Double, js.UndefOr[js.typedarray.Uint8Array]]
}
