package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposTransferParams extends js.Object {
  /**
    * **Required:** The username or organization name the repository will be transferred to.
    */
  var new_owner: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  /**
    * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.undefined
}

object ReposTransferParams {
  @scala.inline
  def apply(owner: String, repo: String, new_owner: String = null, team_ids: js.Array[Double] = null): ReposTransferParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (new_owner != null) __obj.updateDynamic("new_owner")(new_owner.asInstanceOf[js.Any])
    if (team_ids != null) __obj.updateDynamic("team_ids")(team_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposTransferParams]
  }
}

