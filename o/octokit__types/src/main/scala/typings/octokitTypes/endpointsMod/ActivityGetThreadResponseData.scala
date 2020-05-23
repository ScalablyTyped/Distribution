package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Latestcommenturl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadResponseData extends js.Object {
  var id: String
  var last_read_at: String
  var reason: String
  var repository: Archiveurl
  var subject: Latestcommenturl
  var unread: Boolean
  var updated_at: String
  var url: String
}

object ActivityGetThreadResponseData {
  @scala.inline
  def apply(
    id: String,
    last_read_at: String,
    reason: String,
    repository: Archiveurl,
    subject: Latestcommenturl,
    unread: Boolean,
    updated_at: String,
    url: String
  ): ActivityGetThreadResponseData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_read_at = last_read_at.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadResponseData]
  }
}

