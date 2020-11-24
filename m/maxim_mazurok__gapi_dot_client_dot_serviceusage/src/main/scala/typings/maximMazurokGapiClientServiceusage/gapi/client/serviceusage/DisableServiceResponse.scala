package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableServiceResponse extends js.Object {
  
  /** The new state of the service after disabling. */
  var service: js.UndefOr[GoogleApiServiceusageV1Service] = js.native
}
object DisableServiceResponse {
  
  @scala.inline
  def apply(): DisableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableServiceResponse]
  }
  
  @scala.inline
  implicit class DisableServiceResponseOps[Self <: DisableServiceResponse] (val x: Self) extends AnyVal {
    
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
    def setService(value: GoogleApiServiceusageV1Service): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
