package typings.opentelemetryApi

import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/context/propagation/NoopTextMapPropagator", JSImport.Namespace)
@js.native
object noopTextMapPropagatorMod extends js.Object {
  
  val NOOP_TEXT_MAP_PROPAGATOR: NoopTextMapPropagator = js.native
  
  @js.native
  class NoopTextMapPropagator () extends TextMapPropagator {
    
    /** Noop extract function does nothing and returns the input context */
    def extract(context: Context, carrier: js.Any, getter: js.Function): Context = js.native
    
    /** Noop inject function does nothing */
    def inject(context: Context, carrier: js.Any, setter: js.Function): Unit = js.native
  }
}
