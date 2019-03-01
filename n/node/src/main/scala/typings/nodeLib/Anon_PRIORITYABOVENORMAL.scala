package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PRIORITYABOVENORMAL extends js.Object {
  var PRIORITY_ABOVE_NORMAL: scala.Double
  var PRIORITY_BELOW_NORMAL: scala.Double
  var PRIORITY_HIGH: scala.Double
  var PRIORITY_HIGHEST: scala.Double
  var PRIORITY_LOW: scala.Double
  var PRIORITY_NORMAL: scala.Double
}

object Anon_PRIORITYABOVENORMAL {
  @scala.inline
  def apply(
    PRIORITY_ABOVE_NORMAL: scala.Double,
    PRIORITY_BELOW_NORMAL: scala.Double,
    PRIORITY_HIGH: scala.Double,
    PRIORITY_HIGHEST: scala.Double,
    PRIORITY_LOW: scala.Double,
    PRIORITY_NORMAL: scala.Double
  ): Anon_PRIORITYABOVENORMAL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PRIORITY_ABOVE_NORMAL")(PRIORITY_ABOVE_NORMAL)
    __obj.updateDynamic("PRIORITY_BELOW_NORMAL")(PRIORITY_BELOW_NORMAL)
    __obj.updateDynamic("PRIORITY_HIGH")(PRIORITY_HIGH)
    __obj.updateDynamic("PRIORITY_HIGHEST")(PRIORITY_HIGHEST)
    __obj.updateDynamic("PRIORITY_LOW")(PRIORITY_LOW)
    __obj.updateDynamic("PRIORITY_NORMAL")(PRIORITY_NORMAL)
    __obj.asInstanceOf[Anon_PRIORITYABOVENORMAL]
  }
}

