package typings.node.traceUnderscoreEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Tracing` object is used to enable or disable tracing for sets of
  * categories. Instances are created using the
  * `trace_events.createTracing()` method.
  *
  * When created, the `Tracing` object is disabled. Calling the
  * `tracing.enable()` method adds the categories to the set of enabled trace
  * event categories. Calling `tracing.disable()` will remove the categories
  * from the set of enabled trace event categories.
  */
trait Tracing extends js.Object {
  /**
    * A comma-separated list of the trace event categories covered by this
    * `Tracing` object.
    */
  val categories: java.lang.String
  /**
    * `true` only if the `Tracing` object has been enabled.
    */
  val enabled: Boolean
  /**
    * Disables this `Tracing` object.
    *
    * Only trace event categories _not_ covered by other enabled `Tracing`
    * objects and _not_ specified by the `--trace-event-categories` flag
    * will be disabled.
    */
  def disable(): Unit
  /**
    * Enables this `Tracing` object for the set of categories covered by
    * the `Tracing` object.
    */
  def enable(): Unit
}

object Tracing {
  @scala.inline
  def apply(categories: java.lang.String, disable: () => Unit, enable: () => Unit, enabled: Boolean): Tracing = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tracing]
  }
}

