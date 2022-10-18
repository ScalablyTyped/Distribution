package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathBranchpolicyidEnvironmentnameResponses extends StObject {
  
  /**
    * Deletes a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var delete: ParametersPathBranchpolicyidEnvironmentnameResponses
  
  /**
    * Gets a deployment branch policy for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathBranchpolicyidEnvironmentname
  
  /**
    * Updates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var put: Responses498
}
object DeleteParametersPathBranchpolicyidEnvironmentnameResponses {
  
  inline def apply(
    delete: ParametersPathBranchpolicyidEnvironmentnameResponses,
    get: ParametersPathBranchpolicyidEnvironmentname,
    put: Responses498
  ): DeleteParametersPathBranchpolicyidEnvironmentnameResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathBranchpolicyidEnvironmentnameResponses]
  }
  
  extension [Self <: DeleteParametersPathBranchpolicyidEnvironmentnameResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathBranchpolicyidEnvironmentnameResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathBranchpolicyidEnvironmentname): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses498): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
