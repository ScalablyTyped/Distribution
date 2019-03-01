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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("havePermission")(havePermission)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isFrom")(isFrom)
    __obj.updateDynamic("mentions")(mentions)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("muted")(muted)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("respond")(respond)
    __obj.updateDynamic("respondTimeout")(respondTimeout)
    __obj.asInstanceOf[Command]
  }
}

