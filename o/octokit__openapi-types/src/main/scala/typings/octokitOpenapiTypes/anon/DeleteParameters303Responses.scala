package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters303Responses extends StObject {
  
  /** Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions. */
  var delete: Parameters303Responses
  
  /** Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response. */
  var get: Responses200Content336
  
  /** Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization. */
  var put: RequestBodyContent338
}
object DeleteParameters303Responses {
  
  inline def apply(delete: Parameters303Responses, get: Responses200Content336, put: RequestBodyContent338): DeleteParameters303Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters303Responses]
  }
  
  extension [Self <: DeleteParameters303Responses](x: Self) {
    
    inline def setDelete(value: Parameters303Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content336): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent338): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
