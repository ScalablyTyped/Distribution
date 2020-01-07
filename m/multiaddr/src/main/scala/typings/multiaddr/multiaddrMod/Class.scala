package typings.multiaddr.multiaddrMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multiaddr", JSImport.Namespace)
@js.native
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
class Class () extends Multiaddr {
  def this(addr: String) = this()
  def this(addr: Multiaddr) = this()
  def this(addr: Buffer) = this()
}

