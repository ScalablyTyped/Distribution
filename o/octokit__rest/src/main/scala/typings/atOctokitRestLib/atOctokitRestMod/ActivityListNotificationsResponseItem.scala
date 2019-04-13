package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsResponseItem extends js.Object {
  var id: java.lang.String
  var last_read_at: java.lang.String
  var reason: java.lang.String
  var repository: ActivityListNotificationsResponseItemRepository
  var subject: ActivityListNotificationsResponseItemSubject
  var unread: scala.Boolean
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ActivityListNotificationsResponseItem {
  @scala.inline
  def apply(
    id: java.lang.String,
    last_read_at: java.lang.String,
    reason: java.lang.String,
    repository: ActivityListNotificationsResponseItemRepository,
    subject: ActivityListNotificationsResponseItemSubject,
    unread: scala.Boolean,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ActivityListNotificationsResponseItem = {
    val __obj = js.Dynamic.literal(id = id, last_read_at = last_read_at, reason = reason, repository = repository, subject = subject, unread = unread, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ActivityListNotificationsResponseItem]
  }
}

