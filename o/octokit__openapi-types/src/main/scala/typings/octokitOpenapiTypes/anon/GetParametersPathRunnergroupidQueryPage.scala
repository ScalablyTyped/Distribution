package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRunnergroupidQueryPage extends StObject {
  
  /**
    * Lists the organizations with access to a self-hosted runner group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersPathRunnergroupidQueryPage
  
  /**
    * Replaces the list of organizations that have access to a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids
}
object GetParametersPathRunnergroupidQueryPage {
  
  inline def apply(
    get: ParametersPathRunnergroupidQueryPage,
    put: ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids
  ): GetParametersPathRunnergroupidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRunnergroupidQueryPage]
  }
  
  extension [Self <: GetParametersPathRunnergroupidQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathRunnergroupidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
