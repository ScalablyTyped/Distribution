package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpTraceContextMod {
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "HttpTraceContext")
  @js.native
  class HttpTraceContext ()
    extends StObject
       with TextMapPropagator {
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[js.Any]): Context_ = js.native
    /**
      * Given a `Context` and a carrier, extract context values from a
      * carrier and return a new context, created from the old context, with the
      * extracted values.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param getter a function which accepts a carrier and a key, and returns
      *     the value from the carrier identified by the key.
      */
    /* CompleteClass */
    override def extract(context: Context, carrier: js.Any, getter: GetterFunction[js.Any]): Context = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[js.Any]): Unit = js.native
    /**
      * Injects values from a given `Context` into a carrier.
      *
      * OpenTelemetry defines a common set of format values (TextMapPropagator),
      * and each has an expected `carrier` type.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param setter a function which accepts a carrier, key, and value, which
      *     sets the key on the carrier to the value.
      */
    /* CompleteClass */
    override def inject(context: Context, carrier: js.Any, setter: SetterFunction[js.Any]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "TRACE_PARENT_HEADER")
  @js.native
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/HttpTraceContext", "TRACE_STATE_HEADER")
  @js.native
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  @scala.inline
  def parseTraceParent(traceParent: String): SpanContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTraceParent")(traceParent.asInstanceOf[js.Any]).asInstanceOf[SpanContext | Null]
}
