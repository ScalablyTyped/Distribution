package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneEndpoint extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var due_on: js.UndefOr[String] = js.undefined
  var milestone_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
  var state: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IssuesUpdateMilestoneEndpoint {
  @scala.inline
  def apply(
    milestone_number: Double,
    owner: String,
    repo: String,
    description: String = null,
    due_on: String = null,
    number: Int | Double = null,
    state: String = null,
    title: String = null
  ): IssuesUpdateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_on != null) __obj.updateDynamic("due_on")(due_on)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IssuesUpdateMilestoneEndpoint]
  }
}

