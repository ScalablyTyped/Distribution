package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDeployKeyEndpoint extends js.Object {
  
  /**
    * The contents of the key.
    */
  var key: String = js.native
  
  var owner: String = js.native
  
  /**
    * If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.
    *
    * Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see "[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)" and "[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/)."
    */
  var read_only: js.UndefOr[Boolean] = js.native
  
  var repo: String = js.native
  
  /**
    * A name for the key.
    */
  var title: js.UndefOr[String] = js.native
}
object ReposCreateDeployKeyEndpoint {
  
  @scala.inline
  def apply(key: String, owner: String, repo: String): ReposCreateDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeployKeyEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateDeployKeyEndpointOps[Self <: ReposCreateDeployKeyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_only(value: Boolean): Self = this.set("read_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead_only: Self = this.set("read_only", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
