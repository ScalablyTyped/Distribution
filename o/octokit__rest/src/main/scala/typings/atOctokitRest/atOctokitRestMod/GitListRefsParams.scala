package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitListRefsParams extends js.Object {
  /**
    * Filter by sub-namespace (reference prefix). Most commen examples would be `'heads/'` and `'tags/'` to retrieve branches or tags
    */
  var namespace: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object GitListRefsParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    namespace: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): GitListRefsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitListRefsParams]
  }
}

