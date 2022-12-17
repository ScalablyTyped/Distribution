package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludemetadata extends StObject {
  
  /** Format: uri */
  var archive_url: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2015-07-06T15:33:38-07:00
    */
  var created_at: String
  
  var exclude: js.UndefOr[js.Array[Any]] = js.undefined
  
  var exclude_attachments: Boolean
  
  var exclude_git_data: Boolean
  
  var exclude_metadata: Boolean
  
  var exclude_owner_projects: Boolean
  
  var exclude_releases: Boolean
  
  /** @example 0b989ba4-242f-11e5-81e1-c7b6966d2516 */
  var guid: String
  
  /** @example 79 */
  var id: Double
  
  /** @example true */
  var lock_repositories: Boolean
  
  var node_id: String
  
  var org_metadata_only: Boolean
  
  var owner: Avatarurl | Null
  
  var repositories: js.Array[Allowupdatebranch]
  
  /** @example pending */
  var state: String
  
  /**
    * Format: date-time
    * @example 2015-07-06T15:33:38-07:00
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/octo-org/migrations/79
    */
  var url: String
}
object Excludemetadata {
  
  inline def apply(
    created_at: String,
    exclude_attachments: Boolean,
    exclude_git_data: Boolean,
    exclude_metadata: Boolean,
    exclude_owner_projects: Boolean,
    exclude_releases: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    node_id: String,
    org_metadata_only: Boolean,
    repositories: js.Array[Allowupdatebranch],
    state: String,
    updated_at: String,
    url: String
  ): Excludemetadata = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], exclude_git_data = exclude_git_data.asInstanceOf[js.Any], exclude_metadata = exclude_metadata.asInstanceOf[js.Any], exclude_owner_projects = exclude_owner_projects.asInstanceOf[js.Any], exclude_releases = exclude_releases.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], org_metadata_only = org_metadata_only.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], owner = null)
    __obj.asInstanceOf[Excludemetadata]
  }
  
  extension [Self <: Excludemetadata](x: Self) {
    
    inline def setArchive_url(value: String): Self = StObject.set(x, "archive_url", value.asInstanceOf[js.Any])
    
    inline def setArchive_urlUndefined: Self = StObject.set(x, "archive_url", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: js.Array[Any]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: Any*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExclude_attachments(value: Boolean): Self = StObject.set(x, "exclude_attachments", value.asInstanceOf[js.Any])
    
    inline def setExclude_git_data(value: Boolean): Self = StObject.set(x, "exclude_git_data", value.asInstanceOf[js.Any])
    
    inline def setExclude_metadata(value: Boolean): Self = StObject.set(x, "exclude_metadata", value.asInstanceOf[js.Any])
    
    inline def setExclude_owner_projects(value: Boolean): Self = StObject.set(x, "exclude_owner_projects", value.asInstanceOf[js.Any])
    
    inline def setExclude_releases(value: Boolean): Self = StObject.set(x, "exclude_releases", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLock_repositories(value: Boolean): Self = StObject.set(x, "lock_repositories", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_metadata_only(value: Boolean): Self = StObject.set(x, "org_metadata_only", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setRepositories(value: js.Array[Allowupdatebranch]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowupdatebranch*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
