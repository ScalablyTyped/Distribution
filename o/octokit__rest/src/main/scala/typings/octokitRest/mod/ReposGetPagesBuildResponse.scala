package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesBuildResponse extends js.Object {
  var commit: String
  var created_at: String
  var duration: Double
  var error: ReposGetPagesBuildResponseError
  var pusher: ReposGetPagesBuildResponsePusher
  var status: String
  var updated_at: String
  var url: String
}

object ReposGetPagesBuildResponse {
  @scala.inline
  def apply(
    commit: String,
    created_at: String,
    duration: Double,
    error: ReposGetPagesBuildResponseError,
    pusher: ReposGetPagesBuildResponsePusher,
    status: String,
    updated_at: String,
    url: String
  ): ReposGetPagesBuildResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetPagesBuildResponse]
  }
}

