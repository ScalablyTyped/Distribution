package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateHookResponse extends js.Object {
  var active: Boolean
  var config: OrgsCreateHookResponseConfig
  var created_at: String
  var events: js.Array[String]
  var id: Double
  var name: String
  var ping_url: String
  var updated_at: String
  var url: String
}

object OrgsCreateHookResponse {
  @scala.inline
  def apply(
    active: Boolean,
    config: OrgsCreateHookResponseConfig,
    created_at: String,
    events: js.Array[String],
    id: Double,
    name: String,
    ping_url: String,
    updated_at: String,
    url: String
  ): OrgsCreateHookResponse = {
    val __obj = js.Dynamic.literal(active = active, config = config, created_at = created_at, events = events, id = id, name = name, ping_url = ping_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OrgsCreateHookResponse]
  }
}

