package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGet extends StObject {
  
  /**
    * Deletes a self-hosted runner group for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathEnterpriseRunnergroupidResponses
  
  /**
    * Gets a specific self-hosted runner group for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersPathEnterpriseRunnergroupid
  
  /**
    * Updates the `name` and `visibility` of a self-hosted runner group in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var patch: Responses200Content255
}
object DeleteGet {
  
  inline def apply(
    delete: ParametersPathEnterpriseRunnergroupidResponses,
    get: ParametersPathEnterpriseRunnergroupid,
    patch: Responses200Content255
  ): DeleteGet = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGet]
  }
  
  extension [Self <: DeleteGet](x: Self) {
    
    inline def setDelete(value: ParametersPathEnterpriseRunnergroupidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathEnterpriseRunnergroupid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content255): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
