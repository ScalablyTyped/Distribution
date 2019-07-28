package typings.plugapi.plugapiMod

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
    val __obj = js.Dynamic.literal(cid = cid, message = message, sub = sub, uid = uid, un = un)
  
    __obj.asInstanceOf[RawChatMessage]
  }
}

