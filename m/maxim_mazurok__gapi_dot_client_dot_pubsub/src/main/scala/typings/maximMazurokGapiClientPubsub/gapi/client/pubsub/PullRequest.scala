package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequest extends StObject {
  
  /** Required. The maximum number of messages to return for this request. Must be a positive integer. The Pub/Sub system may return fewer than the number specified. */
  var maxMessages: js.UndefOr[Double] = js.native
  
  /**
    * Optional. If this field set to true, the system will respond immediately even if it there are no messages available to return in the `Pull` response. Otherwise, the system may wait
    * (for a bounded amount of time) until at least one message is available, rather than returning no messages. Warning: setting this field to `true` is discouraged because it adversely
    * impacts the performance of `Pull` operations. We recommend that users do not set this field.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
}
object PullRequest {
  
  @scala.inline
  def apply(): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequest]
  }
  
  @scala.inline
  implicit class PullRequestMutableBuilder[Self <: PullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    @scala.inline
    def setReturnImmediately(value: Boolean): Self = StObject.set(x, "returnImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnImmediatelyUndefined: Self = StObject.set(x, "returnImmediately", js.undefined)
  }
}
