package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveServiceResponse extends js.Object {
  
  var service: js.UndefOr[Service] = js.native
}
object ResolveServiceResponse {
  
  @scala.inline
  def apply(): ResolveServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveServiceResponse]
  }
  
  @scala.inline
  implicit class ResolveServiceResponseOps[Self <: ResolveServiceResponse] (val x: Self) extends AnyVal {
    
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
    def setService(value: Service): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
