package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForAuthenticatedUserResponseItemSubject extends js.Object {
  var latest_comment_url: String
  var title: String
  var `type`: String
  var url: String
}

object ActivityListNotificationsForAuthenticatedUserResponseItemSubject {
  @scala.inline
  def apply(latest_comment_url: String, title: String, `type`: String, url: String): ActivityListNotificationsForAuthenticatedUserResponseItemSubject = {
    val __obj = js.Dynamic.literal(latest_comment_url = latest_comment_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListNotificationsForAuthenticatedUserResponseItemSubject]
  }
}

