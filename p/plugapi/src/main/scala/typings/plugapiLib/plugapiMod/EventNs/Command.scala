package typings
package plugapiLib.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends Chat {
  var args: js.Array[java.lang.String]
  var command: java.lang.String
  def havePermission(args: js.Any*): scala.Boolean
  def isFrom(args: js.Any*): scala.Boolean
  def respond(args: js.Any*): js.Any
  def respondTimeout(args: js.Any*): js.Any
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    command: java.lang.String,
    from: plugapiLib.plugapiMod.UserNs.User,
    havePermission: /* repeated */ js.Any => scala.Boolean,
    id: java.lang.String,
    isFrom: /* repeated */ js.Any => scala.Boolean,
    mentions: js.Array[_],
    message: java.lang.String,
    muted: scala.Boolean,
    raw: plugapiLib.plugapiMod.RawChatMessage,
    respond: /* repeated */ js.Any => js.Any,
    respondTimeout: /* repeated */ js.Any => js.Any,
    `type`: java.lang.String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args, command = command, from = from, havePermission = js.Any.fromFunction1(havePermission), id = id, isFrom = js.Any.fromFunction1(isFrom), mentions = mentions, message = message, muted = muted, raw = raw, respond = js.Any.fromFunction1(respond), respondTimeout = js.Any.fromFunction1(respondTimeout))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Command]
  }
}

