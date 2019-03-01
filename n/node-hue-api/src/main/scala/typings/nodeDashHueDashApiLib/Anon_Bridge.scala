package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bridge extends js.Object {
  var bridge: scala.Boolean
  var lights: js.Array[java.lang.String]
  var sensors: js.Array[java.lang.String]
}

object Anon_Bridge {
  @scala.inline
  def apply(bridge: scala.Boolean, lights: js.Array[java.lang.String], sensors: js.Array[java.lang.String]): Anon_Bridge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bridge")(bridge)
    __obj.updateDynamic("lights")(lights)
    __obj.updateDynamic("sensors")(sensors)
    __obj.asInstanceOf[Anon_Bridge]
  }
}

