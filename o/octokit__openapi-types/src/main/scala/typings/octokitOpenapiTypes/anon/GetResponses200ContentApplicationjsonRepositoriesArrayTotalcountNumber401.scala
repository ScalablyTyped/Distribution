package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401 extends StObject {
  
  /**
    * List the repositories that have been granted the ability to use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401
  
  /**
    * Select the repositories that will use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  var put: Responses621
}
object GetResponses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401 {
  
  inline def apply(get: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401, put: Responses621): GetResponses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses621): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
