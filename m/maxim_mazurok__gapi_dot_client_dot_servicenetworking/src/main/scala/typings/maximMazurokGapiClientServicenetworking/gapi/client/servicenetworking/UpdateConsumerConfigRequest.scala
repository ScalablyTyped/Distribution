package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConsumerConfigRequest extends js.Object {
  
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
  implicit class UpdateConsumerConfigRequestOps[Self <: UpdateConsumerConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsumerConfig(value: ConsumerConfig): Self = this.set("consumerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerConfig: Self = this.set("consumerConfig", js.undefined)
  }
}
