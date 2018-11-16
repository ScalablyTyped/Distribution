package typings
package nodeLib.ttyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "WriteStream")
@js.native
class WriteStream ()
  extends nodeLib.netMod.Socket {
  var columns: scala.Double = js.native
  var isTTY: scala.Boolean = js.native
  var rows: scala.Double = js.native
}

