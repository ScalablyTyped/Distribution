package typings.node.clusterMod

import typings.node.nodeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_listening extends js.Object {
  def apply(event: listening, worker: Worker_, address: Address): Boolean = js.native
}

