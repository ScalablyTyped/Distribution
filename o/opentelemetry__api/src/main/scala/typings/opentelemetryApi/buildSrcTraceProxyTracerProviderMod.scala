package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcTraceTracerMod.Tracer
import typings.opentelemetryApi.buildSrcTraceTracerOptionsMod.TracerOptions
import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceProxyTracerProviderMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/ProxyTracerProvider", "ProxyTracerProvider")
  @js.native
  open class ProxyTracerProvider ()
    extends StObject
       with TracerProvider {
    
    /* private */ var _delegate: Any = js.native
    
    def getDelegate(): TracerProvider = js.native
    
    def getDelegateTracer(name: String): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: String): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: String, options: TracerOptions): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: Unit, options: TracerOptions): js.UndefOr[Tracer] = js.native
    
    /**
      * Set the delegate tracer provider
      */
    def setDelegate(delegate: TracerProvider): Unit = js.native
  }
}
