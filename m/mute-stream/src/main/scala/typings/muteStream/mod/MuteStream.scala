package typings.muteStream.mod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuteStream extends Duplex {
  var isTTY: Boolean = js.native
  def mute(): Unit = js.native
  def unmute(): Unit = js.native
}

