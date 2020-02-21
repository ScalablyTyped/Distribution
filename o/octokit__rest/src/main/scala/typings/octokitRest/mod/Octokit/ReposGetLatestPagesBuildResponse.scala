package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestPagesBuildResponse extends js.Object {
  var commit: String
  var created_at: String
  var duration: Double
  var error: ReposGetLatestPagesBuildResponseError
  var pusher: ReposGetLatestPagesBuildResponsePusher
  var status: String
  var updated_at: String
  var url: String
}

object ReposGetLatestPagesBuildResponse {
  @scala.inline
  def apply(
    commit: String,
    created_at: String,
    duration: Double,
    error: ReposGetLatestPagesBuildResponseError,
    pusher: ReposGetLatestPagesBuildResponsePusher,
    status: String,
    updated_at: String,
    url: String
  ): ReposGetLatestPagesBuildResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetLatestPagesBuildResponse]
  }
}

