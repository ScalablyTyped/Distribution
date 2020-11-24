package typings.opentelemetryApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/metrics/MetricObservable", JSImport.Namespace)
@js.native
object metricObservableMod extends js.Object {
  
  @js.native
  trait MetricObservable extends js.Object {
    
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
