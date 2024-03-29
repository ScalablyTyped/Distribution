package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcTraceTracerMod.Tracer
import typings.opentelemetryApi.buildSrcTraceTracerOptionsMod.TracerOptions
import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceNoopTracerProviderMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopTracerProvider", "NoopTracerProvider")
  @js.native
  open class NoopTracerProvider ()
    extends StObject
       with TracerProvider {
    
    def getTracer(): Tracer = js.native
    def getTracer(_name: Unit, _version: String): Tracer = js.native
    def getTracer(_name: Unit, _version: String, _options: TracerOptions): Tracer = js.native
    def getTracer(_name: Unit, _version: Unit, _options: TracerOptions): Tracer = js.native
  }
}
