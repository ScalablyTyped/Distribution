package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateEndpoint extends js.Object {
  /**
    * The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository.
    */
  var base: String = js.native
  /**
    * The contents of the pull request.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Indicates whether the pull request is a draft. See "[Draft Pull Requests](https://docs.github.com/en/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help documentation to learn more.
    */
  var draft: js.UndefOr[Boolean] = js.native
  /**
    * The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`.
    */
  var head: String = js.native
  /**
    * Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
    */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The title of the new pull request.
    */
  var title: String = js.native
}

object PullsCreateEndpoint {
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String, title: String): PullsCreateEndpoint = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateEndpoint]
  }
  @scala.inline
  implicit class PullsCreateEndpointOps[Self <: PullsCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDraft(value: Boolean): Self = this.set("draft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraft: Self = this.set("draft", js.undefined)
    @scala.inline
    def setMaintainer_can_modify(value: Boolean): Self = this.set("maintainer_can_modify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainer_can_modify: Self = this.set("maintainer_can_modify", js.undefined)
  }
  
}

