package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import typings.octokitTypes.anon.MessageString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestPagesBuildResponseData extends js.Object {
  var commit: String
  var created_at: String
  var duration: Double
  var error: MessageString
  var pusher: Eventsurl
  var status: String
  var updated_at: String
  var url: String
}

object ReposGetLatestPagesBuildResponseData {
  @scala.inline
  def apply(
    commit: String,
    created_at: String,
    duration: Double,
    error: MessageString,
    pusher: Eventsurl,
    status: String,
    updated_at: String,
    url: String
  ): ReposGetLatestPagesBuildResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetLatestPagesBuildResponseData]
  }
}

