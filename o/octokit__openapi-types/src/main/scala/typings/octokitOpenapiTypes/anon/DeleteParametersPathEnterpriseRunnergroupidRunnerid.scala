package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathEnterpriseRunnergroupidRunnerid extends StObject {
  
  /**
    * Removes a self-hosted runner from a group configured in an enterprise. The runner is then returned to the default group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathEnterpriseRunnergroupidRunnerid
  
  /**
    * Adds a self-hosted runner to a runner group configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise`
    * scope to use this endpoint.
    */
  var put: ParametersPathEnterpriseRunnergroupidRunnerid
}
object DeleteParametersPathEnterpriseRunnergroupidRunnerid {
  
  inline def apply(
    delete: ParametersPathEnterpriseRunnergroupidRunnerid,
    put: ParametersPathEnterpriseRunnergroupidRunnerid
  ): DeleteParametersPathEnterpriseRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathEnterpriseRunnergroupidRunnerid]
  }
  
  extension [Self <: DeleteParametersPathEnterpriseRunnergroupidRunnerid](x: Self) {
    
    inline def setDelete(value: ParametersPathEnterpriseRunnergroupidRunnerid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathEnterpriseRunnergroupidRunnerid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
