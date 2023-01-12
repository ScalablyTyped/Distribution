package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullResponse extends StObject {
  
  /**
    * Received Pub/Sub messages. The list will be empty if there are no more messages available in the backlog. For JSON, the response can be entirely empty. The Pub/Sub system may return
    * fewer than the `maxMessages` requested even if there are more messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[ReceivedMessage]] = js.undefined
}
object PullResponse {
  
  inline def apply(): PullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PullResponse] (val x: Self) extends AnyVal {
    
    inline def setReceivedMessages(value: js.Array[ReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    inline def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    inline def setReceivedMessagesVarargs(value: ReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value*))
  }
}
