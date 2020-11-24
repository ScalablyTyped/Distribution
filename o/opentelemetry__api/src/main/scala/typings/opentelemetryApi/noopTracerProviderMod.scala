package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/NoopTracerProvider", JSImport.Namespace)
@js.native
object noopTracerProviderMod extends js.Object {
  
  val NOOP_TRACER_PROVIDER: NoopTracerProvider = js.native
  
  @js.native
  class NoopTracerProvider () extends TracerProvider {
    
    def getTracer(): Tracer = js.native
    def getTracer(_name: js.UndefOr[scala.Nothing], _version: String): Tracer = js.native
  }
}
