package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceEntry extends js.Object {
  /**
    * The total number of milliseconds elapsed for this entry.
    * This value will not be meaningful for all Performance Entry types.
    */
  val duration: Double = js.native
  /**
    * The type of the performance entry.
    * Currently it may be one of: 'node', 'mark', 'measure', 'gc', or 'function'.
    */
  val entryType: EntryType = js.native
  /**
    * When `performanceEntry.entryType` is equal to 'gc', the `performance.flags`
    * property contains additional information about garbage collection operation.
    * See perf_hooks.constants for valid values.
    */
  val flags: js.UndefOr[Double] = js.native
  /**
    * When `performanceEntry.entryType` is equal to 'gc', `the performance.kind` property identifies
    * the type of garbage collection operation that occurred.
    * See perf_hooks.constants for valid values.
    */
  val kind: js.UndefOr[Double] = js.native
  /**
    * The name of the performance entry.
    */
  val name: String = js.native
  /**
    * The high resolution millisecond timestamp marking the starting time of the Performance Entry.
    */
  val startTime: Double = js.native
}

object PerformanceEntry {
  @scala.inline
  def apply(duration: Double, entryType: EntryType, name: String, startTime: Double): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEntry]
  }
  @scala.inline
  implicit class PerformanceEntryOps[Self <: PerformanceEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryType(value: EntryType): Self = this.set("entryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setKind(value: Double): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

