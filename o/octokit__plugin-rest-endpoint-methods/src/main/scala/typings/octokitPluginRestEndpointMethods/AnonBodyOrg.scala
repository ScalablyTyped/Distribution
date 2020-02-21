package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyOrg extends js.Object {
  var body: AnonRequired
  var org: AnonRequired
  var `private`: AnonType
  var team_slug: AnonRequired
  var title: AnonRequired
}

object AnonBodyOrg {
  @scala.inline
  def apply(
    body: AnonRequired,
    org: AnonRequired,
    `private`: AnonType,
    team_slug: AnonRequired,
    title: AnonRequired
  ): AnonBodyOrg = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyOrg]
  }
}

