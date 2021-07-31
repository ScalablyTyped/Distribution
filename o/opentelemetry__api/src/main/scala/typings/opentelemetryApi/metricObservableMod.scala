package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricObservableMod {
  
  @js.native
  trait MetricObservable extends StObject {
    
    /**
      * Sets the next value for observable metric
      * @param value
      */
    def next(value: Double): Unit = js.native
    
    /**
      * Subscribes for every value change
      * @param callback
      */
    def subscribe(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
    
    /**
      * Removes the subscriber
      * @param [callback]
      */
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
  }
}
