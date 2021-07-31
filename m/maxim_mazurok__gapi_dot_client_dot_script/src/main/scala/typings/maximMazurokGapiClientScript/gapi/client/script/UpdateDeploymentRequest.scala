package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentRequest extends StObject {
  
  /** The deployment configuration. */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
}
object UpdateDeploymentRequest {
  
  @scala.inline
  def apply(): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
  
  @scala.inline
  implicit class UpdateDeploymentRequestMutableBuilder[Self <: UpdateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
  }
}
