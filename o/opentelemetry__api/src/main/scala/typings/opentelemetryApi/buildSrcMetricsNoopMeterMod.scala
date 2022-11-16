package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcMetricsMeterMod.Meter
import typings.opentelemetryApi.buildSrcMetricsMetricMod.BatchObservableCallback
import typings.opentelemetryApi.buildSrcMetricsMetricMod.Counter
import typings.opentelemetryApi.buildSrcMetricsMetricMod.Histogram
import typings.opentelemetryApi.buildSrcMetricsMetricMod.MetricAttributes
import typings.opentelemetryApi.buildSrcMetricsMetricMod.Observable
import typings.opentelemetryApi.buildSrcMetricsMetricMod.ObservableCallback
import typings.opentelemetryApi.buildSrcMetricsMetricMod.UpDownCounter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMetricsNoopMeterMod {
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_COUNTER_METRIC")
  @js.native
  val NOOP_COUNTER_METRIC: NoopCounterMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_HISTOGRAM_METRIC")
  @js.native
  val NOOP_HISTOGRAM_METRIC: NoopHistogramMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_METER")
  @js.native
  val NOOP_METER: NoopMeter = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_OBSERVABLE_COUNTER_METRIC")
  @js.native
  val NOOP_OBSERVABLE_COUNTER_METRIC: NoopObservableCounterMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_OBSERVABLE_GAUGE_METRIC")
  @js.native
  val NOOP_OBSERVABLE_GAUGE_METRIC: NoopObservableGaugeMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC")
  @js.native
  val NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC: NoopObservableUpDownCounterMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_UP_DOWN_COUNTER_METRIC")
  @js.native
  val NOOP_UP_DOWN_COUNTER_METRIC: NoopUpDownCounterMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopCounterMetric")
  @js.native
  open class NoopCounterMetric ()
    extends NoopMetric
       with Counter[MetricAttributes]
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopHistogramMetric")
  @js.native
  open class NoopHistogramMetric ()
    extends NoopMetric
       with Histogram[MetricAttributes]
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopMeter")
  @js.native
  open class NoopMeter ()
    extends StObject
       with Meter {
    
    /**
      * @see {@link Meter.removeBatchObservableCallback}
      */
    def removeBatchObservableCallback(_callback: BatchObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopMetric")
  @js.native
  open class NoopMetric () extends StObject
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopObservableCounterMetric")
  @js.native
  open class NoopObservableCounterMetric ()
    extends NoopObservableMetric
       with Observable[MetricAttributes] {
    
    /* InferMemberOverrides */
    override def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopObservableGaugeMetric")
  @js.native
  open class NoopObservableGaugeMetric ()
    extends NoopObservableMetric
       with Observable[MetricAttributes] {
    
    /* InferMemberOverrides */
    override def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopObservableMetric")
  @js.native
  open class NoopObservableMetric () extends StObject {
    
    def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopObservableUpDownCounterMetric")
  @js.native
  open class NoopObservableUpDownCounterMetric ()
    extends NoopObservableMetric
       with Observable[MetricAttributes] {
    
    /* InferMemberOverrides */
    override def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopUpDownCounterMetric")
  @js.native
  open class NoopUpDownCounterMetric ()
    extends NoopMetric
       with UpDownCounter[MetricAttributes]
  
  inline def createNoopMeter(): Meter = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoopMeter")().asInstanceOf[Meter]
}
