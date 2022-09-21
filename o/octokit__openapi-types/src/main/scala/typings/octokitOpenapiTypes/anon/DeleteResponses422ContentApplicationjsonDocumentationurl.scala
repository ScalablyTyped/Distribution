package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses422ContentApplicationjsonDocumentationurl extends StObject {
  
  /** Removing a user from this list will remove them from all the organization's repositories. */
  var delete: Responses422ContentApplicationjsonDocumentationurl
  
  /** When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)". Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)." */
  var put: RequestBodyContentApplicationjsonAsync
}
object DeleteResponses422ContentApplicationjsonDocumentationurl {
  
  inline def apply(
    delete: Responses422ContentApplicationjsonDocumentationurl,
    put: RequestBodyContentApplicationjsonAsync
  ): DeleteResponses422ContentApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses422ContentApplicationjsonDocumentationurl]
  }
  
  extension [Self <: DeleteResponses422ContentApplicationjsonDocumentationurl](x: Self) {
    
    inline def setDelete(value: Responses422ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonAsync): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
