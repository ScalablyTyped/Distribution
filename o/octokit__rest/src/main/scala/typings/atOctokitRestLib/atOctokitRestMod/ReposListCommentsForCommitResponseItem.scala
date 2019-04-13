package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommentsForCommitResponseItem extends js.Object {
  var body: java.lang.String
  var commit_id: java.lang.String
  var created_at: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var line: scala.Double
  var node_id: java.lang.String
  var path: java.lang.String
  var position: scala.Double
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: ReposListCommentsForCommitResponseItemUser
}

object ReposListCommentsForCommitResponseItem {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_id: java.lang.String,
    created_at: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    line: scala.Double,
    node_id: java.lang.String,
    path: java.lang.String,
    position: scala.Double,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: ReposListCommentsForCommitResponseItemUser
  ): ReposListCommentsForCommitResponseItem = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, created_at = created_at, html_url = html_url, id = id, line = line, node_id = node_id, path = path, position = position, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[ReposListCommentsForCommitResponseItem]
  }
}

