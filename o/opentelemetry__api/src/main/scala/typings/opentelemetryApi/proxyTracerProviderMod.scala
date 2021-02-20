package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyTracerProviderMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/ProxyTracerProvider", "ProxyTracerProvider")
  @js.native
  class ProxyTracerProvider () extends TracerProvider {
    
    var _delegate: js.Any = js.native
    
    def getDelegate(): TracerProvider = js.native
    
    def getDelegateTracer(name: String): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: String): js.UndefOr[Tracer] = js.native
    
    /**
      * Set the delegate tracer provider
      */
    def setDelegate(delegate: TracerProvider): Unit = js.native
  }
}
