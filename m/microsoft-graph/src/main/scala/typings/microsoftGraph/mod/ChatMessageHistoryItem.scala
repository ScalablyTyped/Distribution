package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageHistoryItem extends StObject {
  
  var actions: js.UndefOr[ChatMessageActions] = js.undefined
  
  var modifiedDateTime: js.UndefOr[String] = js.undefined
  
  var reaction: js.UndefOr[NullableOption[ChatMessageReaction]] = js.undefined
}
object ChatMessageHistoryItem {
  
  inline def apply(): ChatMessageHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageHistoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageHistoryItem] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ChatMessageActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setModifiedDateTime(value: String): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setReaction(value: NullableOption[ChatMessageReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionNull: Self = StObject.set(x, "reaction", null)
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
  }
}
