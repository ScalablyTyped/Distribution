package typings.opentelemetryApiMetrics

import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.BatchObservableCallback
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Counter
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Histogram
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.MetricAttributes
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.MetricOptions
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Observable
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.ObservableCounter
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.ObservableGauge
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.ObservableUpDownCounter
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.UpDownCounter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMeterMod {
  
  @js.native
  trait Meter extends StObject {
    
    /**
      * Sets up a function that will be called whenever a metric collection is
      * initiated.
      *
      * If the function is already in the list of callbacks for this Observable,
      * the function is not added a second time.
      *
      * Only the associated observables can be observed in the callback.
      * Measurements of observables that are not associated observed in the
      * callback are dropped.
      *
      * @param callback the batch observable callback
      * @param observables the observables associated with this batch observable callback
      */
    def addBatchObservableCallback[AttributesTypes /* <: MetricAttributes */](
      callback: BatchObservableCallback[AttributesTypes],
      observables: js.Array[Observable[AttributesTypes]]
    ): Unit = js.native
    
    /**
      * Creates a new `Counter` metric. Generally, this kind of metric when the
      * value is a quantity, the sum is of primary interest, and the event count
      * and value distribution are not of primary interest.
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createCounter[AttributesTypes /* <: MetricAttributes */](name: String): Counter[AttributesTypes] = js.native
    def createCounter[AttributesTypes /* <: MetricAttributes */](name: String, options: MetricOptions): Counter[AttributesTypes] = js.native
    
    /**
      * Creates and returns a new `Histogram`.
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createHistogram[AttributesTypes /* <: MetricAttributes */](name: String): Histogram[AttributesTypes] = js.native
    def createHistogram[AttributesTypes /* <: MetricAttributes */](name: String, options: MetricOptions): Histogram[AttributesTypes] = js.native
    
    /**
      * Creates a new `ObservableCounter` metric.
      *
      * The callback SHOULD be safe to be invoked concurrently.
      *
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createObservableCounter[AttributesTypes /* <: MetricAttributes */](name: String): ObservableCounter[AttributesTypes] = js.native
    def createObservableCounter[AttributesTypes /* <: MetricAttributes */](name: String, options: MetricOptions): ObservableCounter[AttributesTypes] = js.native
    
    /**
      * Creates a new `ObservableGauge` metric.
      *
      * The callback SHOULD be safe to be invoked concurrently.
      *
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createObservableGauge[AttributesTypes /* <: MetricAttributes */](name: String): ObservableGauge[AttributesTypes] = js.native
    def createObservableGauge[AttributesTypes /* <: MetricAttributes */](name: String, options: MetricOptions): ObservableGauge[AttributesTypes] = js.native
    
    /**
      * Creates a new `ObservableUpDownCounter` metric.
      *
      * The callback SHOULD be safe to be invoked concurrently.
      *
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createObservableUpDownCounter[AttributesTypes /* <: MetricAttributes */](name: String): ObservableUpDownCounter[AttributesTypes] = js.native
    def createObservableUpDownCounter[AttributesTypes /* <: MetricAttributes */](name: String, options: MetricOptions): ObservableUpDownCounter[AttributesTypes] = js.native
    
    /**
      * Creates a new `UpDownCounter` metric. UpDownCounter is a synchronous
      * instrument and very similar to Counter except that Add(increment)
      * supports negative increments. It is generally useful for capturing changes
      * in an amount of resources used, or any quantity that rises and falls
      * during a request.
      * Example uses for UpDownCounter:
      * <ol>
      *   <li> count the number of active requests. </li>
      *   <li> count memory in use by instrumenting new and delete. </li>
      *   <li> count queue size by instrumenting enqueue and dequeue. </li>
      *   <li> count semaphore up and down operations. </li>
      * </ol>
      *
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createUpDownCounter[AttributesTypes /* <: MetricAttributes */](name: String): UpDownCounter[AttributesTypes] = js.native
    def createUpDownCounter[AttributesTypes /* <: MetricAttributes */](name: String, options: MetricOptions): UpDownCounter[AttributesTypes] = js.native
    
    /**
      * Removes a callback previously registered with {@link Meter.addBatchObservableCallback}.
      *
      * The callback to be removed is identified using a combination of the callback itself,
      * and the set of the observables associated with it.
      *
      * @param callback the batch observable callback
      * @param observables the observables associated with this batch observable callback
      */
    def removeBatchObservableCallback[AttributesTypes /* <: MetricAttributes */](
      callback: BatchObservableCallback[AttributesTypes],
      observables: js.Array[Observable[AttributesTypes]]
    ): Unit = js.native
  }
  
  trait MeterOptions extends StObject {
    
    /**
      * The schemaUrl of the meter or instrumentation library
      */
    var schemaUrl: js.UndefOr[String] = js.undefined
  }
  object MeterOptions {
    
    inline def apply(): MeterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeterOptions]
    }
    
    extension [Self <: MeterOptions](x: Self) {
      
      inline def setSchemaUrl(value: String): Self = StObject.set(x, "schemaUrl", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrlUndefined: Self = StObject.set(x, "schemaUrl", js.undefined)
    }
  }
}
