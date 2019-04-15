package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneParamsDeprecatedNumber extends js.Object {
  /**
    * A description of the milestone.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var due_on: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated "number" parameter renamed to "milestone_number"
    */
  var number: scala.Double
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

object IssuesUpdateMilestoneParamsDeprecatedNumber {
  @scala.inline
  def apply(
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    description: java.lang.String = null,
    due_on: java.lang.String = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed = null,
    title: java.lang.String = null
  ): IssuesUpdateMilestoneParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_on != null) __obj.updateDynamic("due_on")(due_on)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IssuesUpdateMilestoneParamsDeprecatedNumber]
  }
}

