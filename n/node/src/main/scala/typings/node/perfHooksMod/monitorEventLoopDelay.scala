package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("perf_hooks", "monitorEventLoopDelay")
@js.native
object monitorEventLoopDelay extends js.Object {
  def apply(): EventLoopDelayMonitor = js.native
  def apply(options: EventLoopMonitorOptions): EventLoopDelayMonitor = js.native
}

