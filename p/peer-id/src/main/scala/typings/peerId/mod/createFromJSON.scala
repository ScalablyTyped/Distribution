package typings.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromJSON")
@js.native
object createFromJSON extends js.Object {
  
  /**
    * Create PeerId from PeerId JSON formatted object.
    * @see {@link PeerId#toJSON}
    * @param json PeerId in JSON format.
    */
  def apply(json: JSONPeerId): js.Promise[PeerId] = js.native
}
