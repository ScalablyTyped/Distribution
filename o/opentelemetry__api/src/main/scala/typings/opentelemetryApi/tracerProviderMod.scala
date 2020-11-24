package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/tracer_provider", JSImport.Namespace)
@js.native
object tracerProviderMod extends js.Object {
  
  @js.native
  trait TracerProvider extends js.Object {
    
    /**
      * Returns a Tracer, creating one if one with the given name and version is
      * not already created.
      *
      * This function may return different Tracer types (e.g.
      * {@link NoopTracerProvider} vs. a functional tracer).
      *
      * @param name The name of the tracer or instrumentation library.
      * @param version The version of the tracer or instrumentation library.
      * @returns Tracer A Tracer with the given name and version
      */
    def getTracer(name: String): Tracer = js.native
    def getTracer(name: String, version: String): Tracer = js.native
  }
}
