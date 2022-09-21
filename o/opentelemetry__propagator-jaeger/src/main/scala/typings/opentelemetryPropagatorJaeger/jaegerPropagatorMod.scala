package typings.opentelemetryPropagatorJaeger

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.textMapPropagatorMod.TextMapGetter
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryApi.textMapPropagatorMod.TextMapSetter
import typings.opentelemetryPropagatorJaeger.typesMod.JaegerPropagatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jaegerPropagatorMod {
  
  @JSImport("@opentelemetry/propagator-jaeger/build/src/JaegerPropagator", "JaegerPropagator")
  @js.native
  open class JaegerPropagator ()
    extends StObject
       with TextMapPropagator[Any] {
    def this(config: JaegerPropagatorConfig) = this()
    def this(customTraceHeader: String) = this()
    
    /* private */ val _jaegerBaggageHeaderPrefix: Any = js.native
    
    /* private */ val _jaegerTraceHeader: Any = js.native
    
    /**
      * Given a `Context` and a carrier, extract context values from a
      * carrier and return a new context, created from the old context, with the
      * extracted values.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param getter an optional {@link TextMapGetter}. If undefined, keys will be all
      *     own properties, and keys will be accessed by direct object access.
      */
    /* CompleteClass */
    override def extract(context: Context, carrier: Any, getter: TextMapGetter[Any]): Context = js.native
    
    /**
      * Return a list of all fields which may be used by the propagator.
      */
    /* CompleteClass */
    override def fields(): js.Array[String] = js.native
    
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
      * @param setter an optional {@link TextMapSetter}. If undefined, values will be
      *     set by direct object assignment.
      */
    /* CompleteClass */
    override def inject(context: Context, carrier: Any, setter: TextMapSetter[Any]): Unit = js.native
  }
  
  @JSImport("@opentelemetry/propagator-jaeger/build/src/JaegerPropagator", "UBER_BAGGAGE_HEADER_PREFIX")
  @js.native
  val UBER_BAGGAGE_HEADER_PREFIX: /* "uberctx" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-jaeger/build/src/JaegerPropagator", "UBER_TRACE_ID_HEADER")
  @js.native
  val UBER_TRACE_ID_HEADER: /* "uber-trace-id" */ String = js.native
}
