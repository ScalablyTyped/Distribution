package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPagesBuildsResponseItem extends js.Object {
  var commit: String
  var created_at: String
  var duration: Double
  var error: ReposListPagesBuildsResponseItemError
  var pusher: ReposListPagesBuildsResponseItemPusher
  var status: String
  var updated_at: String
  var url: String
}

object ReposListPagesBuildsResponseItem {
  @scala.inline
  def apply(
    commit: String,
    created_at: String,
    duration: Double,
    error: ReposListPagesBuildsResponseItemError,
    pusher: ReposListPagesBuildsResponseItemPusher,
    status: String,
    updated_at: String,
    url: String
  ): ReposListPagesBuildsResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit, created_at = created_at, duration = duration, error = error, pusher = pusher, status = status, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposListPagesBuildsResponseItem]
  }
}

