package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.subset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissionsresult extends StObject {
  
  /** @description Date and time when the request for access was created. */
  var created_at: String
  
  /** @description Unique identifier of the request for access via fine-grained personal access token. Used as the `pat_request_id` parameter in the list and review API calls. */
  var id: Double
  
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  
  /** @description New requested permissions, categorized by type of permission. */
  var permissions_added: Organization
  
  /** @description Permissions requested, categorized by type of permission. This field incorporates `permissions_added` and `permissions_upgraded`. */
  var permissions_result: Organization
  
  /** @description Requested permissions that elevate access for a previously approved request for access, categorized by type of permission. */
  var permissions_upgraded: Organization
  
  /** @description An array of repository objects the token is requesting access to. This field is only populated when `repository_selection` is `subset`. */
  var repositories: js.Array[Fullname] | Null
  
  /** @description The number of repositories the token is requesting access to. This field is only populated when `repository_selection` is `subset`. */
  var repository_count: Double | Null
  
  /**
    * @description Type of repository selection requested.
    * @enum {string}
    */
  var repository_selection: none_ | all | subset
  
  /** @description Whether the associated fine-grained personal access token has expired. */
  var token_expired: Boolean
  
  /** @description Date and time when the associated fine-grained personal access token expires. */
  var token_expires_at: String | Null
  
  /** @description Date and time when the associated fine-grained personal access token was last used for authentication. */
  var token_last_used_at: String | Null
}
object Permissionsresult {
  
  inline def apply(
    created_at: String,
    id: Double,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any,
    permissions_added: Organization,
    permissions_result: Organization,
    permissions_upgraded: Organization,
    repository_selection: none_ | all | subset,
    token_expired: Boolean
  ): Permissionsresult = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions_added = permissions_added.asInstanceOf[js.Any], permissions_result = permissions_result.asInstanceOf[js.Any], permissions_upgraded = permissions_upgraded.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], token_expired = token_expired.asInstanceOf[js.Any], repositories = null, repository_count = null, token_expires_at = null, token_last_used_at = null)
    __obj.asInstanceOf[Permissionsresult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permissionsresult] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPermissions_added(value: Organization): Self = StObject.set(x, "permissions_added", value.asInstanceOf[js.Any])
    
    inline def setPermissions_result(value: Organization): Self = StObject.set(x, "permissions_result", value.asInstanceOf[js.Any])
    
    inline def setPermissions_upgraded(value: Organization): Self = StObject.set(x, "permissions_upgraded", value.asInstanceOf[js.Any])
    
    inline def setRepositories(value: js.Array[Fullname]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesNull: Self = StObject.set(x, "repositories", null)
    
    inline def setRepositoriesVarargs(value: Fullname*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_count(value: Double): Self = StObject.set(x, "repository_count", value.asInstanceOf[js.Any])
    
    inline def setRepository_countNull: Self = StObject.set(x, "repository_count", null)
    
    inline def setRepository_selection(value: none_ | all | subset): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setToken_expired(value: Boolean): Self = StObject.set(x, "token_expired", value.asInstanceOf[js.Any])
    
    inline def setToken_expires_at(value: String): Self = StObject.set(x, "token_expires_at", value.asInstanceOf[js.Any])
    
    inline def setToken_expires_atNull: Self = StObject.set(x, "token_expires_at", null)
    
    inline def setToken_last_used_at(value: String): Self = StObject.set(x, "token_last_used_at", value.asInstanceOf[js.Any])
    
    inline def setToken_last_used_atNull: Self = StObject.set(x, "token_last_used_at", null)
  }
}
