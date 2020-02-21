package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgOwner extends js.Object {
  var org: AnonRequired
  var owner: AnonRequired
  var permission: AnonEnum
  var repo: AnonRequired
  var team_slug: AnonRequired
}

object AnonOrgOwner {
  @scala.inline
  def apply(
    org: AnonRequired,
    owner: AnonRequired,
    permission: AnonEnum,
    repo: AnonRequired,
    team_slug: AnonRequired
  ): AnonOrgOwner = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgOwner]
  }
}

