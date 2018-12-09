package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Connection")
@js.native
class Connection protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: ConnectionOptions) = this()
  def connect(): js.Promise[scala.Unit] = js.native
  def end(): js.Promise[scala.Unit] = js.native
}

