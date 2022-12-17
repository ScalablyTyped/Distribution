package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters57Responses extends StObject {
  
  /** Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions. */
  var delete: Parameters57Responses
  
  /** Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response. */
  var get: Responses200Content78
  
  /** Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization. */
  var put: RequestBodyContent80
}
object DeleteParameters57Responses {
  
  inline def apply(delete: Parameters57Responses, get: Responses200Content78, put: RequestBodyContent80): DeleteParameters57Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters57Responses]
  }
  
  extension [Self <: DeleteParameters57Responses](x: Self) {
    
    inline def setDelete(value: Parameters57Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content78): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent80): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
