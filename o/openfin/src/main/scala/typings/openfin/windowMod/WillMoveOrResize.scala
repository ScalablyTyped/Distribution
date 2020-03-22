package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WillMoveOrResize[Topic, Type] extends WindowEvent[Topic, Type] {
  var height: Double
  var left: Double
  var monitorScaleFactor: Double
  var top: Double
  var width: Double
}

object WillMoveOrResize {
  @scala.inline
  def apply[Topic, Type](
    height: Double,
    left: Double,
    monitorScaleFactor: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double
  ): WillMoveOrResize[Topic, Type] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], monitorScaleFactor = monitorScaleFactor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillMoveOrResize[Topic, Type]]
  }
}

