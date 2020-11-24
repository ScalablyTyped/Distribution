package typings.multiaddr.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multiaddr extends js.Object {
  
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
