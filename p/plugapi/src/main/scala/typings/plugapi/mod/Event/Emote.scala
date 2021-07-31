package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emote extends StObject {
  
  var chatID: String
  
  var from: String
  
  var fromID: String
  
  var message: String
  
  var `type`: String
}
object Emote {
  
  @scala.inline
  def apply(chatID: String, from: String, fromID: String, message: String, `type`: String): Emote = {
    val __obj = js.Dynamic.literal(chatID = chatID.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fromID = fromID.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emote]
  }
  
  @scala.inline
  implicit class EmoteMutableBuilder[Self <: Emote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChatID(value: String): Self = StObject.set(x, "chatID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromID(value: String): Self = StObject.set(x, "fromID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
