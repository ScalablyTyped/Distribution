package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsResponseItem extends js.Object {
  var body: java.lang.String
  var created_at: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: IssuesListCommentsResponseItemUser
}

object IssuesListCommentsResponseItem {
  @scala.inline
  def apply(
    body: java.lang.String,
    created_at: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: IssuesListCommentsResponseItemUser
  ): IssuesListCommentsResponseItem = {
    val __obj = js.Dynamic.literal(body = body, created_at = created_at, html_url = html_url, id = id, node_id = node_id, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssuesListCommentsResponseItem]
  }
}

