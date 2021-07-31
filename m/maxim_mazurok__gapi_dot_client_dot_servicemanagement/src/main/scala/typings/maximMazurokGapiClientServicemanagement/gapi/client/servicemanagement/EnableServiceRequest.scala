package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableServiceRequest extends StObject {
  
  /**
    * Required. The identity of consumer resource which service enablement will be applied to. The Google Service Management implementation accepts the following forms: - "project:" Note:
    * this is made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.undefined
}
object EnableServiceRequest {
  
  @scala.inline
  def apply(): EnableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableServiceRequest]
  }
  
  @scala.inline
  implicit class EnableServiceRequestMutableBuilder[Self <: EnableServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
  }
}
