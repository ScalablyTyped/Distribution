package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionLegacyEndpoint extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.undefined
  var discussion_number: Double
  var team_id: Double
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.undefined
}

object TeamsUpdateDiscussionLegacyEndpoint {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double, body: String = null, title: String = null): TeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionLegacyEndpoint]
  }
}

