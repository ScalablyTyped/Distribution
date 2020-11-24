package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateConsumerConfigRequest extends js.Object {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is a project number, as in
    * '12345' {network} is network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  
  /** NETWORK_NOT_IN_CONSUMERS_PROJECT, NETWORK_NOT_IN_CONSUMERS_HOST_PROJECT, and HOST_PROJECT_NOT_FOUND are done when consumer_project is provided. */
  var consumerProject: js.UndefOr[ConsumerProject] = js.native
  
  /** RANGES_EXHAUSTED, RANGES_EXHAUSTED, and RANGES_DELETED_LATER are done when range_reservation is provided. */
  var rangeReservation: js.UndefOr[RangeReservation] = js.native
  
  /**
    * The validations will be performed in the order listed in the ValidationError enum. The first failure will return. If a validation is not requested, then the next one will be
    * performed. SERVICE_NETWORKING_NOT_ENABLED and NETWORK_NOT_PEERED checks are performed for all requests where validation is requested. NETWORK_NOT_FOUND and NETWORK_DISCONNECTED
    * checks are done for requests that have validate_network set to true.
    */
  var validateNetwork: js.UndefOr[Boolean] = js.native
}
object ValidateConsumerConfigRequest {
  
  @scala.inline
  def apply(): ValidateConsumerConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateConsumerConfigRequest]
  }
  
  @scala.inline
  implicit class ValidateConsumerConfigRequestOps[Self <: ValidateConsumerConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setConsumerNetwork(value: String): Self = this.set("consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerNetwork: Self = this.set("consumerNetwork", js.undefined)
    
    @scala.inline
    def setConsumerProject(value: ConsumerProject): Self = this.set("consumerProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerProject: Self = this.set("consumerProject", js.undefined)
    
    @scala.inline
    def setRangeReservation(value: RangeReservation): Self = this.set("rangeReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeReservation: Self = this.set("rangeReservation", js.undefined)
    
    @scala.inline
    def setValidateNetwork(value: Boolean): Self = this.set("validateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateNetwork: Self = this.set("validateNetwork", js.undefined)
  }
}
