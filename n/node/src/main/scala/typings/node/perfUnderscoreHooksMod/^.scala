package typings.node.perfUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("perf_hooks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val performance: Performance = js.native
  def monitorEventLoopDelay(): EventLoopDelayMonitor = js.native
  def monitorEventLoopDelay(options: EventLoopMonitorOptions): EventLoopDelayMonitor = js.native
}

