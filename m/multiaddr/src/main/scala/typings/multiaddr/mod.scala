package typings.multiaddr

import typings.multiaddr.anon.Address
import typings.multiaddr.multiaddrInts.`-1`
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multiaddr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiaddr", "Multiaddr")
  @js.native
  /**
    * @example
    * ```js
    * new Multiaddr('/ip4/127.0.0.1/tcp/4001')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    * ```
    *
    * @param {MultiaddrInput} [addr] - If String or Uint8Array, needs to adhere to the address format of a [multiaddr](https://github.com/multiformats/multiaddr#string-format)
    */
  open class Multiaddr_ () extends StObject {
    def this(addr: MultiaddrInput) = this()
    
    /** @type {Uint8Array} - The raw bytes representing this multiaddress */
    var bytes: js.typedarray.Uint8Array = js.native
    
    def decapsulate(addr: String): Multiaddr_ = js.native
    /**
      * Decapsulates a Multiaddr from another Multiaddr
      *
      * @example
      * ```js
      * const mh1 = new Multiaddr('/ip4/8.8.8.8/tcp/1080')
      * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080>
      *
      * const mh2 = new Multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
      *
      * const mh3 = mh1.encapsulate(mh2)
      * // <Multiaddr 0408080808060438047f000001060fa1 - /ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001>
      *
      * mh3.decapsulate(mh2).toString()
      * // '/ip4/8.8.8.8/tcp/1080'
      * ```
      *
      * @param {Multiaddr | string} addr - Multiaddr to remove from this Multiaddr
      * @returns {Multiaddr}
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
      * const addr = new Multiaddr('/ip4/0.0.0.0/tcp/8080/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSupNKC')
      * // <Multiaddr 0400... - /ip4/0.0.0.0/tcp/8080/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSupNKC>
      *
      * addr.decapsulateCode(421).toString()
      * // '/ip4/0.0.0.0/tcp/8080'
      *
      * new Multiaddr('/ip4/127.0.0.1/tcp/8080').decapsulateCode(421).toString()
      * // '/ip4/127.0.0.1/tcp/8080'
      * ```
      *
      * @param {number} code - The code of the protocol to decapsulate from this Multiaddr
      * @returns {Multiaddr}
      */
    def decapsulateCode(code: Double): Multiaddr_ = js.native
    
    /**
      * Encapsulates a Multiaddr in another Multiaddr
      *
      * @example
      * ```js
      * const mh1 = new Multiaddr('/ip4/8.8.8.8/tcp/1080')
      * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080>
      *
      * const mh2 = new Multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
      *
      * const mh3 = mh1.encapsulate(mh2)
      * // <Multiaddr 0408080808060438047f000001060fa1 - /ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001>
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
      * const mh1 = new Multiaddr('/ip4/8.8.8.8/tcp/1080')
      * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080>
      *
      * const mh2 = new Multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
      *
      * mh1.equals(mh1)
      * // true
      *
      * mh1.equals(mh2)
      * // false
      * ```
      *
      * @param {Multiaddr} addr
      * @returns {boolean}
      */
    def equals(addr: Multiaddr_): Boolean = js.native
    
    /**
      * Extract the path if the multiaddr contains one
      *
      * @example
      * ```js
      * const mh1 = new Multiaddr('/ip4/8.8.8.8/tcp/1080/unix/tmp/p2p.sock')
      * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080/unix/tmp/p2p.sock>
      *
      * // should return utf8 string or null if the id is missing or invalid
      * const path = mh1.getPath()
      * ```js
      *
      * @returns {string | null} path - The path of the multiaddr, or null if no path protocol is present
      */
    def getPath(): String | Null = js.native
    
    /**
      * Extract the peerId if the multiaddr contains one
      *
      * @example
      * ```js
      * const mh1 = new Multiaddr('/ip4/8.8.8.8/tcp/1080/ipfs/QmValidBase58string')
      * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080/ipfs/QmValidBase58string>
      *
      * // should return QmValidBase58string or null if the id is missing or invalid
      * const peerId = mh1.getPeerId()
      * ```
      *
      * @returns {string | null} peerId - The id of the peer or null if invalid or missing from the ma
      */
    def getPeerId(): String | Null = js.native
    
    /**
      * Returns Multiaddr as a human-readable string.
      * Fallback for pre Node.js v10.0.0.
      * https://nodejs.org/api/deprecations.html#deprecations_dep0079_custom_inspection_function_on_objects_via_inspect
      *
      * @example
      * ```js
      * new Multiaddr('/ip4/127.0.0.1/tcp/4001').inspect()
      * // '<Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>'
      * ```
      *
      * @returns {string}
      */
    def inspect(): String = js.native
    
    /**
      * Returns if a Multiaddr is a Thin Waist address or not.
      *
      * Thin Waist is if a Multiaddr adheres to the standard combination of:
      *
      * `{IPv4, IPv6}/{TCP, UDP}`
      *
      * @example
      * ```js
      * const mh1 = new Multiaddr('/ip4/127.0.0.1/tcp/4001')
      * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
      * const mh2 = new Multiaddr('/ip4/192.168.2.1/tcp/5001')
      * // <Multiaddr 04c0a80201061389 - /ip4/192.168.2.1/tcp/5001>
      * const mh3 = mh1.encapsulate(mh2)
      * // <Multiaddr 047f000001060fa104c0a80201061389 - /ip4/127.0.0.1/tcp/4001/ip4/192.168.2.1/tcp/5001>
      * const mh4 = new Multiaddr('/ip4/127.0.0.1/tcp/2000/wss/p2p-webrtc-star/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSooo2a')
      * // <Multiaddr 047f0000010607d0de039302a503221220d52ebb89d85b02a284948203a62ff28389c57c9f42beec4ec20db76a64835843 - /ip4/127.0.0.1/tcp/2000/wss/p2p-webrtc-star/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSooo2a>
      * mh1.isThinWaistAddress()
      * // true
      * mh2.isThinWaistAddress()
      * // true
      * mh3.isThinWaistAddress()
      * // false
      * mh4.isThinWaistAddress()
      * // false
      * ```
      *
      * @param {Multiaddr} [addr] - Defaults to using `this` instance
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
      * new Multiaddr('/ip4/127.0.0.1/tcp/4001').nodeAddress()
      * // {family: 4, address: '127.0.0.1', port: 4001}
      * ```
      *
      * @returns {{family: 4 | 6, address: string, port: number}}
      * @throws {Error} Throws error if Multiaddr is not a Thin Waist address
      */
    def nodeAddress(): Address = js.native
    
    /**
      * Returns the codes of the protocols in left-to-right order.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      *
      * @example
      * ```js
      * Multiaddr('/ip4/127.0.0.1/tcp/4001').protoCodes()
      * // [ 4, 6 ]
      * ```
      *
      * @returns {number[]} protocol codes
      */
    def protoCodes(): js.Array[Double] = js.native
    
    /**
      * Returns the names of the protocols in left-to-right order.
      * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
      *
      * @example
      * ```js
      * new Multiaddr('/ip4/127.0.0.1/tcp/4001').protoNames()
      * // [ 'ip4', 'tcp' ]
      * ```
      *
      * @returns {string[]} protocol names
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
      * new Multiaddr('/ip4/127.0.0.1/tcp/4001').protos()
      * // [ { code: 4, size: 32, name: 'ip4' },
      * //   { code: 6, size: 16, name: 'tcp' } ]
      * ```
      *
      * @returns {Protocol[]} protocols - All the protocols the address is composed of
      */
    def protos(): js.Array[Protocol] = js.native
    
    /**
      * Resolve multiaddr if containing resolvable hostname.
      *
      * @example
      * ```js
      * Multiaddr.resolvers.set('dnsaddr', resolverFunction)
      * const mh1 = new Multiaddr('/dnsaddr/bootstrap.libp2p.io/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb')
      * const resolvedMultiaddrs = await mh1.resolve()
      * // [
      * //   <Multiaddr 04934b5353060fa1a503221220c10f9319dac35c270a6b74cd644cb3acfc1f6efc8c821f8eb282599fd1814f64 - /ip4/147.75.83.83/tcp/4001/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb>,
      * //   <Multiaddr 04934b53530601bbde03a503221220c10f9319dac35c270a6b74cd644cb3acfc1f6efc8c821f8eb282599fd1814f64 - /ip4/147.75.83.83/tcp/443/wss/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb>,
      * //   <Multiaddr 04934b535391020fa1cc03a503221220c10f9319dac35c270a6b74cd644cb3acfc1f6efc8c821f8eb282599fd1814f64 - /ip4/147.75.83.83/udp/4001/quic/p2p/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb>
      * // ]
      * ```
      *
      * @returns {Promise<Array<Multiaddr>>}
      */
    def resolve(): js.Promise[js.Array[Multiaddr_]] = js.native
    
    /**
      * Returns a tuple of string/number parts
      * - tuples[][0] = code of protocol
      * - tuples[][1] = contents of address
      *
      * @example
      * ```js
      * new Multiaddr("/ip4/127.0.0.1/tcp/4001").stringTuples()
      * // [ [ 4, '127.0.0.1' ], [ 6, '4001' ] ]
      * ```
      */
    def stringTuples(): js.Array[js.Tuple2[Double, js.UndefOr[String]]] = js.native
    
    /**
      * Returns Multiaddr as a JSON encoded object
      *
      * @example
      * ```js
      * JSON.stringify(new Multiaddr('/ip4/127.0.0.1/tcp/4001'))
      * // '/ip4/127.0.0.1/tcp/4001'
      * ```
      */
    def toJSON(): String = js.native
    
    /**
      * Returns Multiaddr as a convinient options object to be used with net.createConnection
      *
      * @example
      * ```js
      * new Multiaddr('/ip4/127.0.0.1/tcp/4001').toOptions()
      * // { family: 4, host: '127.0.0.1', transport: 'tcp', port: 4001 }
      * ```
      */
    def toOptions(): typings.multiaddr.distSrcTypesMod.MultiaddrObject = js.native
    
    /**
      * Returns a tuple of parts
      *
      * @example
      * ```js
      * new Multiaddr("/ip4/127.0.0.1/tcp/4001").tuples()
      * // [ [ 4, <Buffer 7f 00 00 01> ], [ 6, <Buffer 0f a1> ] ]
      * ```
      */
    def tuples(): js.Array[js.Tuple2[Double, js.UndefOr[js.typedarray.Uint8Array]]] = js.native
  }
  /* static members */
  object Multiaddr_ {
    
    @JSImport("multiaddr", "Multiaddr")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Multiaddr from a node-friendly address object
      *
      * @example
      * ```js
      * Multiaddr.fromNodeAddress({address: '127.0.0.1', port: '4001'}, 'tcp')
      * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
      * ```
      *
      * @param {{family: 4 | 6, address: string, port: number}} addr
      * @param {string} transport
      */
    inline def fromNodeAddress(addr: Address, transport: String): Multiaddr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeAddress")(addr.asInstanceOf[js.Any], transport.asInstanceOf[js.Any])).asInstanceOf[Multiaddr_]
    
    /**
      * Check if object is a CID instance
      *
      * @param {any} value
      * @returns {value is Multiaddr}
      */
    inline def isMultiaddr(value: Any): /* is multiaddr.multiaddr.Multiaddr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiaddr")(value.asInstanceOf[js.Any]).asInstanceOf[/* is multiaddr.multiaddr.Multiaddr */ Boolean]
    
    /**
      * Returns if something is a Multiaddr that is a name
      *
      * @param {Multiaddr} addr
      * @returns {boolean} isName
      */
    inline def isName(addr: Multiaddr_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isName")(addr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def multiaddr(addr: MultiaddrInput): Multiaddr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddr")(addr.asInstanceOf[js.Any]).asInstanceOf[Multiaddr_]
  
  object protocols {
    
    inline def apply(proto: String): typings.multiaddr.distSrcProtocolsTableMod.Protocol = ^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any]).asInstanceOf[typings.multiaddr.distSrcProtocolsTableMod.Protocol]
    /** @typedef {import("./types").Protocol} Protocol */
    /**
      * Protocols
      *
      * @param {number | string} proto
      * @returns {Protocol}
      */
    inline def apply(proto: Double): typings.multiaddr.distSrcProtocolsTableMod.Protocol = ^.asInstanceOf[js.Dynamic].apply(proto.asInstanceOf[js.Any]).asInstanceOf[typings.multiaddr.distSrcProtocolsTableMod.Protocol]
    
    @JSImport("multiaddr", "protocols")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiaddr", "protocols.V")
    @js.native
    val V: `-1` = js.native
    
    @JSImport("multiaddr", "protocols.codes")
    @js.native
    def codes: Record[Double, typings.multiaddr.distSrcProtocolsTableMod.Protocol] = js.native
    inline def codes_=(x: Record[Double, typings.multiaddr.distSrcProtocolsTableMod.Protocol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codes")(x.asInstanceOf[js.Any])
    
    @JSImport("multiaddr", "protocols.lengthPrefixedVarSize")
    @js.native
    val lengthPrefixedVarSize: `-1` = js.native
    
    @JSImport("multiaddr", "protocols.names")
    @js.native
    def names: Record[String, typings.multiaddr.distSrcProtocolsTableMod.Protocol] = js.native
    inline def names_=(x: Record[String, typings.multiaddr.distSrcProtocolsTableMod.Protocol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
    
    /**
      *
      * Create a protocol
      *
      * @param {number} code
      * @param {number} size
      * @param {string} name
      * @param {any} [resolvable]
      * @param {any} [path]
      * @returns {Protocol}
      */
    inline def `object`(code: Double, size: Double, name: String): typings.multiaddr.distSrcProtocolsTableMod.Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.multiaddr.distSrcProtocolsTableMod.Protocol]
    inline def `object`(code: Double, size: Double, name: String, resolvable: Any): typings.multiaddr.distSrcProtocolsTableMod.Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any])).asInstanceOf[typings.multiaddr.distSrcProtocolsTableMod.Protocol]
    inline def `object`(code: Double, size: Double, name: String, resolvable: Any, path: Any): typings.multiaddr.distSrcProtocolsTableMod.Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.multiaddr.distSrcProtocolsTableMod.Protocol]
    inline def `object`(code: Double, size: Double, name: String, resolvable: Unit, path: Any): typings.multiaddr.distSrcProtocolsTableMod.Protocol = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(code.asInstanceOf[js.Any], size.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resolvable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.multiaddr.distSrcProtocolsTableMod.Protocol]
    
    @JSImport("multiaddr", "protocols.table")
    @js.native
    def table: js.Array[
        js.Tuple5[Double, Double, String, js.UndefOr[String | Boolean], js.UndefOr[String]]
      ] = js.native
    inline def table_=(
      x: js.Array[
          js.Tuple5[Double, Double, String, js.UndefOr[String | Boolean], js.UndefOr[String]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("table")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("multiaddr", "resolvers")
  @js.native
  val resolvers: Map[String, Resolver] = js.native
  
  type MultiaddrInput = String | Multiaddr_ | js.typedarray.Uint8Array | Null
  
  type MultiaddrObject = typings.multiaddr.distSrcTypesMod.MultiaddrObject
  
  type Protocol = typings.multiaddr.distSrcTypesMod.Protocol
  
  type Resolver = js.Function1[/* addr */ Multiaddr_, js.Promise[js.Array[String]]]
}
