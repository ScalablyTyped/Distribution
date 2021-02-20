package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishResponse extends StObject {
  
  /** The server-assigned ID of each published message, in the same order as the messages in the request. IDs are guaranteed to be unique within the topic. */
  var messageIds: js.UndefOr[js.Array[String]] = js.native
}
object PublishResponse {
  
  @scala.inline
  def apply(): PublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishResponse]
  }
  
  @scala.inline
  implicit class PublishResponseMutableBuilder[Self <: PublishResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    @scala.inline
    def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value :_*))
  }
}
