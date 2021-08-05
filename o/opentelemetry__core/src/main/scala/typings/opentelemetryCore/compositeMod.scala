package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import typings.opentelemetryCore.propagationTypesMod.CompositePropagatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeMod {
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/composite", "CompositePropagator")
  @js.native
  /**
    * Construct a composite propagator from a list of propagators.
    *
    * @param [config] Configuration object for composite propagator
    */
  class CompositePropagator ()
    extends StObject
       with TextMapPropagator {
    def this(config: CompositePropagatorConfig) = this()
    
    /* private */ val _logger: js.Any = js.native
    
    /* private */ val _propagators: js.Any = js.native
    
    /**
      * Run each of the configured propagators with the given context and carrier.
      * Propagators are run in the order they are configured, so if multiple
      * propagators write the same context key, the propagator later in the list
      * will "win".
      *
      * @param context Context to add values to
      * @param carrier Carrier from which to extract context
      */
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
    
    /**
      * Run each of the configured propagators with the given context and carrier.
      * Propagators are run in the order they are configured, so if multiple
      * propagators write the same carrier key, the propagator later in the list
      * will "win".
      *
      * @param context Context to inject
      * @param carrier Carrier into which context will be injected
      */
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
}
