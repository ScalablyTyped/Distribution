package typings.openfin.eventsApplicationMod

import typings.openfin.applicationMod.ManifestInfo
import typings.openfin.eventsBaseMod.ApplicationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunRequestedEvent[Topic, Type] extends ApplicationEvent[Topic, Type] {
  var manifest: ManifestInfo
  var userAppConfigArgs: js.Any
}

object RunRequestedEvent {
  @scala.inline
  def apply[Topic, Type](manifest: ManifestInfo, topic: Topic, `type`: Type, userAppConfigArgs: js.Any, uuid: String): RunRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], userAppConfigArgs = userAppConfigArgs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunRequestedEvent[Topic, Type]]
  }
}

