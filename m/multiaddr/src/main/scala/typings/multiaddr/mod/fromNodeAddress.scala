package typings.multiaddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multiaddr", "fromNodeAddress")
@js.native
object fromNodeAddress extends js.Object {
  
  /**
    * Creates a Multiaddr from a node-friendly address object
    */
  def apply(addr: NodeAddress, transport: String): Multiaddr = js.native
}
