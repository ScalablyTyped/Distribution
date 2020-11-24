package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpoint extends js.Object {
  
  /** The IP address of this network endpoint. */
  var ipAddress: js.UndefOr[String] = js.native
  
  /** The port of this network endpoint. */
  var port: js.UndefOr[Double] = js.native
}
object NetworkEndpoint {
  
  @scala.inline
  def apply(): NetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpoint]
  }
  
  @scala.inline
  implicit class NetworkEndpointOps[Self <: NetworkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
