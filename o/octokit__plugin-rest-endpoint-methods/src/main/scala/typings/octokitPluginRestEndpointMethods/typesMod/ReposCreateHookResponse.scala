package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookResponse extends js.Object {
  var active: Boolean
  var config: ReposCreateHookResponseConfig
  var created_at: String
  var events: js.Array[String]
  var id: Double
  var last_response: ReposCreateHookResponseLastResponse
  var name: String
  var ping_url: String
  var test_url: String
  var `type`: String
  var updated_at: String
  var url: String
}

object ReposCreateHookResponse {
  @scala.inline
  def apply(
    active: Boolean,
    config: ReposCreateHookResponseConfig,
    created_at: String,
    events: js.Array[String],
    id: Double,
    last_response: ReposCreateHookResponseLastResponse,
    name: String,
    ping_url: String,
    test_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): ReposCreateHookResponse = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_response = last_response.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ping_url = ping_url.asInstanceOf[js.Any], test_url = test_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateHookResponse]
  }
}

