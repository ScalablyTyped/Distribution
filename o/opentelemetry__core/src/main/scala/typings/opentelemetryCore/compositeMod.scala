package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryCore.propagationTypesMod.CompositePropagatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeMod {
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/composite", "CompositePropagator")
  @js.native
  /**
    * Construct a composite propagator from a list of propagators.
    *
    * @param [config] Configuration object for composite propagator
    */
  class CompositePropagator () extends TextMapPropagator {
    def this(config: CompositePropagatorConfig) = this()
    
    val _logger: js.Any = js.native
    
    val _propagators: js.Any = js.native
    
    /**
      * Run each of the configured propagators with the given context and carrier.
      * Propagators are run in the order they are configured, so if multiple
      * propagators write the same context key, the propagator later in the list
      * will "win".
      *
      * @param context Context to add values to
      * @param carrier Carrier from which to extract context
      */
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    /**
      * Run each of the configured propagators with the given context and carrier.
      * Propagators are run in the order they are configured, so if multiple
      * propagators write the same carrier key, the propagator later in the list
      * will "win".
      *
      * @param context Context to inject
      * @param carrier Carrier into which context will be injected
      */
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
}
