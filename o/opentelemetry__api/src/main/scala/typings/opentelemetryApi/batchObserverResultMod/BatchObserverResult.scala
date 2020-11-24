package typings.opentelemetryApi.batchObserverResultMod

import typings.opentelemetryApi.metricMod.Labels
import typings.opentelemetryApi.observationMod.Observation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchObserverResult extends js.Object {
  
  /**
    * Used to observe (update) observations for certain labels
    * @param labels
    * @param observations
    */
  def observe(labels: Labels, observations: js.Array[Observation]): Unit = js.native
}
object BatchObserverResult {
  
  @scala.inline
  def apply(observe: (Labels, js.Array[Observation]) => Unit): BatchObserverResult = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction2(observe))
    __obj.asInstanceOf[BatchObserverResult]
  }
  
  @scala.inline
  implicit class BatchObserverResultOps[Self <: BatchObserverResult] (val x: Self) extends AnyVal {
    
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
    def setObserve(value: (Labels, js.Array[Observation]) => Unit): Self = this.set("observe", js.Any.fromFunction2(value))
  }
}
