package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathBranchpolicyidResponses extends StObject {
  
  /**
    * Deletes a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var delete: ParametersPathBranchpolicyidResponses
  
  /**
    * Gets a deployment branch policy for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathBranchpolicyid
  
  /**
    * Updates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var put: Responses235
}
object DeleteParametersPathBranchpolicyidResponses {
  
  inline def apply(
    delete: ParametersPathBranchpolicyidResponses,
    get: ParametersPathBranchpolicyid,
    put: Responses235
  ): DeleteParametersPathBranchpolicyidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathBranchpolicyidResponses]
  }
  
  extension [Self <: DeleteParametersPathBranchpolicyidResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathBranchpolicyidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathBranchpolicyid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses235): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
