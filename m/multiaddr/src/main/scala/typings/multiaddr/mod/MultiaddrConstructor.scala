package typings.multiaddr.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiaddrConstructor
  extends /**
  * Creates a [multiaddr](https://github.com/multiformats/multiaddr) from
  * a Buffer, String or another Multiaddr instance
  * public key.
  * @param addr - If String or Buffer, needs to adhere
  * to the address format of a [multiaddr](https://github.com/multiformats/multiaddr#string-format)
  * @example
  * Multiaddr('/ip4/127.0.0.1/tcp/4001')
  * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
  */
Instantiable0[Multiaddr]
     with Instantiable1[(/* addr */ Buffer) | (/* addr */ Multiaddr) | (/* addr */ String), Multiaddr] {
  /**
    * Object containing table, names and codes of all supported protocols.
    * To get the protocol values from a Multiaddr, you can use
    * [`.protos()`](#multiaddrprotos),
    * [`.protoCodes()`](#multiaddrprotocodes) or
    * [`.protoNames()`](#multiaddrprotonames)
    *
    */
  @JSName("protocols")
  var protocols_Original: Protocols = js.native
  /**
    * Creates a [multiaddr](https://github.com/multiformats/multiaddr) from
    * a Buffer, String or another Multiaddr instance
    * public key.
    * @param addr - If String or Buffer, needs to adhere
    * to the address format of a [multiaddr](https://github.com/multiformats/multiaddr#string-format)
    * @example
    * Multiaddr('/ip4/127.0.0.1/tcp/4001')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    */
  def apply(): Multiaddr = js.native
  def apply(addr: String): Multiaddr = js.native
  def apply(addr: Multiaddr): Multiaddr = js.native
  def apply(addr: Buffer): Multiaddr = js.native
  /**
    * Creates a Multiaddr from a node-friendly address object
    *
    * @example
    * Multiaddr.fromNodeAddress({address: '127.0.0.1', port: '4001'}, 'tcp')
    * // <Multiaddr 047f000001060fa1 - /ip4/127.0.0.1/tcp/4001>
    */
  def fromNodeAddress(addr: NodeAddress, transport: String): Multiaddr = js.native
  def fromStupidString(str: String): scala.Nothing = js.native
  /**
    * Returns if something is a Multiaddr
    */
  def isMultiaddr(addr: js.Any): Boolean = js.native
  /**
    * Returns if something is a Multiaddr that is a name
    */
  def isName(name: js.Any): Boolean = js.native
  /**
    * Object containing table, names and codes of all supported protocols.
    * To get the protocol values from a Multiaddr, you can use
    * [`.protos()`](#multiaddrprotos),
    * [`.protoCodes()`](#multiaddrprotocodes) or
    * [`.protoNames()`](#multiaddrprotonames)
    *
    */
  def protocols(proto: String): Protocol = js.native
  def protocols(proto: Double): Protocol = js.native
  /**
    * Returns an array of multiaddrs, by resolving the multiaddr that is a name
    */
  def resolve(value: js.Any, cb: js.Function1[/* error */ Error, Unit]): js.Promise[Unit] = js.native
}

