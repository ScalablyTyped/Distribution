package typings.mqttPacket.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt-packet", "writeToStream")
@js.native
object writeToStream extends js.Object {
  var cacheNumbers: Boolean = js.native
  def apply(`object`: Packet, stream: WritableStream): Unit = js.native
  def apply(`object`: Packet, stream: WritableStream, opts: js.Object): Unit = js.native
}

