package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnterpriseRunnergroupidQuery250 extends StObject {
  
  /**
    * Lists the organizations with access to a self-hosted runner group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersPathEnterpriseRunnergroupidQuery250
  
  /**
    * Replaces the list of organizations that have access to a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids
}
object GetParametersPathEnterpriseRunnergroupidQuery250 {
  
  inline def apply(
    get: ParametersPathEnterpriseRunnergroupidQuery250,
    put: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids
  ): GetParametersPathEnterpriseRunnergroupidQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnterpriseRunnergroupidQuery250]
  }
  
  extension [Self <: GetParametersPathEnterpriseRunnergroupidQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathEnterpriseRunnergroupidQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(
      value: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids
    ): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
