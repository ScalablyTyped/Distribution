package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckManagesRepoInOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var owner: String
  var repo: String
  var team_slug: String
}

object TeamsCheckManagesRepoInOrgEndpoint {
  @scala.inline
  def apply(org_ : String, owner: String, repo: String, team_slug: String): TeamsCheckManagesRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckManagesRepoInOrgEndpoint]
  }
}

