package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateEndpoint extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
  var state: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PullsUpdateEndpoint {
  @scala.inline
  def apply(
    owner: String,
    pull_number: Double,
    repo: String,
    base: String = null,
    body: String = null,
    maintainer_can_modify: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    state: String = null,
    title: String = null
  ): PullsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (base != null) __obj.updateDynamic("base")(base)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(maintainer_can_modify)) __obj.updateDynamic("maintainer_can_modify")(maintainer_can_modify)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PullsUpdateEndpoint]
  }
}

