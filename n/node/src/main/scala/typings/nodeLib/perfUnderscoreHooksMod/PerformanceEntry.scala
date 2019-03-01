package typings
package nodeLib.perfUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceEntry extends js.Object {
  /**
    * The total number of milliseconds elapsed for this entry.
    * This value will not be meaningful for all Performance Entry types.
    */
  val duration: scala.Double
  /**
    * The type of the performance entry.
    * Currently it may be one of: 'node', 'mark', 'measure', 'gc', or 'function'.
    */
  val entryType: java.lang.String
  /**
    * When performanceEntry.entryType is equal to 'gc', the performance.kind property identifies
    * the type of garbage collection operation that occurred.
    * The value may be one of perf_hooks.constants.
    */
  val kind: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the performance entry.
    */
  val name: java.lang.String
  /**
    * The high resolution millisecond timestamp marking the starting time of the Performance Entry.
    */
  val startTime: scala.Double
}

object PerformanceEntry {
  @scala.inline
  def apply(
    duration: scala.Double,
    entryType: java.lang.String,
    name: java.lang.String,
    startTime: scala.Double,
    kind: scala.Int | scala.Double = null
  ): PerformanceEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("entryType")(entryType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("startTime")(startTime)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEntry]
  }
}

