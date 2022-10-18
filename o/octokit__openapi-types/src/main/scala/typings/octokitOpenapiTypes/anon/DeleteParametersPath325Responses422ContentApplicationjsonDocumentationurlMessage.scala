package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  /** Removing a user from this list will remove them from all the organization's repositories. */
  var delete: ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage
  
  /** When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)". Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)." */
  var put: Responses202403404
}
object DeleteParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(
    delete: ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage,
    put: Responses202403404
  ): DeleteParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage]
  }
  
  extension [Self <: DeleteParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage](x: Self) {
    
    inline def setDelete(value: ParametersPath325Responses422ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses202403404): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
