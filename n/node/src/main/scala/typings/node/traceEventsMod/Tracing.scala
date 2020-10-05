package typings.node.traceEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Tracing extends js.Object {
  /**
    * A comma-separated list of the trace event categories covered by this
    * `Tracing` object.
    */
  val categories: String = js.native
  /**
    * `true` only if the `Tracing` object has been enabled.
    */
  val enabled: Boolean = js.native
  /**
    * Disables this `Tracing` object.
    *
    * Only trace event categories _not_ covered by other enabled `Tracing`
    * objects and _not_ specified by the `--trace-event-categories` flag
    * will be disabled.
    */
  def disable(): Unit = js.native
  /**
    * Enables this `Tracing` object for the set of categories covered by
    * the `Tracing` object.
    */
  def enable(): Unit = js.native
}

object Tracing {
  @scala.inline
  def apply(categories: String, disable: () => Unit, enable: () => Unit, enabled: Boolean): Tracing = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
  @scala.inline
  implicit class TracingOps[Self <: Tracing] (val x: Self) extends AnyVal {
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
    def setCategories(value: String): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

