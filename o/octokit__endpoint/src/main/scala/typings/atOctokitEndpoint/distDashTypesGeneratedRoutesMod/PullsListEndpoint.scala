package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListEndpoint extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var head: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  var sort: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object PullsListEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    base: String = null,
    direction: String = null,
    head: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: String = null,
    state: String = null
  ): PullsListEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (base != null) __obj.updateDynamic("base")(base)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (head != null) __obj.updateDynamic("head")(head)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PullsListEndpoint]
  }
}

