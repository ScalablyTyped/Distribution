package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopTracerMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopTracer", "NOOP_TRACER")
  @js.native
  val NOOP_TRACER: NoopTracer = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopTracer", "NoopTracer")
  @js.native
  class NoopTracer () extends Tracer
}
