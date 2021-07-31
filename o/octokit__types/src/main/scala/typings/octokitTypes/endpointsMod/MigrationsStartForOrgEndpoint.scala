package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsStartForOrgEndpoint extends StObject {
  
  /**
    * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.undefined
  
  @JSName("org")
  var org_ : String
  
  /**
    * A list of arrays indicating which repositories should be migrated.
    */
  var repositories: js.Array[String]
}
object MigrationsStartForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, repositories: js.Array[String]): MigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsStartForOrgEndpointMutableBuilder[Self <: MigrationsStartForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude_attachments(value: Boolean): Self = StObject.set(x, "exclude_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_attachmentsUndefined: Self = StObject.set(x, "exclude_attachments", js.undefined)
    
    @scala.inline
    def setLock_repositories(value: Boolean): Self = StObject.set(x, "lock_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock_repositoriesUndefined: Self = StObject.set(x, "lock_repositories", js.undefined)
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositories(value: js.Array[String]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesVarargs(value: String*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
