package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
  */
trait IDisplayChatParameters extends StObject {
  
  /**
    * The chat message that will be displayed
    */
  var message: String
}
object IDisplayChatParameters {
  
  inline def apply(message: String): IDisplayChatParameters = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayChatParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDisplayChatParameters] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
