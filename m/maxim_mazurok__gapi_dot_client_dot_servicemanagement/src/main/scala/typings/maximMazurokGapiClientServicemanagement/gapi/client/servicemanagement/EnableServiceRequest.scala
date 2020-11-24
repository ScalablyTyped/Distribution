package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableServiceRequest extends js.Object {
  
  /**
    * Required. The identity of consumer resource which service enablement will be applied to. The Google Service Management implementation accepts the following forms: - "project:" Note:
    * this is made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.native
}
object EnableServiceRequest {
  
  @scala.inline
  def apply(): EnableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableServiceRequest]
  }
  
  @scala.inline
  implicit class EnableServiceRequestOps[Self <: EnableServiceRequest] (val x: Self) extends AnyVal {
    
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
    def setConsumerId(value: String): Self = this.set("consumerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerId: Self = this.set("consumerId", js.undefined)
  }
}
