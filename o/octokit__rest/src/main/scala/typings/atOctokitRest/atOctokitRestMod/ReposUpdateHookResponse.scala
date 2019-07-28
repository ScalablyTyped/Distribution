package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookResponse extends js.Object {
  var active: Boolean
  var config: ReposUpdateHookResponseConfig
  var created_at: String
  var events: js.Array[String]
  var id: Double
  var last_response: ReposUpdateHookResponseLastResponse
  var name: String
  var ping_url: String
  var test_url: String
  var `type`: String
  var updated_at: String
  var url: String
}

object ReposUpdateHookResponse {
  @scala.inline
  def apply(
    active: Boolean,
    config: ReposUpdateHookResponseConfig,
    created_at: String,
    events: js.Array[String],
    id: Double,
    last_response: ReposUpdateHookResponseLastResponse,
    name: String,
    ping_url: String,
    test_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): ReposUpdateHookResponse = {
    val __obj = js.Dynamic.literal(active = active, config = config, created_at = created_at, events = events, id = id, last_response = last_response, name = name, ping_url = ping_url, test_url = test_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposUpdateHookResponse]
  }
}

