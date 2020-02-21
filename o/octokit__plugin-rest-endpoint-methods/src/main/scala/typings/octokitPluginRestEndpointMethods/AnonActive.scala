package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: AnonType
  var config: AnonRequired
  @JSName("config.content_type")
  var configDotcontent_type: AnonType
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: AnonType
  @JSName("config.secret")
  var configDotsecret: AnonType
  @JSName("config.url")
  var configDoturl: AnonRequired
  var events: AnonType
  var name: AnonRequired
  var org: AnonRequired
}

object AnonActive {
  @scala.inline
  def apply(
    active: AnonType,
    config: AnonRequired,
    configDotcontent_type: AnonType,
    configDotinsecure_ssl: AnonType,
    configDotsecret: AnonType,
    configDoturl: AnonRequired,
    events: AnonType,
    name: AnonRequired,
    org: AnonRequired
  ): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

