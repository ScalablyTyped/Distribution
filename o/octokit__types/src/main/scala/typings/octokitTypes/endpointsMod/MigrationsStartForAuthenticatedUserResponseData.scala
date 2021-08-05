package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsStartForAuthenticatedUserResponseData extends StObject {
  
  var created_at: String
  
  var exclude_attachments: Boolean
  
  var guid: String
  
  var id: Double
  
  var lock_repositories: Boolean
  
  var owner: Avatarurl
  
  var repositories: js.Array[Allowmergecommit]
  
  var state: String
  
  var updated_at: String
  
  var url: String
}
object MigrationsStartForAuthenticatedUserResponseData {
  
  inline def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: Avatarurl,
    repositories: js.Array[Allowmergecommit],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsStartForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserResponseData]
  }
  
  extension [Self <: MigrationsStartForAuthenticatedUserResponseData](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setExclude_attachments(value: Boolean): Self = StObject.set(x, "exclude_attachments", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLock_repositories(value: Boolean): Self = StObject.set(x, "lock_repositories", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepositories(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowmergecommit*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
