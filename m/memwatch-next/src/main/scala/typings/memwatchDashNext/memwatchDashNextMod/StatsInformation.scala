package typings.memwatchDashNext.memwatchDashNextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsInformation extends js.Object {
  var current_base: Double
  var estimated_base: Double
  var heap_compactions: Double
  var max: Double
  var min: Double
  var num_full_gc: Double
  var num_inc_gc: Double
  var usage_trend: Double
}

object StatsInformation {
  @scala.inline
  def apply(
    current_base: Double,
    estimated_base: Double,
    heap_compactions: Double,
    max: Double,
    min: Double,
    num_full_gc: Double,
    num_inc_gc: Double,
    usage_trend: Double
  ): StatsInformation = {
    val __obj = js.Dynamic.literal(current_base = current_base.asInstanceOf[js.Any], estimated_base = estimated_base.asInstanceOf[js.Any], heap_compactions = heap_compactions.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], num_full_gc = num_full_gc.asInstanceOf[js.Any], num_inc_gc = num_inc_gc.asInstanceOf[js.Any], usage_trend = usage_trend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsInformation]
  }
}

