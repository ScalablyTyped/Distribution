package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionInOrgParams extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: String
  var org: String
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  var team_slug: String
  /**
    * The discussion post's title.
    */
  var title: String
}

object TeamsCreateDiscussionInOrgParams {
  @scala.inline
  def apply(
    body: String,
    org: String,
    team_slug: String,
    title: String,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): TeamsCreateDiscussionInOrgParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionInOrgParams]
  }
}

