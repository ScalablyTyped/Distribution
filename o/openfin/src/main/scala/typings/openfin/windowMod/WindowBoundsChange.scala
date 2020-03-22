package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinNumbers.`0`
import typings.openfin.openfinNumbers.`1`
import typings.openfin.openfinNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBoundsChange[Topic, Type] extends WindowEvent[Topic, Type] {
  var changeType: `0` | `1` | `2`
  var deferred: Boolean
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object WindowBoundsChange {
  @scala.inline
  def apply[Topic, Type](
    changeType: `0` | `1` | `2`,
    deferred: Boolean,
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double
  ): WindowBoundsChange[Topic, Type] = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBoundsChange[Topic, Type]]
  }
}

