package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposTransferEndpoint extends js.Object {
  var new_owner: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var team_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object ReposTransferEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, new_owner: String = null, team_ids: js.Array[Double] = null): ReposTransferEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (new_owner != null) __obj.updateDynamic("new_owner")(new_owner)
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids)
    __obj.asInstanceOf[ReposTransferEndpoint]
  }
}

