package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.subset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokenexpired extends StObject {
  
  /** @description Date and time when the request for access was created. */
  var created_at: String
  
  /** @description Unique identifier of the request for access via fine-grained personal access token. The `pat_request_id` used to review PAT requests. */
  var id: Double
  
  var owner: Avatarurl
  
  /** @description Permissions requested, categorized by type of permission. */
  var permissions: Organization
  
  /** @description Reason for requesting access. */
  var reason: String | Null
  
  /** @description URL to the list of repositories requested to be accessed via fine-grained personal access token. Should only be followed when `repository_selection` is `subset`. */
  var repositories_url: String
  
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
object Tokenexpired {
  
  inline def apply(
    created_at: String,
    id: Double,
    owner: Avatarurl,
    permissions: Organization,
    repositories_url: String,
    repository_selection: none_ | all | subset,
    token_expired: Boolean
  ): Tokenexpired = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], token_expired = token_expired.asInstanceOf[js.Any], reason = null, token_expires_at = null, token_last_used_at = null)
    __obj.asInstanceOf[Tokenexpired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tokenexpired] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Organization): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setRepository_selection(value: none_ | all | subset): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setToken_expired(value: Boolean): Self = StObject.set(x, "token_expired", value.asInstanceOf[js.Any])
    
    inline def setToken_expires_at(value: String): Self = StObject.set(x, "token_expires_at", value.asInstanceOf[js.Any])
    
    inline def setToken_expires_atNull: Self = StObject.set(x, "token_expires_at", null)
    
    inline def setToken_last_used_at(value: String): Self = StObject.set(x, "token_last_used_at", value.asInstanceOf[js.Any])
    
    inline def setToken_last_used_atNull: Self = StObject.set(x, "token_last_used_at", null)
  }
}
