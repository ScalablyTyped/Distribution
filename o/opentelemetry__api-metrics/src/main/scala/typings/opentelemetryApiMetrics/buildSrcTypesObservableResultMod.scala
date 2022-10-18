package typings.opentelemetryApiMetrics

import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.MetricAttributes
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesObservableResultMod {
  
  @js.native
  trait BatchObservableResult[AttributesTypes /* <: MetricAttributes */] extends StObject {
    
    /**
      * Observe a measurement of the value associated with the given attributes.
      *
      * @param metric The observable metric to be observed.
      * @param value The value to be observed.
      * @param attributes The attributes associated with the value. If more than
      * one values associated with the same attributes values, SDK may pick the
      * last one or simply drop the entire observable result.
      */
    def observe(metric: Observable[AttributesTypes], value: Double): Unit = js.native
    def observe(metric: Observable[AttributesTypes], value: Double, attributes: AttributesTypes): Unit = js.native
  }
  
  @js.native
  trait ObservableResult[AttributesTypes /* <: MetricAttributes */] extends StObject {
    
    /**
      * Observe a measurement of the value associated with the given attributes.
      *
      * @param value The value to be observed.
      * @param attributes The attributes associated with the value. If more than
      * one values associated with the same attributes values, SDK may pick the
      * last one or simply drop the entire observable result.
      */
    def observe(value: Double): Unit = js.native
    def observe(value: Double, attributes: AttributesTypes): Unit = js.native
  }
}
