package typings.plugapi.plugapiMod.EventNs

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
    val __obj = js.Dynamic.literal(chatID = chatID, from = from, fromID = fromID, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Emote]
  }
}

