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
  
  @scala.inline
  def apply(): PullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullResponse]
  }
  
  @scala.inline
  implicit class PullResponseMutableBuilder[Self <: PullResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceivedMessages(value: js.Array[ReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    @scala.inline
    def setReceivedMessagesVarargs(value: ReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value :_*))
  }
}
