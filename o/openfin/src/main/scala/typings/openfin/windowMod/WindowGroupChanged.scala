package typings.openfin.windowMod

import typings.openfin.anon.AppUuid
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.disband
import typings.openfin.openfinStrings.join
import typings.openfin.openfinStrings.leave
import typings.openfin.openfinStrings.merge
import typings.openfin.openfinStrings.nothing
import typings.openfin.openfinStrings.source
import typings.openfin.openfinStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowGroupChanged[Topic, Type] extends WindowEvent[Topic, Type] {
  var memberOf: source | target | nothing = js.native
  var reason: leave | join | merge | disband = js.native
  var sourceGroup: js.Array[AppUuid] = js.native
  var sourceWindowAppUuid: String = js.native
  var sourceWindowName: String = js.native
  var targetGroup: js.Array[AppUuid] = js.native
  var targetWindowAppUuid: String = js.native
  var targetWindowName: String = js.native
}

object WindowGroupChanged {
  @scala.inline
  def apply[Topic, Type](
    memberOf: source | target | nothing,
    name: String,
    reason: leave | join | merge | disband,
    sourceGroup: js.Array[AppUuid],
    sourceWindowAppUuid: String,
    sourceWindowName: String,
    targetGroup: js.Array[AppUuid],
    targetWindowAppUuid: String,
    targetWindowName: String,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowGroupChanged[Topic, Type] = {
    val __obj = js.Dynamic.literal(memberOf = memberOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceGroup = sourceGroup.asInstanceOf[js.Any], sourceWindowAppUuid = sourceWindowAppUuid.asInstanceOf[js.Any], sourceWindowName = sourceWindowName.asInstanceOf[js.Any], targetGroup = targetGroup.asInstanceOf[js.Any], targetWindowAppUuid = targetWindowAppUuid.asInstanceOf[js.Any], targetWindowName = targetWindowName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowGroupChanged[Topic, Type]]
  }
  @scala.inline
  implicit class WindowGroupChangedOps[Self <: WindowGroupChanged[_, _], Topic, Type] (val x: Self with (WindowGroupChanged[Topic, Type])) extends AnyVal {
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
    def setMemberOf(value: source | target | nothing): Self = this.set("memberOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: leave | join | merge | disband): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceGroupVarargs(value: AppUuid*): Self = this.set("sourceGroup", js.Array(value :_*))
    @scala.inline
    def setSourceGroup(value: js.Array[AppUuid]): Self = this.set("sourceGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceWindowAppUuid(value: String): Self = this.set("sourceWindowAppUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceWindowName(value: String): Self = this.set("sourceWindowName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetGroupVarargs(value: AppUuid*): Self = this.set("targetGroup", js.Array(value :_*))
    @scala.inline
    def setTargetGroup(value: js.Array[AppUuid]): Self = this.set("targetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetWindowAppUuid(value: String): Self = this.set("targetWindowAppUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetWindowName(value: String): Self = this.set("targetWindowName", value.asInstanceOf[js.Any])
  }
  
}

