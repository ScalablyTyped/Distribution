package typings.opentelemetryApi

import typings.opentelemetryApi.metricMod.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerResultMod {
  
  trait ObserverResult extends StObject {
    
    def observe(value: Double, labels: Labels): Unit
  }
  object ObserverResult {
    
    inline def apply(observe: (Double, Labels) => Unit): ObserverResult = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction2(observe))
      __obj.asInstanceOf[ObserverResult]
    }
    
    extension [Self <: ObserverResult](x: Self) {
      
      inline def setObserve(value: (Double, Labels) => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction2(value))
    }
  }
}
