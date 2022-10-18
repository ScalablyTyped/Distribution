package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapGetter
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapPropagator
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapSetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPropagationNoopTextMapPropagatorMod {
  
  @JSImport("@opentelemetry/api/build/src/propagation/NoopTextMapPropagator", "NoopTextMapPropagator")
  @js.native
  open class NoopTextMapPropagator ()
    extends StObject
       with TextMapPropagator[Any] {
    
    /** Noop extract function does nothing and returns the input context */
    def extract(context: Context, _carrier: Any): Context = js.native
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
    
    /** Noop inject function does nothing */
    def inject(_context: Context, _carrier: Any): Unit = js.native
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
}
