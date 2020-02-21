package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionInOrgParams extends js.Object {
  var discussion_number: Double
  var org: String
  var team_slug: String
}

object TeamsDeleteDiscussionInOrgParams {
  @scala.inline
  def apply(discussion_number: Double, org: String, team_slug: String): TeamsDeleteDiscussionInOrgParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsDeleteDiscussionInOrgParams]
  }
}

