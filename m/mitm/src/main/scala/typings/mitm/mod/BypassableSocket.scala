package typings.mitm.mod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BypassableSocket extends Socket {
  def bypass(): Unit = js.native
}

