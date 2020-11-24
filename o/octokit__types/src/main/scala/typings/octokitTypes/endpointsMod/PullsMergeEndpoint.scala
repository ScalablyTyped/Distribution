package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.merge
import typings.octokitTypes.octokitTypesStrings.rebase
import typings.octokitTypes.octokitTypesStrings.squash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsMergeEndpoint extends js.Object {
  
  /**
    * Extra detail to append to automatic commit message.
    */
  var commit_message: js.UndefOr[String] = js.native
  
  /**
    * Title for the automatic commit message.
    */
  var commit_title: js.UndefOr[String] = js.native
  
  /**
    * Merge method to use. Possible values are `merge`, `squash` or `rebase`. Default is `merge`.
    */
  var merge_method: js.UndefOr[merge | squash | rebase] = js.native
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
  
  /**
    * SHA that pull request head must match to allow merge.
    */
  var sha: js.UndefOr[String] = js.native
}
object PullsMergeEndpoint {
  
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsMergeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeEndpoint]
  }
  
  @scala.inline
  implicit class PullsMergeEndpointOps[Self <: PullsMergeEndpoint] (val x: Self) extends AnyVal {
    
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
    def setPull_number(value: Double): Self = this.set("pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_message(value: String): Self = this.set("commit_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit_message: Self = this.set("commit_message", js.undefined)
    
    @scala.inline
    def setCommit_title(value: String): Self = this.set("commit_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit_title: Self = this.set("commit_title", js.undefined)
    
    @scala.inline
    def setMerge_method(value: merge | squash | rebase): Self = this.set("merge_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerge_method: Self = this.set("merge_method", js.undefined)
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha: Self = this.set("sha", js.undefined)
  }
}
