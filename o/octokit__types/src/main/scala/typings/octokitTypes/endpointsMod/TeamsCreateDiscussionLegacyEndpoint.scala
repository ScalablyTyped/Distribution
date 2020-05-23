package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionLegacyEndpoint extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: String
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  var team_id: Double
  /**
    * The discussion post's title.
    */
  var title: String
}

object TeamsCreateDiscussionLegacyEndpoint {
  @scala.inline
  def apply(body: String, team_id: Double, title: String, `private`: js.UndefOr[Boolean] = js.undefined): TeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionLegacyEndpoint]
  }
}

