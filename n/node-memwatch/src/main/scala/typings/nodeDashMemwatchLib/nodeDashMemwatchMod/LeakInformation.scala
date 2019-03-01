package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeakInformation extends js.Object {
  /**
    * Amount of heap growth in bytes.
    */
  var growth: scala.Double
  /**
    * Human-readable description.
    */
  var reason: java.lang.String
}

object LeakInformation {
  @scala.inline
  def apply(growth: scala.Double, reason: java.lang.String): LeakInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("growth")(growth)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[LeakInformation]
  }
}

