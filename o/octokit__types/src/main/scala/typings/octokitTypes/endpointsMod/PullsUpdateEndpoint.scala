package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsUpdateEndpoint extends js.Object {
  /**
    * The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository.
    */
  var base: js.UndefOr[String] = js.native
  /**
    * The contents of the pull request.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
    */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.native
  var owner: String = js.native
  var pull_number: Double = js.native
  var repo: String = js.native
  /**
    * State of this Pull Request. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.native
  /**
    * The title of the pull request.
    */
  var title: js.UndefOr[String] = js.native
}

object PullsUpdateEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateEndpoint]
  }
  @scala.inline
  implicit class PullsUpdateEndpointOps[Self <: PullsUpdateEndpoint] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setMaintainer_can_modify(value: Boolean): Self = this.set("maintainer_can_modify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainer_can_modify: Self = this.set("maintainer_can_modify", js.undefined)
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

