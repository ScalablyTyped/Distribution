package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionParams extends js.Object {
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

object TeamsUpdateDiscussionParams {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double, body: String = null, title: String = null): TeamsUpdateDiscussionParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TeamsUpdateDiscussionParams]
  }
}

