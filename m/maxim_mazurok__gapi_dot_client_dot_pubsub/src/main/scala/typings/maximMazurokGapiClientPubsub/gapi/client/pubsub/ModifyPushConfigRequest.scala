package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyPushConfigRequest extends StObject {
  
  /**
    * Required. The push configuration for future deliveries. An empty `pushConfig` indicates that the Pub/Sub system should stop pushing messages from the given subscription and allow
    * messages to be pulled and acknowledged - effectively pausing the subscription if `Pull` or `StreamingPull` is not called.
    */
  var pushConfig: js.UndefOr[PushConfig] = js.native
}
object ModifyPushConfigRequest {
  
  @scala.inline
  def apply(): ModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyPushConfigRequest]
  }
  
  @scala.inline
  implicit class ModifyPushConfigRequestMutableBuilder[Self <: ModifyPushConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushConfig(value: PushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
  }
}
