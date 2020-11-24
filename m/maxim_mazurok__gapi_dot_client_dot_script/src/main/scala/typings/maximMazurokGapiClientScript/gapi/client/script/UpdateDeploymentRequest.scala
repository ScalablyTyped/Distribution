package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeploymentRequest extends js.Object {
  
  /** The deployment configuration. */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
}
object UpdateDeploymentRequest {
  
  @scala.inline
  def apply(): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
  
  @scala.inline
  implicit class UpdateDeploymentRequestOps[Self <: UpdateDeploymentRequest] (val x: Self) extends AnyVal {
    
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
    def setDeploymentConfig(value: DeploymentConfig): Self = this.set("deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentConfig: Self = this.set("deploymentConfig", js.undefined)
  }
}
