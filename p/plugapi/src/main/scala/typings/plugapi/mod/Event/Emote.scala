package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emote extends js.Object {
  var chatID: String
  var from: String
  var fromID: String
  var message: String
  var `type`: String
}

object Emote {
  @scala.inline
  def apply(chatID: String, from: String, fromID: String, message: String, `type`: String): Emote = {
    val __obj = js.Dynamic.literal(chatID = chatID.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fromID = fromID.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emote]
  }
}

