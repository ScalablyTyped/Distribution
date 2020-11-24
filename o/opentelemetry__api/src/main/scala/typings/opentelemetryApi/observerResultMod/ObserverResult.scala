package typings.opentelemetryApi.observerResultMod

import typings.opentelemetryApi.metricMod.Labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverResult extends js.Object {
  
  def observe(value: Double, labels: Labels): Unit = js.native
}
object ObserverResult {
  
  @scala.inline
  def apply(observe: (Double, Labels) => Unit): ObserverResult = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction2(observe))
    __obj.asInstanceOf[ObserverResult]
  }
  
  @scala.inline
  implicit class ObserverResultOps[Self <: ObserverResult] (val x: Self) extends AnyVal {
    
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
    def setObserve(value: (Double, Labels) => Unit): Self = this.set("observe", js.Any.fromFunction2(value))
  }
}
