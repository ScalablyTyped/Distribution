package typings.orientjs.orientjsMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "OCluster")
@js.native
class OCluster () extends EventEmitter {
  def this(config: OClusterConfig) = this()
  var servers: js.Array[OServerNode] = js.native
  def acquireFrom(selection: js.Function1[/* cluster */ this.type, OServerNode]): js.Promise[OServerNode] = js.native
  def close(): js.Promise[Unit] = js.native
  def connect(): js.Promise[OServerNode] = js.native
}

