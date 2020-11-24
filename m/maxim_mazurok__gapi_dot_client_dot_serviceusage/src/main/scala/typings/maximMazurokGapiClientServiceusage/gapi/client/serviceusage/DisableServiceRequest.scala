package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableServiceRequest extends js.Object {
  
  /** Defines the behavior for checking service usage when disabling a service. */
  var checkIfServiceHasUsage: js.UndefOr[String] = js.native
  
  /**
    * Indicates if services that are enabled and which depend on this service should also be disabled. If not set, an error will be generated if any enabled services depend on the service
    * to be disabled. When set, the service, and any enabled services that depend on it, will be disabled together.
    */
  var disableDependentServices: js.UndefOr[Boolean] = js.native
}
object DisableServiceRequest {
  
  @scala.inline
  def apply(): DisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableServiceRequest]
  }
  
  @scala.inline
  implicit class DisableServiceRequestOps[Self <: DisableServiceRequest] (val x: Self) extends AnyVal {
    
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
    def setCheckIfServiceHasUsage(value: String): Self = this.set("checkIfServiceHasUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckIfServiceHasUsage: Self = this.set("checkIfServiceHasUsage", js.undefined)
    
    @scala.inline
    def setDisableDependentServices(value: Boolean): Self = this.set("disableDependentServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDependentServices: Self = this.set("disableDependentServices", js.undefined)
  }
}
