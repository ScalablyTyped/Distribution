package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceEntry extends js.Object {
  /**
    * The total number of milliseconds elapsed for this entry.
    * This value will not be meaningful for all Performance Entry types.
    */
  val duration: Double
  /**
    * The type of the performance entry.
    * Currently it may be one of: 'node', 'mark', 'measure', 'gc', or 'function'.
    */
  val entryType: EntryType
  /**
    * When `performanceEntry.entryType` is equal to 'gc', the `performance.flags`
    * property contains additional information about garbage collection operation.
    * See perf_hooks.constants for valid values.
    */
  val flags: js.UndefOr[Double] = js.undefined
  /**
    * When `performanceEntry.entryType` is equal to 'gc', `the performance.kind` property identifies
    * the type of garbage collection operation that occurred.
    * See perf_hooks.constants for valid values.
    */
  val kind: js.UndefOr[Double] = js.undefined
  /**
    * The name of the performance entry.
    */
  val name: String
  /**
    * The high resolution millisecond timestamp marking the starting time of the Performance Entry.
    */
  val startTime: Double
}

object PerformanceEntry {
  @scala.inline
  def apply(
    duration: Double,
    entryType: EntryType,
    name: String,
    startTime: Double,
    flags: Int | Double = null,
    kind: Int | Double = null
  ): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEntry]
  }
}

