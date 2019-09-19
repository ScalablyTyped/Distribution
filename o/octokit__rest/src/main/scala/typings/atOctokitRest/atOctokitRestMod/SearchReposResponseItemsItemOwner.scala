package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, gravatar_id = gravatar_id, id = id, login = login, node_id = node_id, received_events_url = received_events_url, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchReposResponseItemsItemOwner]
  }
}

