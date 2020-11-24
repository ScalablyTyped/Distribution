package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveServiceRequest extends js.Object {
  
  /**
    * Optional. The filter applied to the endpoints of the resolved service. General filter string syntax: () can be "name" or "metadata." for map field. can be "<, >, <=, >=, !=, =, :".
    * Of which ":" means HAS and is roughly the same as "=". must be the same data type as the field. can be "AND, OR, NOT". Examples of valid filters: * "metadata.owner" returns
    * Endpoints that have a label with the key "owner", this is the same as "metadata:owner" * "metadata.protocol=gRPC" returns Endpoints that have key/value "protocol=gRPC" *
    * "metadata.owner!=sd AND metadata.foo=bar" returns Endpoints that have "owner" field in metadata with a value that is not "sd" AND have the key/value foo=bar.
    */
  var endpointFilter: js.UndefOr[String] = js.native
  
  /**
    * Optional. The maximum number of endpoints to return. Defaults to 25. Maximum is 100. If a value less than one is specified, the Default is used. If a value greater than the Maximum
    * is specified, the Maximum is used.
    */
  var maxEndpoints: js.UndefOr[Double] = js.native
}
object ResolveServiceRequest {
  
  @scala.inline
  def apply(): ResolveServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveServiceRequest]
  }
  
  @scala.inline
  implicit class ResolveServiceRequestOps[Self <: ResolveServiceRequest] (val x: Self) extends AnyVal {
    
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
    def setEndpointFilter(value: String): Self = this.set("endpointFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointFilter: Self = this.set("endpointFilter", js.undefined)
    
    @scala.inline
    def setMaxEndpoints(value: Double): Self = this.set("maxEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEndpoints: Self = this.set("maxEndpoints", js.undefined)
  }
}
