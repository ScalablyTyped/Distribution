package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddDeployKey_Options extends js.Object {
  var key: java.lang.String
  var owner: java.lang.String
  var read_only: js.UndefOr[scala.Boolean] = js.undefined
  var repo: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ReposAddDeployKey_Options {
  @scala.inline
  def apply(
    key: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    read_only: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): ReposAddDeployKey_Options = {
    val __obj = js.Dynamic.literal(key = key, owner = owner, repo = repo)
    if (!js.isUndefined(read_only)) __obj.updateDynamic("read_only")(read_only)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ReposAddDeployKey_Options]
  }
}

