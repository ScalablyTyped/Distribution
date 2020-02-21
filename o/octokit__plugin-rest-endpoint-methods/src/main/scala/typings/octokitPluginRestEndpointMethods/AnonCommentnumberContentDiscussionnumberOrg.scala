package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentnumberContentDiscussionnumberOrg extends js.Object {
  var comment_number: AnonRequired
  var content: AnonEnum
  var discussion_number: AnonRequired
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var team_slug: AnonRequired
}

object AnonCommentnumberContentDiscussionnumberOrg {
  @scala.inline
  def apply(
    comment_number: AnonRequired,
    content: AnonEnum,
    discussion_number: AnonRequired,
    org: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    team_slug: AnonRequired
  ): AnonCommentnumberContentDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentnumberContentDiscussionnumberOrg]
  }
}

