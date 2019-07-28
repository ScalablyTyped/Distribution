package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddDeployKeyEndpoint extends js.Object {
  var key: String
  var owner: String
  var read_only: js.UndefOr[Boolean] = js.undefined
  var repo: String
  var title: js.UndefOr[String] = js.undefined
}

object ReposAddDeployKeyEndpoint {
  @scala.inline
  def apply(
    key: String,
    owner: String,
    repo: String,
    read_only: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): ReposAddDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(key = key, owner = owner, repo = repo)
    if (!js.isUndefined(read_only)) __obj.updateDynamic("read_only")(read_only)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ReposAddDeployKeyEndpoint]
  }
}

