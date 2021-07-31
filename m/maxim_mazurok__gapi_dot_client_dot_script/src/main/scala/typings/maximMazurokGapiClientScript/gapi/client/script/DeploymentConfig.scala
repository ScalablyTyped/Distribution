package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfig extends StObject {
  
  /** The description for this deployment. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The manifest file name for this deployment. */
  var manifestFileName: js.UndefOr[String] = js.undefined
  
  /** The script project's Drive ID. */
  var scriptId: js.UndefOr[String] = js.undefined
  
  /** The version number on which this deployment is based. */
  var versionNumber: js.UndefOr[Double] = js.undefined
}
object DeploymentConfig {
  
  @scala.inline
  def apply(): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfig]
  }
  
  @scala.inline
  implicit class DeploymentConfigMutableBuilder[Self <: DeploymentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setManifestFileName(value: String): Self = StObject.set(x, "manifestFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestFileNameUndefined: Self = StObject.set(x, "manifestFileName", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
