package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposTransferParams extends js.Object {
  /**
    * **Required:** The username or organization name the repository will be transferred to.
    */
  var new_owner: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
    */
  var team_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object ReposTransferParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    new_owner: java.lang.String = null,
    team_ids: js.Array[scala.Double] = null
  ): ReposTransferParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (new_owner != null) __obj.updateDynamic("new_owner")(new_owner)
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids)
    __obj.asInstanceOf[ReposTransferParams]
  }
}

