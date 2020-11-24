package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientEventRequest extends js.Object {
  
  /** Required. Events issued when end user interacts with customer's application that uses Cloud Talent Solution. */
  var clientEvent: js.UndefOr[ClientEvent] = js.native
}
object CreateClientEventRequest {
  
  @scala.inline
  def apply(): CreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientEventRequest]
  }
  
  @scala.inline
  implicit class CreateClientEventRequestOps[Self <: CreateClientEventRequest] (val x: Self) extends AnyVal {
    
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
    def setClientEvent(value: ClientEvent): Self = this.set("clientEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientEvent: Self = this.set("clientEvent", js.undefined)
  }
}
