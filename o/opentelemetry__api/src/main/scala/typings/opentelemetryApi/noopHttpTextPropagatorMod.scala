package typings.opentelemetryApi

import typings.opentelemetryApi.httpTextPropagatorMod.HttpTextPropagator
import typings.opentelemetryContextBase.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/context/propagation/NoopHttpTextPropagator", JSImport.Namespace)
@js.native
object noopHttpTextPropagatorMod extends js.Object {
  
  val NOOP_HTTP_TEXT_PROPAGATOR: NoopHttpTextPropagator = js.native
  
  @js.native
  class NoopHttpTextPropagator () extends HttpTextPropagator {
    
    /** Noop extract function does nothing and returns the input context */
    def extract(context: Context, carrier: js.Any, getter: js.Function): Context = js.native
    
    /** Noop inject function does nothing */
    def inject(context: Context, carrier: js.Any, setter: js.Function): Unit = js.native
  }
}
