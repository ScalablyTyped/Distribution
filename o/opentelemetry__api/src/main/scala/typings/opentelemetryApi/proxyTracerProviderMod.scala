package typings.opentelemetryApi

import typings.opentelemetryApi.tracerMod.Tracer
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/ProxyTracerProvider", JSImport.Namespace)
@js.native
object proxyTracerProviderMod extends js.Object {
  
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
