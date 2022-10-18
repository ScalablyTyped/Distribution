package typings.opentelemetryApiMetrics

import typings.opentelemetryApiMetrics.buildSrcTypesMeterMod.Meter
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.BatchObservableCallback
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Counter
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Histogram
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.MetricAttributes
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.Observable
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.ObservableCallback
import typings.opentelemetryApiMetrics.buildSrcTypesMetricMod.UpDownCounter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNoopMeterMod {
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_COUNTER_METRIC")
  @js.native
  val NOOP_COUNTER_METRIC: NoopCounterMetric = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_HISTOGRAM_METRIC")
  @js.native
  val NOOP_HISTOGRAM_METRIC: NoopHistogramMetric = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_METER")
  @js.native
  val NOOP_METER: NoopMeter = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_OBSERVABLE_COUNTER_METRIC")
  @js.native
  val NOOP_OBSERVABLE_COUNTER_METRIC: NoopObservableCounterMetric = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_OBSERVABLE_GAUGE_METRIC")
  @js.native
  val NOOP_OBSERVABLE_GAUGE_METRIC: NoopObservableGaugeMetric = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC")
  @js.native
  val NOOP_OBSERVABLE_UP_DOWN_COUNTER_METRIC: NoopObservableUpDownCounterMetric = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NOOP_UP_DOWN_COUNTER_METRIC")
  @js.native
  val NOOP_UP_DOWN_COUNTER_METRIC: NoopUpDownCounterMetric = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopCounterMetric")
  @js.native
  open class NoopCounterMetric ()
    extends NoopMetric
       with Counter[MetricAttributes]
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopHistogramMetric")
  @js.native
  open class NoopHistogramMetric ()
    extends NoopMetric
       with Histogram[MetricAttributes]
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopMeter")
  @js.native
  open class NoopMeter ()
    extends StObject
       with Meter {
    
    /**
      * @see {@link Meter.removeBatchObservableCallback}
      */
    def removeBatchObservableCallback(_callback: BatchObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopMetric")
  @js.native
  open class NoopMetric () extends StObject
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopObservableCounterMetric")
  @js.native
  open class NoopObservableCounterMetric ()
    extends NoopObservableMetric
       with Observable[MetricAttributes] {
    
    /* InferMemberOverrides */
    override def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopObservableGaugeMetric")
  @js.native
  open class NoopObservableGaugeMetric ()
    extends NoopObservableMetric
       with Observable[MetricAttributes] {
    
    /* InferMemberOverrides */
    override def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopObservableMetric")
  @js.native
  open class NoopObservableMetric () extends StObject {
    
    def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopObservableUpDownCounterMetric")
  @js.native
  open class NoopObservableUpDownCounterMetric ()
    extends NoopObservableMetric
       with Observable[MetricAttributes] {
    
    /* InferMemberOverrides */
    override def addCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeCallback(_callback: ObservableCallback[MetricAttributes]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeter", "NoopUpDownCounterMetric")
  @js.native
  open class NoopUpDownCounterMetric ()
    extends NoopMetric
       with UpDownCounter[MetricAttributes]
  
  inline def createNoopMeter(): Meter = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoopMeter")().asInstanceOf[Meter]
}
