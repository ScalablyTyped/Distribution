package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesCreateMilestoneEndpoint extends js.Object {
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.native
  /**
    * The title of the milestone.
    */
  var title: String = js.native
}

object IssuesCreateMilestoneEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, title: String): IssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateMilestoneEndpoint]
  }
  @scala.inline
  implicit class IssuesCreateMilestoneEndpointOps[Self <: IssuesCreateMilestoneEndpoint] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDue_on(value: String): Self = this.set("due_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDue_on: Self = this.set("due_on", js.undefined)
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

