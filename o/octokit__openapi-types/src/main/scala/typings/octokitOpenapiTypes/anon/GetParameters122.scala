package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters122 extends StObject {
  
  /**
    * List organization repositories
    * @description Lists repositories for the specified organization.
    *
    * **Note:** In order to see the `security_and_analysis` block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  var get: Parameters122
  
  /**
    * Create an organization repository
    * @description Creates a new repository in the specified organization. The authenticated user must be a member of the organization.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  var post: RequestBodyContentApplicationjsonAllowautomerge
}
object GetParameters122 {
  
  inline def apply(get: Parameters122, post: RequestBodyContentApplicationjsonAllowautomerge): GetParameters122 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters122]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters122] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters122): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAllowautomerge): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
