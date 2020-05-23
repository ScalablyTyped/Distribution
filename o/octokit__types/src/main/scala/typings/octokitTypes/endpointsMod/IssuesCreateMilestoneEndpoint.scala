package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateMilestoneEndpoint extends js.Object {
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
  /**
    * The title of the milestone.
    */
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
    state: open | closed = null
  ): IssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (due_on != null) __obj.updateDynamic("due_on")(due_on.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateMilestoneEndpoint]
  }
}

