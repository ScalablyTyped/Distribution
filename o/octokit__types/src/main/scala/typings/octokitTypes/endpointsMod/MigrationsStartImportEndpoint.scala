package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.git
import typings.octokitTypes.octokitTypesStrings.mercurial
import typings.octokitTypes.octokitTypesStrings.subversion
import typings.octokitTypes.octokitTypesStrings.tfvc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsStartImportEndpoint extends js.Object {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * For a tfvc import, the name of the project that is being imported.
    */
  var tfvc_project: js.UndefOr[String] = js.native
  
  /**
    * The originating VCS type. Can be one of `subversion`, `git`, `mercurial`, or `tfvc`. Please be aware that without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
    */
  var vcs: js.UndefOr[subversion | git | mercurial | tfvc] = js.native
  
  /**
    * If authentication is required, the password to provide to `vcs_url`.
    */
  var vcs_password: js.UndefOr[String] = js.native
  
  /**
    * The URL of the originating repository.
    */
  var vcs_url: String = js.native
  
  /**
    * If authentication is required, the username to provide to `vcs_url`.
    */
  var vcs_username: js.UndefOr[String] = js.native
}
object MigrationsStartImportEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, vcs_url: String): MigrationsStartImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartImportEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsStartImportEndpointOps[Self <: MigrationsStartImportEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_url(value: String): Self = this.set("vcs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc_project(value: String): Self = this.set("tfvc_project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTfvc_project: Self = this.set("tfvc_project", js.undefined)
    
    @scala.inline
    def setVcs(value: subversion | git | mercurial | tfvc): Self = this.set("vcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVcs: Self = this.set("vcs", js.undefined)
    
    @scala.inline
    def setVcs_password(value: String): Self = this.set("vcs_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVcs_password: Self = this.set("vcs_password", js.undefined)
    
    @scala.inline
    def setVcs_username(value: String): Self = this.set("vcs_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVcs_username: Self = this.set("vcs_username", js.undefined)
  }
}
