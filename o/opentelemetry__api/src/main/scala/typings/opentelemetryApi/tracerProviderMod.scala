package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracerProviderMod {
  
  @js.native
  trait TracerProvider extends StObject {
    
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
