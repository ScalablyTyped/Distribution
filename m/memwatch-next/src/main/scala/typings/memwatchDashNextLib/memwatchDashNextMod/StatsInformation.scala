package typings
package memwatchDashNextLib.memwatchDashNextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsInformation extends js.Object {
  var current_base: scala.Double
  var estimated_base: scala.Double
  var heap_compactions: scala.Double
  var max: scala.Double
  var min: scala.Double
  var num_full_gc: scala.Double
  var num_inc_gc: scala.Double
  var usage_trend: scala.Double
}

object StatsInformation {
  @scala.inline
  def apply(
    current_base: scala.Double,
    estimated_base: scala.Double,
    heap_compactions: scala.Double,
    max: scala.Double,
    min: scala.Double,
    num_full_gc: scala.Double,
    num_inc_gc: scala.Double,
    usage_trend: scala.Double
  ): StatsInformation = {
    val __obj = js.Dynamic.literal(current_base = current_base, estimated_base = estimated_base, heap_compactions = heap_compactions, max = max, min = min, num_full_gc = num_full_gc, num_inc_gc = num_inc_gc, usage_trend = usage_trend)
  
    __obj.asInstanceOf[StatsInformation]
  }
}

