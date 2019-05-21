package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsForRepoEndpoint extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesListCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    direction: java.lang.String = null,
    since: java.lang.String = null,
    sort: java.lang.String = null
  ): IssuesListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[IssuesListCommentsForRepoEndpoint]
  }
}

