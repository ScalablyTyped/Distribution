package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses307 extends StObject {
  
  /**
    * Delete a repository
    * @description Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned
    * repositories, you will get a `403 Forbidden` response.
    */
  var delete: Responses307
  
  /**
    * Get a repository
    * @description The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    *
    * **Note:** In order to see the `security_and_analysis` block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  var get: Parameters165
  
  /**
    * Update a repository
    * @description **Note**: To edit a repository's topics, use the [Replace all repository topics](https://docs.github.com/rest/reference/repos#replace-all-repository-topics) endpoint.
    */
  var patch: Responses200307
}
object DeleteResponses307 {
  
  inline def apply(delete: Responses307, get: Parameters165, patch: Responses200307): DeleteResponses307 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses307]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses307] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses307): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters165): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200307): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
