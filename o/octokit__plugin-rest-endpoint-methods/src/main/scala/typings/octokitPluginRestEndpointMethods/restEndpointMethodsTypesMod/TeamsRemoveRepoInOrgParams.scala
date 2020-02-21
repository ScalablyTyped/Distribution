package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveRepoInOrgParams extends js.Object {
  var org: String
  var owner: String
  var repo: String
  var team_slug: String
}

object TeamsRemoveRepoInOrgParams {
  @scala.inline
  def apply(org: String, owner: String, repo: String, team_slug: String): TeamsRemoveRepoInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsRemoveRepoInOrgParams]
  }
}

