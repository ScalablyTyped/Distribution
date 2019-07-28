package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(commit = commit, created_at = created_at, duration = duration, error = error, pusher = pusher, status = status, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposGetPagesBuildResponse]
  }
}

