package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.closed
import typings.atOctokitRest.atOctokitRestStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneParams extends js.Object {
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.undefined
  var milestone_number: Double
  var owner: String
  var repo: String
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  /**
    * The title of the milestone.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IssuesUpdateMilestoneParams {
  @scala.inline
  def apply(
    milestone_number: Double,
    owner: String,
    repo: String,
    description: String = null,
    due_on: String = null,
    state: open | closed = null,
    title: String = null
  ): IssuesUpdateMilestoneParams = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_on != null) __obj.updateDynamic("due_on")(due_on)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IssuesUpdateMilestoneParams]
  }
}

