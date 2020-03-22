package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.openfinNumbers.`0`
import typings.openfin.openfinNumbers.`1`
import typings.openfin.openfinNumbers.`2`
import typings.openfin.shapesMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrayIconClicked[Topic, Type] extends ApplicationEvent[Topic, Type] {
  var bounds: Bounds
  var button: `0` | `1` | `2`
  var monitorInfo: js.Any
  var x: Double
  var y: Double
}

object TrayIconClicked {
  @scala.inline
  def apply[Topic, Type](
    bounds: Bounds,
    button: `0` | `1` | `2`,
    monitorInfo: js.Any,
    topic: Topic,
    `type`: Type,
    uuid: String,
    x: Double,
    y: Double
  ): TrayIconClicked[Topic, Type] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayIconClicked[Topic, Type]]
  }
}

