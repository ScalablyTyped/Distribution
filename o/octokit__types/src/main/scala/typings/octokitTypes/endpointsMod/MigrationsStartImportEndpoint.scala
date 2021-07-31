package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.git
import typings.octokitTypes.octokitTypesStrings.mercurial
import typings.octokitTypes.octokitTypesStrings.subversion
import typings.octokitTypes.octokitTypesStrings.tfvc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsStartImportEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  /**
    * For a tfvc import, the name of the project that is being imported.
    */
  var tfvc_project: js.UndefOr[String] = js.undefined
  
  /**
    * The originating VCS type. Can be one of `subversion`, `git`, `mercurial`, or `tfvc`. Please be aware that without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
    */
  var vcs: js.UndefOr[subversion | git | mercurial | tfvc] = js.undefined
  
  /**
    * If authentication is required, the password to provide to `vcs_url`.
    */
  var vcs_password: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the originating repository.
    */
  var vcs_url: String
  
  /**
    * If authentication is required, the username to provide to `vcs_url`.
    */
  var vcs_username: js.UndefOr[String] = js.undefined
}
object MigrationsStartImportEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, vcs_url: String): MigrationsStartImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartImportEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsStartImportEndpointMutableBuilder[Self <: MigrationsStartImportEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc_project(value: String): Self = StObject.set(x, "tfvc_project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc_projectUndefined: Self = StObject.set(x, "tfvc_project", js.undefined)
    
    @scala.inline
    def setVcs(value: subversion | git | mercurial | tfvc): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcsUndefined: Self = StObject.set(x, "vcs", js.undefined)
    
    @scala.inline
    def setVcs_password(value: String): Self = StObject.set(x, "vcs_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_passwordUndefined: Self = StObject.set(x, "vcs_password", js.undefined)
    
    @scala.inline
    def setVcs_url(value: String): Self = StObject.set(x, "vcs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_username(value: String): Self = StObject.set(x, "vcs_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_usernameUndefined: Self = StObject.set(x, "vcs_username", js.undefined)
  }
}
