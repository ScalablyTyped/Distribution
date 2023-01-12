package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectConfigRequest extends StObject {
  
  /** The new configuration for the project. */
  var projectConfig: js.UndefOr[ProjectConfig] = js.undefined
  
  /** A FieldMask specifying which fields of the project_config to modify. Only the fields in the mask will be modified. If no mask is provided, this request is no-op. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateProjectConfigRequest {
  
  inline def apply(): UpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProjectConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectConfig(value: ProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
