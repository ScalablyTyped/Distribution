package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsUpdateImportEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * The password to provide to the originating repository.
    */
  var vcs_password: js.UndefOr[String] = js.native
  
  /**
    * The username to provide to the originating repository.
    */
  var vcs_username: js.UndefOr[String] = js.native
}
object MigrationsUpdateImportEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): MigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsUpdateImportEndpointMutableBuilder[Self <: MigrationsUpdateImportEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_password(value: String): Self = StObject.set(x, "vcs_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_passwordUndefined: Self = StObject.set(x, "vcs_password", js.undefined)
    
    @scala.inline
    def setVcs_username(value: String): Self = StObject.set(x, "vcs_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_usernameUndefined: Self = StObject.set(x, "vcs_username", js.undefined)
  }
}
