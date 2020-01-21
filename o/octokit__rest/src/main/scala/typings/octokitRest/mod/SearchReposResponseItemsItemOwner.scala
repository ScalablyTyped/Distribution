package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposResponseItemsItemOwner extends js.Object {
  var avatar_url: String
  var gravatar_id: String
  var id: Double
  var login: String
  var node_id: String
  var received_events_url: String
  var `type`: String
  var url: String
}

object SearchReposResponseItemsItemOwner {
  @scala.inline
  def apply(
    avatar_url: String,
    gravatar_id: String,
    id: Double,
    login: String,
    node_id: String,
    received_events_url: String,
    `type`: String,
    url: String
  ): SearchReposResponseItemsItemOwner = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposResponseItemsItemOwner]
  }
}

