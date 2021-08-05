package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConsumerConfigRequest extends StObject {
  
  /** Required. The updated peering config. */
  var consumerConfig: js.UndefOr[ConsumerConfig] = js.undefined
}
object UpdateConsumerConfigRequest {
  
  inline def apply(): UpdateConsumerConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConsumerConfigRequest]
  }
  
  extension [Self <: UpdateConsumerConfigRequest](x: Self) {
    
    inline def setConsumerConfig(value: ConsumerConfig): Self = StObject.set(x, "consumerConfig", value.asInstanceOf[js.Any])
    
    inline def setConsumerConfigUndefined: Self = StObject.set(x, "consumerConfig", js.undefined)
  }
}
