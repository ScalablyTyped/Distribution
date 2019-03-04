package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

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
    from: plugapiLib.plugapiMod.PlugAPINs.UserNs.User,
    havePermission: js.Function1[/* repeated */ js.Any, scala.Boolean],
    id: java.lang.String,
    isFrom: js.Function1[/* repeated */ js.Any, scala.Boolean],
    mentions: js.Array[_],
    message: java.lang.String,
    muted: scala.Boolean,
    raw: plugapiLib.plugapiMod.PlugAPINs.RawChatMessage,
    respond: js.Function1[/* repeated */ js.Any, js.Any],
    respondTimeout: js.Function1[/* repeated */ js.Any, js.Any],
    `type`: java.lang.String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args, command = command, from = from, havePermission = havePermission, id = id, isFrom = isFrom, mentions = mentions, message = message, muted = muted, raw = raw, respond = respond, respondTimeout = respondTimeout)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Command]
  }
}

