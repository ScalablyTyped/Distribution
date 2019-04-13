package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForRepoResponseItem extends js.Object {
  var id: java.lang.String
  var last_read_at: java.lang.String
  var reason: java.lang.String
  var repository: ActivityListNotificationsForRepoResponseItemRepository
  var subject: ActivityListNotificationsForRepoResponseItemSubject
  var unread: scala.Boolean
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ActivityListNotificationsForRepoResponseItem {
  @scala.inline
  def apply(
    id: java.lang.String,
    last_read_at: java.lang.String,
    reason: java.lang.String,
    repository: ActivityListNotificationsForRepoResponseItemRepository,
    subject: ActivityListNotificationsForRepoResponseItemSubject,
    unread: scala.Boolean,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ActivityListNotificationsForRepoResponseItem = {
    val __obj = js.Dynamic.literal(id = id, last_read_at = last_read_at, reason = reason, repository = repository, subject = subject, unread = unread, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ActivityListNotificationsForRepoResponseItem]
  }
}

