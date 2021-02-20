package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateConsumerConfigRequest extends StObject {
  
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
  implicit class ValidateConsumerConfigRequestMutableBuilder[Self <: ValidateConsumerConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    @scala.inline
    def setConsumerProject(value: ConsumerProject): Self = StObject.set(x, "consumerProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerProjectUndefined: Self = StObject.set(x, "consumerProject", js.undefined)
    
    @scala.inline
    def setRangeReservation(value: RangeReservation): Self = StObject.set(x, "rangeReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeReservationUndefined: Self = StObject.set(x, "rangeReservation", js.undefined)
    
    @scala.inline
    def setValidateNetwork(value: Boolean): Self = StObject.set(x, "validateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateNetworkUndefined: Self = StObject.set(x, "validateNetwork", js.undefined)
  }
}
