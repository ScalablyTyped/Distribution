package typings.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "addListener")
@js.native
object addListener extends js.Object {
  /**
    * events.EventEmitter
    *   1. disconnect
    *   2. exit
    *   3. fork
    *   4. listening
    *   5. message
    *   6. online
    *   7. setup
    */
  def apply(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
}

