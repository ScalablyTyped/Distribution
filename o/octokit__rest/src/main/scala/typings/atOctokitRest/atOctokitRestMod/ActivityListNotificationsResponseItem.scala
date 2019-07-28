package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsResponseItem extends js.Object {
  var id: String
  var last_read_at: String
  var reason: String
  var repository: ActivityListNotificationsResponseItemRepository
  var subject: ActivityListNotificationsResponseItemSubject
  var unread: Boolean
  var updated_at: String
  var url: String
}

object ActivityListNotificationsResponseItem {
  @scala.inline
  def apply(
    id: String,
    last_read_at: String,
    reason: String,
    repository: ActivityListNotificationsResponseItemRepository,
    subject: ActivityListNotificationsResponseItemSubject,
    unread: Boolean,
    updated_at: String,
    url: String
  ): ActivityListNotificationsResponseItem = {
    val __obj = js.Dynamic.literal(id = id, last_read_at = last_read_at, reason = reason, repository = repository, subject = subject, unread = unread, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ActivityListNotificationsResponseItem]
  }
}

