package typings.plugapi.mod.Event

import typings.plugapi.mod.RawChatMessage
import typings.plugapi.mod.User.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command
  extends StObject
     with Chat {
  
  var args: js.Array[String]
  
  var command: String
  
  def havePermission(args: js.Any*): Boolean
  
  def isFrom(args: js.Any*): Boolean
  
  def respond(args: js.Any*): js.Any
  
  def respondTimeout(args: js.Any*): js.Any
}
object Command {
  
  inline def apply(
    args: js.Array[String],
    command: String,
    from: User,
    havePermission: /* repeated */ js.Any => Boolean,
    id: String,
    isFrom: /* repeated */ js.Any => Boolean,
    mentions: js.Array[js.Any],
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
  
  extension [Self <: Command](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setHavePermission(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "havePermission", js.Any.fromFunction1(value))
    
    inline def setIsFrom(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "isFrom", js.Any.fromFunction1(value))
    
    inline def setRespond(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "respond", js.Any.fromFunction1(value))
    
    inline def setRespondTimeout(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "respondTimeout", js.Any.fromFunction1(value))
  }
}
