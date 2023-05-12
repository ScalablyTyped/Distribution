package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinnedChatMessageInfo
  extends StObject
     with Entity {
  
  // Represents details about the chat message that is pinned.
  var message: js.UndefOr[NullableOption[ChatMessage]] = js.undefined
}
object PinnedChatMessageInfo {
  
  inline def apply(): PinnedChatMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinnedChatMessageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinnedChatMessageInfo] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NullableOption[ChatMessage]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
