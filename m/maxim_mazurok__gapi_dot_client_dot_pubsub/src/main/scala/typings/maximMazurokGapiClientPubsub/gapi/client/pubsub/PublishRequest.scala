package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishRequest extends StObject {
  
  /** Required. The messages to publish. */
  var messages: js.UndefOr[js.Array[PubsubMessage]] = js.undefined
}
object PublishRequest {
  
  inline def apply(): PublishRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishRequest] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[PubsubMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: PubsubMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
