package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommentsEndpoint extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var pull_number: scala.Double
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object PullsListCommentsEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    direction: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null,
    sort: java.lang.String = null
  ): PullsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[PullsListCommentsEndpoint]
  }
}

