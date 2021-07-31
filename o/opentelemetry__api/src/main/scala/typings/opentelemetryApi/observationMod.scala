package typings.opentelemetryApi

import typings.opentelemetryApi.metricMod.BaseObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observationMod {
  
  trait Observation extends StObject {
    
    var observer: BaseObserver
    
    var value: Double
  }
  object Observation {
    
    @scala.inline
    def apply(observer: BaseObserver, value: Double): Observation = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observation]
    }
    
    @scala.inline
    implicit class ObservationMutableBuilder[Self <: Observation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserver(value: BaseObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
