package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatusResponse extends js.Object {
  
  /** Client configs for the clients specified in the ClientStatusRequest. */
  var config: js.UndefOr[js.Array[ClientConfig]] = js.native
}
object ClientStatusResponse {
  
  @scala.inline
  def apply(): ClientStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStatusResponse]
  }
  
  @scala.inline
  implicit class ClientStatusResponseOps[Self <: ClientStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigVarargs(value: ClientConfig*): Self = this.set("config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: js.Array[ClientConfig]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
