package typings.opentelemetryApiMetrics

import typings.opentelemetryApiMetrics.meterMod.Meter
import typings.opentelemetryApiMetrics.metricsMod.MetricsAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/api-metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/api-metrics", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApiMetrics.metricMod.ValueType & Double] = js.native
    
    /* 1 */ val DOUBLE: typings.opentelemetryApiMetrics.metricMod.ValueType.DOUBLE & Double = js.native
    
    /* 0 */ val INT: typings.opentelemetryApiMetrics.metricMod.ValueType.INT & Double = js.native
  }
  
  inline def createNoopMeter(): Meter = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoopMeter")().asInstanceOf[Meter]
  
  @JSImport("@opentelemetry/api-metrics", "metrics")
  @js.native
  val metrics: MetricsAPI = js.native
}
