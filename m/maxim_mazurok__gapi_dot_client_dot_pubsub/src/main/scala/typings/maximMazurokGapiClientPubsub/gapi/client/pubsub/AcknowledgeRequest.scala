package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeRequest extends StObject {
  
  /** Required. The acknowledgment ID for the messages being acknowledged that was returned by the Pub/Sub system in the `Pull` response. Must not be empty. */
  var ackIds: js.UndefOr[js.Array[String]] = js.undefined
}
object AcknowledgeRequest {
  
  @scala.inline
  def apply(): AcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeRequest]
  }
  
  @scala.inline
  implicit class AcknowledgeRequestMutableBuilder[Self <: AcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
  }
}
