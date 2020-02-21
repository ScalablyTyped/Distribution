package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesLegacyResponseIssuesItem extends js.Object {
  var body: String
  var comments: Double
  var created_at: String
  var gravatar_id: String
  var html_url: String
  var labels: js.Array[String]
  var number: Double
  var position: Double
  var state: String
  var title: String
  var updated_at: String
  var user: String
  var votes: Double
}

object SearchIssuesLegacyResponseIssuesItem {
  @scala.inline
  def apply(
    body: String,
    comments: Double,
    created_at: String,
    gravatar_id: String,
    html_url: String,
    labels: js.Array[String],
    number: Double,
    position: Double,
    state: String,
    title: String,
    updated_at: String,
    user: String,
    votes: Double
  ): SearchIssuesLegacyResponseIssuesItem = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], votes = votes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIssuesLegacyResponseIssuesItem]
  }
}

