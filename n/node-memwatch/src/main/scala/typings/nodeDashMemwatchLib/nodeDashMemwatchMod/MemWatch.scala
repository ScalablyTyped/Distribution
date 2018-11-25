package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemWatch
  extends eventsLib.eventsMod.EventEmitter {
  var HeapDiff: ScalablyTyped.runtime.Instantiable0[HeapDiff] = js.native
  /**
       * Force V8 to do a full GC and heap compaction.
       *
       * It's intended to be used for debugging. Calling it in production is highly discouraged.
       */
  def gc(): scala.Unit = js.native
  @JSName("on")
  def on_leak(
    eventName: nodeDashMemwatchLib.nodeDashMemwatchLibStrings.leak,
    callback: js.Function1[/* event */ LeakInformation, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stats(
    eventName: nodeDashMemwatchLib.nodeDashMemwatchLibStrings.stats,
    callback: js.Function1[/* event */ StatsInformation, scala.Unit]
  ): this.type = js.native
}

