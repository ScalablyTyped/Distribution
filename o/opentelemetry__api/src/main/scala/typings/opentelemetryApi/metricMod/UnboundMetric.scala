package typings.opentelemetryApi.metricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnboundMetric[T] extends Metric {
  
  /**
    * Returns a Instrument associated with specified Labels.
    * It is recommended to keep a reference to the Instrument instead of always
    * calling this method for every operations.
    * @param labels key-values pairs that are associated with a specific metric
    *     that you want to record.
    */
  def bind(labels: Labels): T = js.native
  
  /**
    * Removes the Instrument from the metric, if it is present.
    * @param labels key-values pairs that are associated with a specific metric.
    */
  def unbind(labels: Labels): Unit = js.native
}
object UnboundMetric {
  
  @scala.inline
  def apply[T](bind: Labels => T, clear: () => Unit, unbind: Labels => Unit): UnboundMetric[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), clear = js.Any.fromFunction0(clear), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[UnboundMetric[T]]
  }
  
  @scala.inline
  implicit class UnboundMetricOps[Self <: UnboundMetric[_], T] (val x: Self with UnboundMetric[T]) extends AnyVal {
    
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
    def setBind(value: Labels => T): Self = this.set("bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbind(value: Labels => Unit): Self = this.set("unbind", js.Any.fromFunction1(value))
  }
}
