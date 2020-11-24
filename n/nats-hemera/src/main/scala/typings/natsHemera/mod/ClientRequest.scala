package typings.natsHemera.mod

import typings.natsHemera.anon.ExpectedMessages
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequest extends js.Object {
  
  var error: Error = js.native
  
  var pattern: ClientPattern = js.native
  
  var payload: HemeraMessagePayload = js.native
  
  var transport: ExpectedMessages = js.native
}
object ClientRequest {
  
  @scala.inline
  def apply(error: Error, pattern: ClientPattern, payload: HemeraMessagePayload, transport: ExpectedMessages): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  
  @scala.inline
  implicit class ClientRequestOps[Self <: ClientRequest] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: ClientPattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: HemeraMessagePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: ExpectedMessages): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
}
