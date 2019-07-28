package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateCommentResponse extends js.Object {
  var body: String
  var created_at: String
  var html_url: String
  var id: Double
  var node_id: String
  var updated_at: String
  var url: String
  var user: IssuesCreateCommentResponseUser
}

object IssuesCreateCommentResponse {
  @scala.inline
  def apply(
    body: String,
    created_at: String,
    html_url: String,
    id: Double,
    node_id: String,
    updated_at: String,
    url: String,
    user: IssuesCreateCommentResponseUser
  ): IssuesCreateCommentResponse = {
    val __obj = js.Dynamic.literal(body = body, created_at = created_at, html_url = html_url, id = id, node_id = node_id, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssuesCreateCommentResponse]
  }
}

