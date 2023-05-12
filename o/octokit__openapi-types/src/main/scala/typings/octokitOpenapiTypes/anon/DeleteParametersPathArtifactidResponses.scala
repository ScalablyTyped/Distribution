package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathArtifactidResponses extends StObject {
  
  /**
    * Delete an artifact
    * @description Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var delete: ParametersPathArtifactidResponses
  
  /**
    * Get an artifact
    * @description Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathArtifactid
}
object DeleteParametersPathArtifactidResponses {
  
  inline def apply(delete: ParametersPathArtifactidResponses, get: ParametersPathArtifactid): DeleteParametersPathArtifactidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathArtifactidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathArtifactidResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathArtifactidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathArtifactid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
