package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestPagesBuildResponse extends js.Object {
  var commit: java.lang.String
  var created_at: java.lang.String
  var duration: scala.Double
  var error: ReposGetLatestPagesBuildResponseError
  var pusher: ReposGetLatestPagesBuildResponsePusher
  var status: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ReposGetLatestPagesBuildResponse {
  @scala.inline
  def apply(
    commit: java.lang.String,
    created_at: java.lang.String,
    duration: scala.Double,
    error: ReposGetLatestPagesBuildResponseError,
    pusher: ReposGetLatestPagesBuildResponsePusher,
    status: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ReposGetLatestPagesBuildResponse = {
    val __obj = js.Dynamic.literal(commit = commit, created_at = created_at, duration = duration, error = error, pusher = pusher, status = status, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposGetLatestPagesBuildResponse]
  }
}

