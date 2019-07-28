package typings.modesl.modeslMod

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("modesl", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(opts: js.Any) = this()
  def this(opts: js.Any, readycb: js.Function0[Unit]) = this()
  def close(callback: js.Any): Unit = js.native
}

