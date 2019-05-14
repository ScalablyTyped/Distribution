package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateMilestone_Options extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var due_on: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object IssuesCreateMilestone_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    title: java.lang.String,
    description: java.lang.String = null,
    due_on: java.lang.String = null,
    state: java.lang.String = null
  ): IssuesCreateMilestone_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, title = title)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_on != null) __obj.updateDynamic("due_on")(due_on)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IssuesCreateMilestone_Options]
  }
}

