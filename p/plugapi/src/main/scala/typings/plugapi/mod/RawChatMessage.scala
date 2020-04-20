package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawChatMessage extends js.Object {
  var cid: String
  var message: String
  var sub: Double
  var uid: Double
  var un: String
}

object RawChatMessage {
  @scala.inline
  def apply(cid: String, message: String, sub: Double, uid: Double, un: String): RawChatMessage = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawChatMessage]
  }
}

