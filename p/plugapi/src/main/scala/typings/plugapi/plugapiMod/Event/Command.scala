package typings.plugapi.plugapiMod.Event

import typings.plugapi.plugapiMod.RawChatMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends Chat {
  var args: js.Array[String]
  var command: String
  def havePermission(args: js.Any*): Boolean
  def isFrom(args: js.Any*): Boolean
  def respond(args: js.Any*): js.Any
  def respondTimeout(args: js.Any*): js.Any
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[String],
    command: String,
    from: typings.plugapi.plugapiMod.User.User,
    havePermission: /* repeated */ js.Any => Boolean,
    id: String,
    isFrom: /* repeated */ js.Any => Boolean,
    mentions: js.Array[_],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    respond: /* repeated */ js.Any => js.Any,
    respondTimeout: /* repeated */ js.Any => js.Any,
    `type`: String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], havePermission = js.Any.fromFunction1(havePermission), id = id.asInstanceOf[js.Any], isFrom = js.Any.fromFunction1(isFrom), mentions = mentions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], respond = js.Any.fromFunction1(respond), respondTimeout = js.Any.fromFunction1(respondTimeout))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

