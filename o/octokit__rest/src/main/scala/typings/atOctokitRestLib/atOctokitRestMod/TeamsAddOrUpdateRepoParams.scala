package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateRepoParams extends js.Object {
  var owner: java.lang.String
  /**
    * The permission to grant the team on this repository. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer this repository.
    * \* `push` - team members can pull and push, but not administer this repository.
    * \* `admin` - team members can pull, push and administer this repository.
    *
    * If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    * **Note**: If you pass the `hellcat-preview` media type, you can promote—but not demote—a `permission` attribute inherited through a parent team.
    */
  var permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  var repo: java.lang.String
  var team_id: scala.Double
}

object TeamsAddOrUpdateRepoParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    team_id: scala.Double,
    permission: atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin = null
  ): TeamsAddOrUpdateRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, team_id = team_id)
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateRepoParams]
  }
}

