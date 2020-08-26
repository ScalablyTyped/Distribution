package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDetached[Topic, Type] extends WindowEvent[Topic, Type] {
  var previousTarget: Identity = js.native
  var target: Identity = js.native
  var viewIdentity: Identity = js.native
}

object ViewDetached {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    previousTarget: Identity,
    target: Identity,
    topic: Topic,
    `type`: Type,
    uuid: String,
    viewIdentity: Identity
  ): ViewDetached[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousTarget = previousTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], viewIdentity = viewIdentity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDetached[Topic, Type]]
  }
  @scala.inline
  implicit class ViewDetachedOps[Self <: ViewDetached[_, _], Topic, Type] (val x: Self with (ViewDetached[Topic, Type])) extends AnyVal {
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
    def setPreviousTarget(value: Identity): Self = this.set("previousTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Identity): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewIdentity(value: Identity): Self = this.set("viewIdentity", value.asInstanceOf[js.Any])
  }
  
}

