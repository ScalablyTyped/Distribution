package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatViewpoint extends StObject {
  
  // Indicates whether the chat is hidden for the current user.
  var isHidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Represents the dateTime up until which the current user has read chatMessages in a specific chat.
  var lastMessageReadDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChatViewpoint {
  
  inline def apply(): ChatViewpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatViewpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatViewpoint] (val x: Self) extends AnyVal {
    
    inline def setIsHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setIsHiddenNull: Self = StObject.set(x, "isHidden", null)
    
    inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    inline def setLastMessageReadDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastMessageReadDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastMessageReadDateTimeNull: Self = StObject.set(x, "lastMessageReadDateTime", null)
    
    inline def setLastMessageReadDateTimeUndefined: Self = StObject.set(x, "lastMessageReadDateTime", js.undefined)
  }
}
