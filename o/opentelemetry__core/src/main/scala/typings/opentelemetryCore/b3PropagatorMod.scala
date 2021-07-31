package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object b3PropagatorMod {
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "B3Propagator")
  @js.native
  class B3Propagator ()
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
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "DEBUG_FLAG_KEY")
  @js.native
  val DEBUG_FLAG_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "PARENT_SPAN_ID_KEY")
  @js.native
  val PARENT_SPAN_ID_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_FLAGS")
  @js.native
  val X_B3_FLAGS: /* "x-b3-flags" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_PARENT_SPAN_ID")
  @js.native
  val X_B3_PARENT_SPAN_ID: /* "x-b3-parentspanid" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_SAMPLED")
  @js.native
  val X_B3_SAMPLED: /* "x-b3-sampled" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_SPAN_ID")
  @js.native
  val X_B3_SPAN_ID: /* "x-b3-spanid" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/propagation/B3Propagator", "X_B3_TRACE_ID")
  @js.native
  val X_B3_TRACE_ID: /* "x-b3-traceid" */ String = js.native
}
