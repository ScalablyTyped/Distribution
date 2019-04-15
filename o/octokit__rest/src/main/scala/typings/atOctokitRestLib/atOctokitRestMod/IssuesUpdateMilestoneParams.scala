package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneParams extends js.Object {
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[java.lang.String] = js.undefined
  var milestone_number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * The state of the milestone. Either `open` or `closed`.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed
  ] = js.undefined
  /**
    * The title of the milestone.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesUpdateMilestoneParams {
  @scala.inline
  def apply(
    milestone_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    description: java.lang.String = null,
    due_on: java.lang.String = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed = null,
    title: java.lang.String = null
  ): IssuesUpdateMilestoneParams = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_on != null) __obj.updateDynamic("due_on")(due_on)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IssuesUpdateMilestoneParams]
  }
}

