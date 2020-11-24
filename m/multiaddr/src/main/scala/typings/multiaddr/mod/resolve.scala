package typings.multiaddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multiaddr", "resolve")
@js.native
object resolve extends js.Object {
  
  /**
    * Returns an array of multiaddrs, by resolving the multiaddr that is a name
    */
  def apply(addr: Multiaddr): js.Promise[js.Array[Multiaddr]] = js.native
}
