package typings.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBridge extends js.Object {
  var bridge: Boolean
  var lights: js.Array[String]
  var sensors: js.Array[String]
}

object AnonBridge {
  @scala.inline
  def apply(bridge: Boolean, lights: js.Array[String], sensors: js.Array[String]): AnonBridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], sensors = sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBridge]
  }
}

