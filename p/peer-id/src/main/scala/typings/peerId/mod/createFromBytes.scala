package typings.peerId.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromBytes")
@js.native
object createFromBytes extends js.Object {
  
  /**
    * Create PeerId from raw bytes.
    * @param buf The raw bytes.
    */
  def apply(buf: Uint8Array): PeerId = js.native
}
