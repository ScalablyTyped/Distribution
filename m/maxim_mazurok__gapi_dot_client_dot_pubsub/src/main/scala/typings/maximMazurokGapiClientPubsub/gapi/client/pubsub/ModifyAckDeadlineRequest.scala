package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyAckDeadlineRequest extends StObject {
  
  /**
    * Required. The new ack deadline with respect to the time this request was sent to the Pub/Sub system. For example, if the value is 10, the new ack deadline will expire 10 seconds
    * after the `ModifyAckDeadline` call was made. Specifying zero might immediately make the message available for delivery to another subscriber client. This typically results in an
    * increase in the rate of message redeliveries (that is, duplicates). The minimum deadline you can specify is 0 seconds. The maximum deadline you can specify is 600 seconds (10
    * minutes).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  
  /** Required. List of acknowledgment IDs. */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}
object ModifyAckDeadlineRequest {
  
  @scala.inline
  def apply(): ModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAckDeadlineRequest]
  }
  
  @scala.inline
  implicit class ModifyAckDeadlineRequestMutableBuilder[Self <: ModifyAckDeadlineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value :_*))
  }
}
