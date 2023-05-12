package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters47Responses extends StObject {
  
  /**
    * Remove interaction restrictions for an organization
    * @description Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  var delete: Parameters47Responses
  
  /**
    * Get interaction restrictions for an organization
    * @description Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.
    */
  var get: Responses200Content83
  
  /**
    * Set interaction restrictions for an organization
    * @description Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.
    */
  var put: RequestBodyContent84
}
object DeleteParameters47Responses {
  
  inline def apply(delete: Parameters47Responses, get: Responses200Content83, put: RequestBodyContent84): DeleteParameters47Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters47Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters47Responses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters47Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content83): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent84): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
