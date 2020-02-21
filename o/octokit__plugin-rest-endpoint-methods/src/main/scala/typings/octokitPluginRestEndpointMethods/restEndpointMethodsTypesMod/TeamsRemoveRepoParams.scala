package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveRepoParams extends js.Object {
  var owner: String
  var repo: String
  var team_id: Double
}

object TeamsRemoveRepoParams {
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double): TeamsRemoveRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsRemoveRepoParams]
  }
}

