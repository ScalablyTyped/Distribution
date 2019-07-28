package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateMilestoneEndpoint extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var due_on: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var state: js.UndefOr[String] = js.undefined
  var title: String
}

object IssuesCreateMilestoneEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    title: String,
    description: String = null,
    due_on: String = null,
    state: String = null
  ): IssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, title = title)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_on != null) __obj.updateDynamic("due_on")(due_on)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IssuesCreateMilestoneEndpoint]
  }
}

