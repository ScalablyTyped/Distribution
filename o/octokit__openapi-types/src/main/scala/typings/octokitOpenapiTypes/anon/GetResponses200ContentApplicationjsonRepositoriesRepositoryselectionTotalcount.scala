package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount extends StObject {
  
  /**
    * List repositories that an app installation can access.
    *
    * You must use an [installation access token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  var get: Responses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount
}
object GetResponses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount): GetResponses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonRepositoriesRepositoryselectionTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
