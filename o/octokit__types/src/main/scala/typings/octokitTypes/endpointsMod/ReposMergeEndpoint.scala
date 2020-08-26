package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposMergeEndpoint extends js.Object {
  /**
    * The name of the base branch that the head will be merged into.
    */
  var base: String = js.native
  /**
    * Commit message to use for the merge commit. If omitted, a default message will be used.
    */
  var commit_message: js.UndefOr[String] = js.native
  /**
    * The head to merge. This can be a branch name or a commit SHA1.
    */
  var head: String = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReposMergeEndpoint {
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String): ReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeEndpoint]
  }
  @scala.inline
  implicit class ReposMergeEndpointOps[Self <: ReposMergeEndpoint] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit_message(value: String): Self = this.set("commit_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit_message: Self = this.set("commit_message", js.undefined)
  }
  
}

