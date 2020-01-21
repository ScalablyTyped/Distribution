package typings.multiaddr.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiaddr extends js.Object {
  /**
    * The raw bytes representing this multiaddress
    */
  val buffer: Buffer = js.native
  /**
    * Decapsulates a Multiaddr from another Multiaddr
    *
    * @param addr - Multiaddr to remove from this Multiaddr
    * @example
    * const mh1 = Multiaddr('/ip4/8.8.8.8/tcp/1080')
    * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080>
    *
    * const mh2 = Multiaddr('/ip4/127.0.0.1/tcp/4001')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    *
    * const mh3 = mh1.encapsulate(mh2)
    * // <Multiaddr 0408080808060438047f000001060fa1 - /ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001>
    *
    * mh3.decapsulate(mh2).toString()
    * // '/ip4/8.8.8.8/tcp/1080'
    */
  def decapsulate(addr: String): Multiaddr = js.native
  def decapsulate(addr: Multiaddr): Multiaddr = js.native
  def decapsulate(addr: Buffer): Multiaddr = js.native
  /**
    * A more reliable version of `decapsulate` if you are targeting a
    * specific code, such as 421 (the `p2p` protocol code). The last index of the code
    * will be removed from the `Multiaddr`, and a new instance will be returned.
    * If the code is not present, the original `Multiaddr` is returned.
    *
    * @param code The code of the protocol to decapsulate from this Multiaddr
    * @example
    * const addr = Multiaddr('/ip4/0.0.0.0/tcp/8080/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSupNKC')
    * // <Multiaddr 0400... - /ip4/0.0.0.0/tcp/8080/p2p/QmcgpsyWgH8Y8ajJz1Cu72KnS5uo2Aa2LpzU7kinSupNKC>
    *
    * addr.decapsulateCode(421).toString()
    * // '/ip4/0.0.0.0/tcp/8080'
    *
    * Multiaddr('/ip4/127.0.0.1/tcp/8080').decapsulateCode(421).toString()
    * // '/ip4/127.0.0.1/tcp/8080'
    */
  def decapsulateCode(code: Code): Multiaddr = js.native
  /**
    * Encapsulates a Multiaddr in another Multiaddr
    *
    * @param addr - Multiaddr to add into this Multiaddr
    * @example
    * const mh1 = Multiaddr('/ip4/8.8.8.8/tcp/1080')
    * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080>
    *
    * const mh2 = Multiaddr('/ip4/127.0.0.1/tcp/4001')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    *
    * const mh3 = mh1.encapsulate(mh2)
    * // <Multiaddr 0408080808060438047f000001060fa1 - /ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001>
    *
    * mh3.toString()
    * // '/ip4/8.8.8.8/tcp/1080/ip4/127.0.0.1/tcp/4001'
    */
  def encapsulate(addr: String): Multiaddr = js.native
  def encapsulate(addr: Multiaddr): Multiaddr = js.native
  def encapsulate(addr: Buffer): Multiaddr = js.native
  /**
    * Checks if two Multiaddrs are the same
    *
    * @example
    * const mh1 = Multiaddr('/ip4/8.8.8.8/tcp/1080')
    * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080>
    *
    * const mh2 = Multiaddr('/ip4/127.0.0.1/tcp/4001')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    *
    * mh1.equals(mh1)
    * // true
    *
    * mh1.equals(mh2)
    * // false
    */
  def equals(other: Multiaddr): Boolean = js.native
  /**
    * Extract the path if the multiaddr contains one
    *
    * @example
    * const mh1 = Multiaddr('/ip4/8.8.8.8/tcp/1080/unix/tmp/p2p.sock')
    * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080/unix/tmp/p2p.sock>
    *
    * // should return utf8 string or null if the id is missing or invalid
    * const path = mh1.getPath()
    */
  def getPath(): String | Null = js.native
  /**
    * Extract the peerId if the multiaddr contains one
    *
    * @example
    * const mh1 = Multiaddr('/ip4/8.8.8.8/tcp/1080/ipfs/QmValidBase58string')
    * // <Multiaddr 0408080808060438 - /ip4/8.8.8.8/tcp/1080/ipfs/QmValidBase58string>
    *
    * // should return QmValidBase58string or null if the id is missing or invalid
    * const peerId = mh1.getPeerId()
    */
  def getPeerId(): String | Null = js.native
  /**
    * Returns Multiaddr as a human-readable string
    *
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001').inspect()
    * // '<Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>'
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
    * const mh1 = Multiaddr('/ip4/127.0.0.1/tcp/4001')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    * const mh2 = Multiaddr('/ip4/192.168.2.1/tcp/5001')
    * // <Multiaddr 04c0a80201061389 - /ip4/192.168.2.1/tcp/5001>
    * const mh3 = mh1.encapsulate(mh2)
    * // <Multiaddr 047f000001060fa104c0a80201061389 - /ip4/127.0.0.1/tcp/4001/ip4/192.168.2.1/tcp/5001>
    * mh1.isThinWaistAddress()
    * // true
    * mh2.isThinWaistAddress()
    * // true
    * mh3.isThinWaistAddress()
    * // false
    */
  def isThinWaistAddress(): Boolean = js.native
  def isThinWaistAddress(addr: Multiaddr): Boolean = js.native
  /**
    * Gets a Multiaddrs node-friendly address object. Note that protocol information
    * is left out: in Node (and most network systems) the protocol is unknowable
    * given only the address.
    *
    * Has to be a ThinWaist Address, otherwise throws error
    *
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001').nodeAddress()
    * // {family: 'IPv4', address: '127.0.0.1', port: '4001'}
    */
  def nodeAddress(): NodeAddress = js.native
  /**
    * Returns the codes of the protocols in left-to-right order.
    * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
    *
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001').protoCodes()
    * // [ 4, 6 ]
    */
  def protoCodes(): js.Array[Code] = js.native
  /**
    * Returns the names of the protocols in left-to-right order.
    * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
    *
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001').protoNames()
    * // [ 'ip4', 'tcp' ]
    */
  def protoNames(): js.Array[String] = js.native
  /**
    * Returns the protocols the Multiaddr is defined with, as an array of objects, in
    * left-to-right order. Each object contains the protocol code, protocol name,
    * and the size of its address space in bits.
    * [See list of protocols](https://github.com/multiformats/multiaddr/blob/master/protocols.csv)
    *
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001').protos()
    * // [ { code: 4, size: 32, name: 'ip4' },
    * //   { code: 6, size: 16, name: 'tcp' } ]
    */
  def protos(): js.Array[Protocol] = js.native
  /**
    * Returns a tuple of string/number parts
    *
    * @example
    * Multiaddr("/ip4/127.0.0.1/tcp/4001").stringTuples()
    * // [ [ 4, '127.0.0.1' ], [ 6, 4001 ] ]
    */
  def stringTuples(): js.Array[js.Tuple2[Code, js.UndefOr[String | Double]]] = js.native
  /**
    * Returns Multiaddr as a JSON encoded object
    *
    * @example
    * JSON.stringify(Multiaddr('/ip4/127.0.0.1/tcp/4001'))
    * // '/ip4/127.0.0.1/tcp/4001'
    */
  def toJSON(): String = js.native
  /**
    * Returns Multiaddr as a convenient options object to be used with net.createConnection
    *
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001').toOptions()
    * // { family: 'ipv4', host: '127.0.0.1', transport: 'tcp', port: 4001 }
    */
  def toOptions(): Options = js.native
  /**
    * Returns a tuple of parts
    *
    * @example
    * Multiaddr("/ip4/127.0.0.1/tcp/4001").tuples()
    * // [ [ 4, <Buffer 7f 00 00 01> ], [ 6, <Buffer 0f a1> ] ]
    */
  def tuples(): js.Array[js.Tuple2[Code, Buffer]] = js.native
}

