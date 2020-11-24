package typings.opentelemetryApi.metricMod

import typings.opentelemetryApi.anon.Observer
import typings.opentelemetryApi.boundInstrumentMod.BoundBaseObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseObserver extends UnboundMetric[BoundBaseObserver] {
  
  def observation(value: Double): Observer = js.native
}
object BaseObserver {
  
  @scala.inline
  def apply(
    bind: Labels => BoundBaseObserver,
    clear: () => Unit,
    observation: Double => Observer,
    unbind: Labels => Unit
  ): BaseObserver = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), clear = js.Any.fromFunction0(clear), observation = js.Any.fromFunction1(observation), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[BaseObserver]
  }
  
  @scala.inline
  implicit class BaseObserverOps[Self <: BaseObserver] (val x: Self) extends AnyVal {
    
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
    def setObservation(value: Double => Observer): Self = this.set("observation", js.Any.fromFunction1(value))
  }
}
