package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emote extends js.Object {
  var chatID: java.lang.String
  var from: java.lang.String
  var fromID: java.lang.String
  var message: java.lang.String
  var `type`: java.lang.String
}

object Emote {
  @scala.inline
  def apply(
    chatID: java.lang.String,
    from: java.lang.String,
    fromID: java.lang.String,
    message: java.lang.String,
    `type`: java.lang.String
  ): Emote = {
    val __obj = js.Dynamic.literal(chatID = chatID, from = from, fromID = fromID, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Emote]
  }
}

