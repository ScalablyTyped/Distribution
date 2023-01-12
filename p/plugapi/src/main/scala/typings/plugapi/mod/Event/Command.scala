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
  
  def havePermission(args: Any*): Boolean
  
  def isFrom(args: Any*): Boolean
  
  def respond(args: Any*): Any
  
  def respondTimeout(args: Any*): Any
}
object Command {
  
  inline def apply(
    args: js.Array[String],
    command: String,
    from: User,
    havePermission: /* repeated */ Any => Boolean,
    id: String,
    isFrom: /* repeated */ Any => Boolean,
    mentions: js.Array[Any],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    respond: /* repeated */ Any => Any,
    respondTimeout: /* repeated */ Any => Any,
    `type`: String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], havePermission = js.Any.fromFunction1(havePermission), id = id.asInstanceOf[js.Any], isFrom = js.Any.fromFunction1(isFrom), mentions = mentions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], respond = js.Any.fromFunction1(respond), respondTimeout = js.Any.fromFunction1(respondTimeout))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setHavePermission(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "havePermission", js.Any.fromFunction1(value))
    
    inline def setIsFrom(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "isFrom", js.Any.fromFunction1(value))
    
    inline def setRespond(value: /* repeated */ Any => Any): Self = StObject.set(x, "respond", js.Any.fromFunction1(value))
    
    inline def setRespondTimeout(value: /* repeated */ Any => Any): Self = StObject.set(x, "respondTimeout", js.Any.fromFunction1(value))
  }
}
