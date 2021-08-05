package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  /** The mailbox sequence ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Labels added to messages in this history record. */
  var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.undefined
  
  /** Labels removed from messages in this history record. */
  var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.undefined
  
  /**
    * List of messages changed in this history record. The fields for specific change types, such as `messagesAdded` may duplicate messages in this field. We recommend using the specific
    * change-type fields instead of this.
    */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  
  /** Messages added to the mailbox in this history record. */
  var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.undefined
  
  /** Messages deleted (not Trashed) from the mailbox in this history record. */
  var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.undefined
}
object History {
  
  inline def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  
  extension [Self <: History](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabelsAdded(value: js.Array[HistoryLabelAdded]): Self = StObject.set(x, "labelsAdded", value.asInstanceOf[js.Any])
    
    inline def setLabelsAddedUndefined: Self = StObject.set(x, "labelsAdded", js.undefined)
    
    inline def setLabelsAddedVarargs(value: HistoryLabelAdded*): Self = StObject.set(x, "labelsAdded", js.Array(value :_*))
    
    inline def setLabelsRemoved(value: js.Array[HistoryLabelRemoved]): Self = StObject.set(x, "labelsRemoved", value.asInstanceOf[js.Any])
    
    inline def setLabelsRemovedUndefined: Self = StObject.set(x, "labelsRemoved", js.undefined)
    
    inline def setLabelsRemovedVarargs(value: HistoryLabelRemoved*): Self = StObject.set(x, "labelsRemoved", js.Array(value :_*))
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesAdded(value: js.Array[HistoryMessageAdded]): Self = StObject.set(x, "messagesAdded", value.asInstanceOf[js.Any])
    
    inline def setMessagesAddedUndefined: Self = StObject.set(x, "messagesAdded", js.undefined)
    
    inline def setMessagesAddedVarargs(value: HistoryMessageAdded*): Self = StObject.set(x, "messagesAdded", js.Array(value :_*))
    
    inline def setMessagesDeleted(value: js.Array[HistoryMessageDeleted]): Self = StObject.set(x, "messagesDeleted", value.asInstanceOf[js.Any])
    
    inline def setMessagesDeletedUndefined: Self = StObject.set(x, "messagesDeleted", js.undefined)
    
    inline def setMessagesDeletedVarargs(value: HistoryMessageDeleted*): Self = StObject.set(x, "messagesDeleted", js.Array(value :_*))
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
