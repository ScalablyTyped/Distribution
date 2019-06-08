package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookResponse extends js.Object {
  var active: scala.Boolean
  var config: ReposUpdateHookResponseConfig
  var created_at: java.lang.String
  var events: js.Array[java.lang.String]
  var id: scala.Double
  var last_response: ReposUpdateHookResponseLastResponse
  var name: java.lang.String
  var ping_url: java.lang.String
  var test_url: java.lang.String
  var `type`: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ReposUpdateHookResponse {
  @scala.inline
  def apply(
    active: scala.Boolean,
    config: ReposUpdateHookResponseConfig,
    created_at: java.lang.String,
    events: js.Array[java.lang.String],
    id: scala.Double,
    last_response: ReposUpdateHookResponseLastResponse,
    name: java.lang.String,
    ping_url: java.lang.String,
    test_url: java.lang.String,
    `type`: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ReposUpdateHookResponse = {
    val __obj = js.Dynamic.literal(active = active, config = config, created_at = created_at, events = events, id = id, last_response = last_response, name = name, ping_url = ping_url, test_url = test_url, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposUpdateHookResponse]
  }
}

