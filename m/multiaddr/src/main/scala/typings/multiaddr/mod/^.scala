package typings.multiaddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("multiaddr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a [multiaddr](https://github.com/multiformats/multiaddr) from
    * a Uint8Array, String or another Multiaddr instance
    * public key.
    * @param addr - If String or Uint8Array, needs to adhere
    * to the address format of a [multiaddr](https://github.com/multiformats/multiaddr#string-format)
    */
  def apply(): Multiaddr = js.native
  def apply(input: MultiaddrInput): Multiaddr = js.native
}
