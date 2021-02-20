package typings.opentelemetryApi

import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopTextMapPropagatorMod {
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/NoopTextMapPropagator", "NOOP_TEXT_MAP_PROPAGATOR")
  @js.native
  val NOOP_TEXT_MAP_PROPAGATOR: NoopTextMapPropagator = js.native
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/NoopTextMapPropagator", "NoopTextMapPropagator")
  @js.native
  class NoopTextMapPropagator () extends TextMapPropagator {
    
    /** Noop extract function does nothing and returns the input context */
    def extract(context: Context, carrier: js.Any, getter: js.Function): Context = js.native
    
    /** Noop inject function does nothing */
    def inject(context: Context, carrier: js.Any, setter: js.Function): Unit = js.native
  }
}
