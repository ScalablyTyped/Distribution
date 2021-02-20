package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConsumerConfigRequest extends StObject {
  
  /** Required. The updated peering config. */
  var consumerConfig: js.UndefOr[ConsumerConfig] = js.native
}
object UpdateConsumerConfigRequest {
  
  @scala.inline
  def apply(): UpdateConsumerConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConsumerConfigRequest]
  }
  
  @scala.inline
  implicit class UpdateConsumerConfigRequestMutableBuilder[Self <: UpdateConsumerConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerConfig(value: ConsumerConfig): Self = StObject.set(x, "consumerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerConfigUndefined: Self = StObject.set(x, "consumerConfig", js.undefined)
  }
}
