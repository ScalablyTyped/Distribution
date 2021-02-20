package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsStartForAuthenticatedUserEndpoint extends StObject {
  
  /**
    * Does not include attachments uploaded to GitHub.com in the migration data when set to `true`. Excluding attachments will reduce the migration archive file size.
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.native
  
  /**
    * Locks the `repositories` to prevent changes during the migration when set to `true`.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of repositories to include in the migration.
    */
  var repositories: js.Array[String] = js.native
}
object MigrationsStartForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(repositories: js.Array[String]): MigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsStartForAuthenticatedUserEndpointMutableBuilder[Self <: MigrationsStartForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude_attachments(value: Boolean): Self = StObject.set(x, "exclude_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_attachmentsUndefined: Self = StObject.set(x, "exclude_attachments", js.undefined)
    
    @scala.inline
    def setLock_repositories(value: Boolean): Self = StObject.set(x, "lock_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock_repositoriesUndefined: Self = StObject.set(x, "lock_repositories", js.undefined)
    
    @scala.inline
    def setRepositories(value: js.Array[String]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesVarargs(value: String*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
