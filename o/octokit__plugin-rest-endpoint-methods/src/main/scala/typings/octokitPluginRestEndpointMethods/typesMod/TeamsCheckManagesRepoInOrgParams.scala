package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckManagesRepoInOrgParams extends js.Object {
  var org: String
  var owner: String
  var repo: String
  var team_slug: String
}

object TeamsCheckManagesRepoInOrgParams {
  @scala.inline
  def apply(org: String, owner: String, repo: String, team_slug: String): TeamsCheckManagesRepoInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckManagesRepoInOrgParams]
  }
}

