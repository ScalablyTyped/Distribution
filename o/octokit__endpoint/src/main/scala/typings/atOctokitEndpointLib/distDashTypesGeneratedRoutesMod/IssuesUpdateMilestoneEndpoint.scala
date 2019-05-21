package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneEndpoint extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var due_on: js.UndefOr[java.lang.String] = js.undefined
  var milestone_number: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesUpdateMilestoneEndpoint {
  @scala.inline
  def apply(
    milestone_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    description: java.lang.String = null,
    due_on: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    title: java.lang.String = null
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

