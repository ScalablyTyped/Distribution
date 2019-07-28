package typings.nodeDashHueDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bridge extends js.Object {
  var bridge: Boolean
  var lights: js.Array[String]
  var sensors: js.Array[String]
}

object Anon_Bridge {
  @scala.inline
  def apply(bridge: Boolean, lights: js.Array[String], sensors: js.Array[String]): Anon_Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge, lights = lights, sensors = sensors)
  
    __obj.asInstanceOf[Anon_Bridge]
  }
}

