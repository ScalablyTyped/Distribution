package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDiscussionnumberOrg extends js.Object {
  var body: AnonRequired
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonBodyDiscussionnumberOrg {
  @scala.inline
  def apply(body: AnonRequired, discussion_number: AnonRequired, org: AnonRequired, team_slug: AnonRequired): AnonBodyDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyDiscussionnumberOrg]
  }
}

