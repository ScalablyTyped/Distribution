package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.maintain
import typings.octokitTypes.octokitTypesStrings.pull
import typings.octokitTypes.octokitTypesStrings.push
import typings.octokitTypes.octokitTypesStrings.triage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposAddCollaboratorEndpoint extends StObject {
  
  var owner: String = js.native
  
  /**
    * The permission to grant the collaborator. **Only valid on organization-owned repositories.** Can be one of:
    * \* `pull` - can pull, but not push to or administer this repository.
    * \* `push` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push and administer this repository.
    * \* `maintain` - Recommended for project managers who need to manage the repository without access to sensitive or destructive actions.
    * \* `triage` - Recommended for contributors who need to proactively manage issues and pull requests without write access.
    */
  var permission: js.UndefOr[pull | push | admin | maintain | triage] = js.native
  
  var repo: String = js.native
  
  var username: String = js.native
}
object ReposAddCollaboratorEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ReposAddCollaboratorEndpointMutableBuilder[Self <: ReposAddCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: pull | push | admin | maintain | triage): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
