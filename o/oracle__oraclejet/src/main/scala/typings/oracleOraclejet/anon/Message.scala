package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message
  extends /* key */ StringDictionary[js.Any] {
  
  var message: typings.oracleOraclejet.ojmessageMod.ojMessage.Message = js.native
}
object Message {
  
  @scala.inline
  def apply(message: typings.oracleOraclejet.ojmessageMod.ojMessage.Message): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: typings.oracleOraclejet.ojmessageMod.ojMessage.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
