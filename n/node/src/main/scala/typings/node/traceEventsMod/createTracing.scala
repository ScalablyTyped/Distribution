package typings.node.traceEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trace_events", "createTracing")
@js.native
object createTracing extends js.Object {
  /**
    * Creates and returns a Tracing object for the given set of categories.
    */
  def apply(options: CreateTracingOptions): Tracing = js.native
}

