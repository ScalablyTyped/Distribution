package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeleteFileEndpoint extends js.Object {
  
  /**
    * object containing information about the author.
    */
  var author: js.UndefOr[ReposDeleteFileParamsAuthor] = js.native
  
  /**
    * The branch name. Default: the repository’s default branch (usually `master`)
    */
  var branch: js.UndefOr[String] = js.native
  
  /**
    * object containing information about the committer.
    */
  var committer: js.UndefOr[ReposDeleteFileParamsCommitter] = js.native
  
  /**
    * The commit message.
    */
  var message: String = js.native
  
  var owner: String = js.native
  
  var path: String = js.native
  
  var repo: String = js.native
  
  /**
    * The blob SHA of the file being replaced.
    */
  var sha: String = js.native
}
object ReposDeleteFileEndpoint {
  
  @scala.inline
  def apply(message: String, owner: String, path: String, repo: String, sha: String): ReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteFileEndpointOps[Self <: ReposDeleteFileEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: ReposDeleteFileParamsAuthor): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setCommitter(value: ReposDeleteFileParamsCommitter): Self = this.set("committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitter: Self = this.set("committer", js.undefined)
  }
}
