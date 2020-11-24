package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableServiceResponse extends js.Object {
  
  /** The new state of the service after enabling. */
  var service: js.UndefOr[GoogleApiServiceusageV1Service] = js.native
}
object EnableServiceResponse {
  
  @scala.inline
  def apply(): EnableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableServiceResponse]
  }
  
  @scala.inline
  implicit class EnableServiceResponseOps[Self <: EnableServiceResponse] (val x: Self) extends AnyVal {
    
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
