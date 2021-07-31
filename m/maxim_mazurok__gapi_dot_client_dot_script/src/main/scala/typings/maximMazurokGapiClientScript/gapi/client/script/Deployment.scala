package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /** The deployment configuration. */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  
  /** The deployment ID for this deployment. */
  var deploymentId: js.UndefOr[String] = js.undefined
  
  /** The deployment's entry points. */
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.undefined
  
  /** Last modified date time stamp. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setEntryPoints(value: js.Array[EntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    @scala.inline
    def setEntryPointsVarargs(value: EntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
