package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposTransfer_Options extends js.Object {
  var new_owner: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var team_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object ReposTransfer_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    new_owner: java.lang.String = null,
    team_ids: js.Array[scala.Double] = null
  ): ReposTransfer_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (new_owner != null) __obj.updateDynamic("new_owner")(new_owner)
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids)
    __obj.asInstanceOf[ReposTransfer_Options]
  }
}

