package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ContainerPort extends js.Object {
  
  /** Number of the port to expose on the container. This must be a valid port number: 0 < PORT_NUMBER < 65536. */
  var containerPort: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1ContainerPort {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ContainerPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ContainerPort]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ContainerPortOps[Self <: GoogleCloudMlV1ContainerPort] (val x: Self) extends AnyVal {
    
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
    def setContainerPort(value: Double): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
  }
}
