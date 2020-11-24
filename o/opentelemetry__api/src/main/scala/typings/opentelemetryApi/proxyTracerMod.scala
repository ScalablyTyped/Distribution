package typings.opentelemetryApi

import typings.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider
import typings.opentelemetryApi.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/ProxyTracer", JSImport.Namespace)
@js.native
object proxyTracerMod extends js.Object {
  
  @js.native
  class ProxyTracer protected () extends Tracer {
    def this(_provider: ProxyTracerProvider, name: String) = this()
    def this(_provider: ProxyTracerProvider, name: String, version: String) = this()
    
    var _delegate: js.Any = js.native
    
    /**
      * Try to get a tracer from the proxy tracer provider.
      * If the proxy tracer provider has no delegate, return a noop tracer.
      */
    var _getTracer: js.Any = js.native
    
    var _provider: js.Any = js.native
    
    val name: String = js.native
    
    val version: js.UndefOr[String] = js.native
  }
}
