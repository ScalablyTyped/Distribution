package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionParams extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: java.lang.String
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var team_id: scala.Double
  /**
    * The discussion post's title.
    */
  var title: java.lang.String
}

object TeamsCreateDiscussionParams {
  @scala.inline
  def apply(
    body: java.lang.String,
    team_id: scala.Double,
    title: java.lang.String,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): TeamsCreateDiscussionParams = {
    val __obj = js.Dynamic.literal(body = body, team_id = team_id, title = title)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsCreateDiscussionParams]
  }
}

