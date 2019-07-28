package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.asc
import typings.atOctokitRest.atOctokitRestStrings.created
import typings.atOctokitRest.atOctokitRestStrings.desc
import typings.atOctokitRest.atOctokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsForRepoParams extends js.Object {
  /**
    * Either `asc` or `desc`. Ignored without the `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var owner: String
  var repo: String
  /**
    * Only comments updated at or after this time are returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[String] = js.undefined
  /**
    * Either `created` or `updated`.
    */
  var sort: js.UndefOr[created | updated] = js.undefined
}

object IssuesListCommentsForRepoParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    direction: asc | desc = null,
    since: String = null,
    sort: created | updated = null
  ): IssuesListCommentsForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListCommentsForRepoParams]
  }
}

