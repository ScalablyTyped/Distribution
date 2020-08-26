package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinNumbers.`0`
import typings.openfin.openfinNumbers.`1`
import typings.openfin.openfinNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowBoundsChange[Topic, Type] extends WindowEvent[Topic, Type] {
  var changeType: `0` | `1` | `2` = js.native
  var deferred: Boolean = js.native
  var height: Double = js.native
  var left: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
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
  @scala.inline
  implicit class WindowBoundsChangeOps[Self <: WindowBoundsChange[_, _], Topic, Type] (val x: Self with (WindowBoundsChange[Topic, Type])) extends AnyVal {
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
    def setChangeType(value: `0` | `1` | `2`): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

