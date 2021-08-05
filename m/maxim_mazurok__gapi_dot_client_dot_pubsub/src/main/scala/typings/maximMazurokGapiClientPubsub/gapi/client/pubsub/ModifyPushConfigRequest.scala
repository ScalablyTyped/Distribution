package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyPushConfigRequest extends StObject {
  
  /**
    * Required. The push configuration for future deliveries. An empty `pushConfig` indicates that the Pub/Sub system should stop pushing messages from the given subscription and allow
    * messages to be pulled and acknowledged - effectively pausing the subscription if `Pull` or `StreamingPull` is not called.
    */
  var pushConfig: js.UndefOr[PushConfig] = js.undefined
}
object ModifyPushConfigRequest {
  
  inline def apply(): ModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyPushConfigRequest]
  }
  
  extension [Self <: ModifyPushConfigRequest](x: Self) {
    
    inline def setPushConfig(value: PushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    inline def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
  }
}
