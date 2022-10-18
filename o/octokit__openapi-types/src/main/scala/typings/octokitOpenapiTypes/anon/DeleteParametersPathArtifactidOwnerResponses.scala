package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathArtifactidOwnerResponses extends StObject {
  
  /** Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. */
  var delete: ParametersPathArtifactidOwnerResponses
  
  /** Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathArtifactidOwner
}
object DeleteParametersPathArtifactidOwnerResponses {
  
  inline def apply(delete: ParametersPathArtifactidOwnerResponses, get: ParametersPathArtifactidOwner): DeleteParametersPathArtifactidOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathArtifactidOwnerResponses]
  }
  
  extension [Self <: DeleteParametersPathArtifactidOwnerResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathArtifactidOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathArtifactidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
