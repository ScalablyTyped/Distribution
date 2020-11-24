package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/NoopTracer", JSImport.Namespace)
@js.native
object noopTracerMod extends js.Object {
  
  val NOOP_TRACER: NoopTracer = js.native
  
  @js.native
  class NoopTracer () extends Tracer
}
