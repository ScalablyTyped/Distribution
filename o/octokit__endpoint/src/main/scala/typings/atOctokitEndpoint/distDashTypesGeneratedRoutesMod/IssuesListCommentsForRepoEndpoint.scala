package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsForRepoEndpoint extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var since: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
}

object IssuesListCommentsForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, direction: String = null, since: String = null, sort: String = null): IssuesListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[IssuesListCommentsForRepoEndpoint]
  }
}

