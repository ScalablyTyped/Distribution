package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TCPSocketAction extends js.Object {
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Optional: Host name to connect to, defaults to the pod IP. */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Cloud Run fully managed: not supported Cloud Run for Anthos: supported Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
    * IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
    */
  var port: js.UndefOr[Double] = js.native
}
object TCPSocketAction {
  
  @scala.inline
  def apply(): TCPSocketAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TCPSocketAction]
  }
  
  @scala.inline
  implicit class TCPSocketActionOps[Self <: TCPSocketAction] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
