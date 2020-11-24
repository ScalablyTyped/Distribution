package typings.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "create")
@js.native
object create extends js.Object {
  
  /**
    * Create a new PeerId.
    * @param opts Options.
    */
  def apply(): js.Promise[PeerId] = js.native
  def apply(opts: CreateOptions): js.Promise[PeerId] = js.native
}
