package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMessagesResponse extends StObject {
  
  /** List of messages. Note that each message resource contains only an `id` and a `threadId`. Additional message details can be fetched using the messages.get method. */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  
  /** Token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
}
object ListMessagesResponse {
  
  inline def apply(): ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMessagesResponse]
  }
  
  extension [Self <: ListMessagesResponse](x: Self) {
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
  }
}
