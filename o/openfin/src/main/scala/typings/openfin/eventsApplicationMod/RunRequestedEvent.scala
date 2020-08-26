package typings.openfin.eventsApplicationMod

import typings.openfin.applicationMod.ManifestInfo
import typings.openfin.eventsBaseMod.ApplicationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunRequestedEvent[Topic, Type] extends ApplicationEvent[Topic, Type] {
  var manifest: ManifestInfo = js.native
  var userAppConfigArgs: js.Any = js.native
}

object RunRequestedEvent {
  @scala.inline
  def apply[Topic, Type](manifest: ManifestInfo, topic: Topic, `type`: Type, userAppConfigArgs: js.Any, uuid: String): RunRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], userAppConfigArgs = userAppConfigArgs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunRequestedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class RunRequestedEventOps[Self <: RunRequestedEvent[_, _], Topic, Type] (val x: Self with (RunRequestedEvent[Topic, Type])) extends AnyVal {
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
    def setManifest(value: ManifestInfo): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAppConfigArgs(value: js.Any): Self = this.set("userAppConfigArgs", value.asInstanceOf[js.Any])
  }
  
}

