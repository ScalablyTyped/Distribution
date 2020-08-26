package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Code
import typings.octokitTypes.anon.Insecuressl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateWebhookResponseData extends js.Object {
  var active: Boolean = js.native
  var config: Insecuressl = js.native
  var created_at: String = js.native
  var events: js.Array[String] = js.native
  var id: Double = js.native
  var last_response: Code = js.native
  var name: String = js.native
  var ping_url: String = js.native
  var test_url: String = js.native
  var `type`: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object ReposCreateWebhookResponseData {
  @scala.inline
  def apply(
    active: Boolean,
    config: Insecuressl,
    created_at: String,
    events: js.Array[String],
    id: Double,
    last_response: Code,
    name: String,
    ping_url: String,
    test_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): ReposCreateWebhookResponseData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_response = last_response.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ping_url = ping_url.asInstanceOf[js.Any], test_url = test_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateWebhookResponseData]
  }
  @scala.inline
  implicit class ReposCreateWebhookResponseDataOps[Self <: ReposCreateWebhookResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: Insecuressl): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_response(value: Code): Self = this.set("last_response", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPing_url(value: String): Self = this.set("ping_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest_url(value: String): Self = this.set("test_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

