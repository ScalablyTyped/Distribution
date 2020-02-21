package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgOwnerRepo extends js.Object {
  var org: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var team_slug: AnonRequired
}

object AnonOrgOwnerRepo {
  @scala.inline
  def apply(org: AnonRequired, owner: AnonRequired, repo: AnonRequired, team_slug: AnonRequired): AnonOrgOwnerRepo = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgOwnerRepo]
  }
}

