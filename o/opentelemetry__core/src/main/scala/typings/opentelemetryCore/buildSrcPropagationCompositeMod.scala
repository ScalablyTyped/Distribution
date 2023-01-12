package typings.opentelemetryCore

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapGetter
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapPropagator
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapSetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPropagationCompositeMod {
  
  @JSImport("@opentelemetry/core/build/src/propagation/composite", "CompositePropagator")
  @js.native
  /**
    * Construct a composite propagator from a list of propagators.
    *
    * @param [config] Configuration object for composite propagator
    */
  open class CompositePropagator ()
    extends StObject
       with TextMapPropagator[Any] {
    def this(config: CompositePropagatorConfig) = this()
    
    /* private */ val _fields: Any = js.native
    
    /* private */ val _propagators: Any = js.native
    
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
  
  trait CompositePropagatorConfig extends StObject {
    
    /**
      * List of propagators to run. Propagators run in the
      * list order. If a propagator later in the list writes the same context
      * key as a propagator earlier in the list, the later on will "win".
      */
    var propagators: js.UndefOr[js.Array[TextMapPropagator[Any]]] = js.undefined
  }
  object CompositePropagatorConfig {
    
    inline def apply(): CompositePropagatorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositePropagatorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompositePropagatorConfig] (val x: Self) extends AnyVal {
      
      inline def setPropagators(value: js.Array[TextMapPropagator[Any]]): Self = StObject.set(x, "propagators", value.asInstanceOf[js.Any])
      
      inline def setPropagatorsUndefined: Self = StObject.set(x, "propagators", js.undefined)
      
      inline def setPropagatorsVarargs(value: TextMapPropagator[Any]*): Self = StObject.set(x, "propagators", js.Array(value*))
    }
  }
}
