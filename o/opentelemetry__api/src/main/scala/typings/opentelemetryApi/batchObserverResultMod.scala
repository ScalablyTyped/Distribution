package typings.opentelemetryApi

import typings.opentelemetryApi.metricMod.Labels
import typings.opentelemetryApi.observationMod.Observation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchObserverResultMod {
  
  @js.native
  trait BatchObserverResult extends StObject {
    
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
    implicit class BatchObserverResultMutableBuilder[Self <: BatchObserverResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserve(value: (Labels, js.Array[Observation]) => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction2(value))
    }
  }
}
