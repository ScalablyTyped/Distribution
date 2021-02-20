package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object b3PropagatorMod {
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "B3Propagator")
  @js.native
  class B3Propagator () extends TextMapPropagator {
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "DEBUG_FLAG_KEY")
  @js.native
  val DEBUG_FLAG_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "PARENT_SPAN_ID_KEY")
  @js.native
  val PARENT_SPAN_ID_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_FLAGS")
  @js.native
  val X_B3_FLAGS: /* "x-b3-flags" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_PARENT_SPAN_ID")
  @js.native
  val X_B3_PARENT_SPAN_ID: /* "x-b3-parentspanid" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_SAMPLED")
  @js.native
  val X_B3_SAMPLED: /* "x-b3-sampled" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_SPAN_ID")
  @js.native
  val X_B3_SPAN_ID: /* "x-b3-spanid" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_TRACE_ID")
  @js.native
  val X_B3_TRACE_ID: /* "x-b3-traceid" */ String = js.native
}
