package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thread extends StObject {
  
  /** The ID of the last history record that modified this thread. */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** The unique ID of the thread. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The list of messages in the thread. */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  
  /** A short part of the message text. */
  var snippet: js.UndefOr[String] = js.undefined
}
object Thread {
  
  inline def apply(): Thread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thread]
  }
  
  extension [Self <: Thread](x: Self) {
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
