package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current_base")(current_base)
    __obj.updateDynamic("estimated_base")(estimated_base)
    __obj.updateDynamic("heap_compactions")(heap_compactions)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("num_full_gc")(num_full_gc)
    __obj.updateDynamic("num_inc_gc")(num_inc_gc)
    __obj.updateDynamic("usage_trend")(usage_trend)
    __obj.asInstanceOf[StatsInformation]
  }
}

