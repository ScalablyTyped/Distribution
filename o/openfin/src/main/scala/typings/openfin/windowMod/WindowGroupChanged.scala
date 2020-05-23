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

trait WindowGroupChanged[Topic, Type] extends WindowEvent[Topic, Type] {
  var memberOf: source | target | nothing
  var reason: leave | join | merge | disband
  var sourceGroup: js.Array[AppUuid]
  var sourceWindowAppUuid: String
  var sourceWindowName: String
  var targetGroup: js.Array[AppUuid]
  var targetWindowAppUuid: String
  var targetWindowName: String
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
}

