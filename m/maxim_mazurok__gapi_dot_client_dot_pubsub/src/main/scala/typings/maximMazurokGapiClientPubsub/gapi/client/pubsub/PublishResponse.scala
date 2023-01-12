package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishResponse extends StObject {
  
  /** The server-assigned ID of each published message, in the same order as the messages in the request. IDs are guaranteed to be unique within the topic. */
  var messageIds: js.UndefOr[js.Array[String]] = js.undefined
}
object PublishResponse {
  
  inline def apply(): PublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishResponse] (val x: Self) extends AnyVal {
    
    inline def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    inline def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    inline def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value*))
  }
}
