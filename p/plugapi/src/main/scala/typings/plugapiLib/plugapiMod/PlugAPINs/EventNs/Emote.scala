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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("chatID")(chatID)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("fromID")(fromID)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Emote]
  }
}

