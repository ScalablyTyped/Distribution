package typings.opentelemetryApi

import typings.opentelemetryApi.batchObserverResultMod.BatchObserverResult
import typings.opentelemetryApi.metricMod.BatchMetricOptions
import typings.opentelemetryApi.metricMod.BatchObserver
import typings.opentelemetryApi.metricMod.Counter
import typings.opentelemetryApi.metricMod.MetricOptions
import typings.opentelemetryApi.metricMod.UpDownCounter
import typings.opentelemetryApi.metricMod.ValueObserver
import typings.opentelemetryApi.metricMod.ValueRecorder
import typings.opentelemetryApi.observerResultMod.ObserverResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meterMod {
  
  @js.native
  trait Meter extends StObject {
    
    /**
      * Creates a new `BatchObserver` metric, can be used to update many metrics
      * at the same time and when operations needs to be async
      * @param name the name of the metric.
      * @param callback the batch observer callback
      * @param [options] the metric batch options.
      */
    def createBatchObserver(name: String, callback: js.Function1[/* batchObserverResult */ BatchObserverResult, Unit]): BatchObserver = js.native
    def createBatchObserver(
      name: String,
      callback: js.Function1[/* batchObserverResult */ BatchObserverResult, Unit],
      options: BatchMetricOptions
    ): BatchObserver = js.native
    
    /**
      * Creates a new `Counter` metric. Generally, this kind of metric when the
      * value is a quantity, the sum is of primary interest, and the event count
      * and value distribution are not of primary interest.
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createCounter(name: String): Counter = js.native
    def createCounter(name: String, options: MetricOptions): Counter = js.native
    
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
    def createUpDownCounter(name: String): UpDownCounter = js.native
    def createUpDownCounter(name: String, options: MetricOptions): UpDownCounter = js.native
    
    /**
      * Creates a new `ValueObserver` metric.
      * @param name the name of the metric.
      * @param [options] the metric options.
      * @param [callback] the observer callback
      */
    def createValueObserver(name: String): ValueObserver = js.native
    def createValueObserver(
      name: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* observerResult */ ObserverResult, Unit]
    ): ValueObserver = js.native
    def createValueObserver(name: String, options: MetricOptions): ValueObserver = js.native
    def createValueObserver(
      name: String,
      options: MetricOptions,
      callback: js.Function1[/* observerResult */ ObserverResult, Unit]
    ): ValueObserver = js.native
    
    /**
      * Creates and returns a new `ValueRecorder`.
      * @param name the name of the metric.
      * @param [options] the metric options.
      */
    def createValueRecorder(name: String): ValueRecorder = js.native
    def createValueRecorder(name: String, options: MetricOptions): ValueRecorder = js.native
  }
}
