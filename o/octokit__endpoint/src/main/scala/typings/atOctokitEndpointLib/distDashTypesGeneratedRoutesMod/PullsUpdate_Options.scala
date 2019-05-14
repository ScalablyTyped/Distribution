package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdate_Options extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var maintainer_can_modify: js.UndefOr[scala.Boolean] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PullsUpdate_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    base: java.lang.String = null,
    body: java.lang.String = null,
    maintainer_can_modify: js.UndefOr[scala.Boolean] = js.undefined,
    number: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    title: java.lang.String = null
  ): PullsUpdate_Options = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (base != null) __obj.updateDynamic("base")(base)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PullsUpdate_Options]
  }
}

