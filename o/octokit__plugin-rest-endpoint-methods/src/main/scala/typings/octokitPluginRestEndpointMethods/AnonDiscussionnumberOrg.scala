package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiscussionnumberOrg extends js.Object {
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonDiscussionnumberOrg {
  @scala.inline
  def apply(discussion_number: AnonRequired, org: AnonRequired, team_slug: AnonRequired): AnonDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiscussionnumberOrg]
  }
}

