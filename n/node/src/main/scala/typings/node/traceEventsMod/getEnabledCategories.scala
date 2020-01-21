package typings.node.traceEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trace_events", "getEnabledCategories")
@js.native
object getEnabledCategories extends js.Object {
  /**
    * Returns a comma-separated list of all currently-enabled trace event
    * categories. The current set of enabled trace event categories is
    * determined by the union of all currently-enabled `Tracing` objects and
    * any categories enabled using the `--trace-event-categories` flag.
    */
  def apply(): js.UndefOr[String] = js.native
}

