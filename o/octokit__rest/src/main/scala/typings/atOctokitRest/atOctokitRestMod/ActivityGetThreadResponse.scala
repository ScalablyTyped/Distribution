package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadResponse extends js.Object {
  var id: String
  var last_read_at: String
  var reason: String
  var repository: ActivityGetThreadResponseRepository
  var subject: ActivityGetThreadResponseSubject
  var unread: Boolean
  var updated_at: String
  var url: String
}

object ActivityGetThreadResponse {
  @scala.inline
  def apply(
    id: String,
    last_read_at: String,
    reason: String,
    repository: ActivityGetThreadResponseRepository,
    subject: ActivityGetThreadResponseSubject,
    unread: Boolean,
    updated_at: String,
    url: String
  ): ActivityGetThreadResponse = {
    val __obj = js.Dynamic.literal(id = id, last_read_at = last_read_at, reason = reason, repository = repository, subject = subject, unread = unread, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ActivityGetThreadResponse]
  }
}

