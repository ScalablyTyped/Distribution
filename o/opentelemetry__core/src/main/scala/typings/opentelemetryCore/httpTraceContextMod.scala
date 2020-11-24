package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", JSImport.Namespace)
@js.native
object httpTraceContextMod extends js.Object {
  
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  def parseTraceParent(traceParent: String): SpanContext | Null = js.native
  
  @js.native
  class HttpTraceContext () extends TextMapPropagator {
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
}
