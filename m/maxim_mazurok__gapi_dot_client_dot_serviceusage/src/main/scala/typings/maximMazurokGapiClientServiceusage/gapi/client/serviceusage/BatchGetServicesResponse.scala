package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetServicesResponse extends js.Object {
  
  /** The requested Service states. */
  var services: js.UndefOr[js.Array[GoogleApiServiceusageV1Service]] = js.native
}
object BatchGetServicesResponse {
  
  @scala.inline
  def apply(): BatchGetServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetServicesResponse]
  }
  
  @scala.inline
  implicit class BatchGetServicesResponseOps[Self <: BatchGetServicesResponse] (val x: Self) extends AnyVal {
    
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
    def setServicesVarargs(value: GoogleApiServiceusageV1Service*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[GoogleApiServiceusageV1Service]): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
}
