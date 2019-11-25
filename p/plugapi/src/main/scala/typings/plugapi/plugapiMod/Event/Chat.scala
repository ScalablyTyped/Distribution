package typings.plugapi.plugapiMod.Event

import typings.plugapi.plugapiMod.RawChatMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chat extends js.Object {
  var from: typings.plugapi.plugapiMod.User.User
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
    from: typings.plugapi.plugapiMod.User.User,
    id: String,
    mentions: js.Array[_],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    `type`: String
  ): Chat = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chat]
  }
}

