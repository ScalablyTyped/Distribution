package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForAuthenticatedUserResponseItem extends js.Object {
  var id: String
  var last_read_at: String
  var reason: String
  var repository: ActivityListNotificationsForAuthenticatedUserResponseItemRepository
  var subject: ActivityListNotificationsForAuthenticatedUserResponseItemSubject
  var unread: Boolean
  var updated_at: String
  var url: String
}

object ActivityListNotificationsForAuthenticatedUserResponseItem {
  @scala.inline
  def apply(
    id: String,
    last_read_at: String,
    reason: String,
    repository: ActivityListNotificationsForAuthenticatedUserResponseItemRepository,
    subject: ActivityListNotificationsForAuthenticatedUserResponseItemSubject,
    unread: Boolean,
    updated_at: String,
    url: String
  ): ActivityListNotificationsForAuthenticatedUserResponseItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_read_at = last_read_at.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListNotificationsForAuthenticatedUserResponseItem]
  }
}

