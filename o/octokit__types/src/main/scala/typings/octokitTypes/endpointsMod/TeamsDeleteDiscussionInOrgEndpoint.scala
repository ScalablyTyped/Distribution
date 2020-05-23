package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionInOrgEndpoint extends js.Object {
  var discussion_number: Double
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsDeleteDiscussionInOrgEndpoint {
  @scala.inline
  def apply(discussion_number: Double, org_ : String, team_slug: String): TeamsDeleteDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteDiscussionInOrgEndpoint]
  }
}

