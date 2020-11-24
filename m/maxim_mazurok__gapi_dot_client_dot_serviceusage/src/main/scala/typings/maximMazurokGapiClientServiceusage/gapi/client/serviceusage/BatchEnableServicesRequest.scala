package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchEnableServicesRequest extends js.Object {
  
  /**
    * The identifiers of the services to enable on the project. A valid identifier would be: serviceusage.googleapis.com Enabling services requires that each service is public or is
    * shared with the user enabling the service. A single request can enable a maximum of 20 services at a time. If more than 20 services are specified, the request will fail, and no
    * state changes will occur.
    */
  var serviceIds: js.UndefOr[js.Array[String]] = js.native
}
object BatchEnableServicesRequest {
  
  @scala.inline
  def apply(): BatchEnableServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchEnableServicesRequest]
  }
  
  @scala.inline
  implicit class BatchEnableServicesRequestOps[Self <: BatchEnableServicesRequest] (val x: Self) extends AnyVal {
    
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
    def setServiceIdsVarargs(value: String*): Self = this.set("serviceIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceIds(value: js.Array[String]): Self = this.set("serviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIds: Self = this.set("serviceIds", js.undefined)
  }
}
