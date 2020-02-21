package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionInOrgParams extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.undefined
  var discussion_number: Double
  var org: String
  var team_slug: String
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.undefined
}

object TeamsUpdateDiscussionInOrgParams {
  @scala.inline
  def apply(
    discussion_number: Double,
    org: String,
    team_slug: String,
    body: String = null,
    title: String = null
  ): TeamsUpdateDiscussionInOrgParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionInOrgParams]
  }
}

