package typings.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromB58String")
@js.native
object createFromB58String extends js.Object {
  
  /**
    * Create PeerId from base58-encoded string.
    * @param str The base58-encoded string.
    */
  def apply(str: String): PeerId = js.native
}
