package typings
package modeslLib.modeslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("modesl", "Server")
@js.native
class Server protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(opts: js.Any) = this()
  def this(opts: js.Any, readycb: js.Function0[scala.Unit]) = this()
  def close(callback: js.Any): scala.Unit = js.native
}

