package typings.opentelemetryApi

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.httpTextPropagatorMod.HttpTextPropagator
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopHttpTextPropagatorMod {
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/NoopHttpTextPropagator", "NOOP_HTTP_TEXT_PROPAGATOR")
  @js.native
  val NOOP_HTTP_TEXT_PROPAGATOR: NoopHttpTextPropagator = js.native
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/NoopHttpTextPropagator", "NoopHttpTextPropagator")
  @js.native
  class NoopHttpTextPropagator ()
    extends StObject
       with HttpTextPropagator {
    
    /** Noop extract function does nothing and returns the input context */
    def extract(context: Context, carrier: js.Any, getter: js.Function): Context = js.native
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
    
    /** Noop inject function does nothing */
    def inject(context: Context, carrier: js.Any, setter: js.Function): Unit = js.native
    /**
      * Injects values from a given `Context` into a carrier.
      *
      * OpenTelemetry defines a common set of format values (HttpTextPropagator),
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
}
