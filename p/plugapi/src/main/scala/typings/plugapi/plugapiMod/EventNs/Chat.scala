package typings.plugapi.plugapiMod.EventNs

import typings.plugapi.plugapiMod.RawChatMessage
import typings.plugapi.plugapiMod.UserNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chat extends js.Object {
  var from: User
  var id: String
  var mentions: js.Array[_]
  var message: String
  var muted: Boolean
  var raw: RawChatMessage
  var `type`: String
}

object Chat {
  @scala.inline
  def apply(
    from: User,
    id: String,
    mentions: js.Array[_],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    `type`: String
  ): Chat = {
    val __obj = js.Dynamic.literal(from = from, id = id, mentions = mentions, message = message, muted = muted, raw = raw)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Chat]
  }
}

