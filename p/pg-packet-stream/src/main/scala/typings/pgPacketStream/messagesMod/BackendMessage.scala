package typings.pgPacketStream.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendMessage extends js.Object {
  var length: Double
  var name: MessageName
}

object BackendMessage {
  @scala.inline
  def apply(length: Double, name: MessageName): BackendMessage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendMessage]
  }
}

