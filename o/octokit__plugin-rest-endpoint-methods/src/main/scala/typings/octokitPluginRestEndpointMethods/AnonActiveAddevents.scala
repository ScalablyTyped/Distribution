package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveAddevents extends js.Object {
  var active: AnonType
  var add_events: AnonType
  var config: AnonType
  @JSName("config.content_type")
  var configDotcontent_type: AnonType
  @JSName("config.insecure_ssl")
  var configDotinsecure_ssl: AnonType
  @JSName("config.secret")
  var configDotsecret: AnonType
  @JSName("config.url")
  var configDoturl: AnonRequired
  var events: AnonType
  var hook_id: AnonRequired
  var owner: AnonRequired
  var remove_events: AnonType
  var repo: AnonRequired
}

object AnonActiveAddevents {
  @scala.inline
  def apply(
    active: AnonType,
    add_events: AnonType,
    config: AnonType,
    configDotcontent_type: AnonType,
    configDotinsecure_ssl: AnonType,
    configDotsecret: AnonType,
    configDoturl: AnonRequired,
    events: AnonType,
    hook_id: AnonRequired,
    owner: AnonRequired,
    remove_events: AnonType,
    repo: AnonRequired
  ): AnonActiveAddevents = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add_events = add_events.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], remove_events = remove_events.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("config.content_type")(configDotcontent_type.asInstanceOf[js.Any])
    __obj.updateDynamic("config.insecure_ssl")(configDotinsecure_ssl.asInstanceOf[js.Any])
    __obj.updateDynamic("config.secret")(configDotsecret.asInstanceOf[js.Any])
    __obj.updateDynamic("config.url")(configDoturl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveAddevents]
  }
}

