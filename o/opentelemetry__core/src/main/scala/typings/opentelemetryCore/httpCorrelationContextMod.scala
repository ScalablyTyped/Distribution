package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpCorrelationContextMod {
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/propagation/HttpCorrelationContext", "CORRELATION_CONTEXT_HEADER")
  @js.native
  val CORRELATION_CONTEXT_HEADER: /* "otcorrelations" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/propagation/HttpCorrelationContext", "HttpCorrelationContext")
  @js.native
  class HttpCorrelationContext ()
    extends StObject
       with TextMapPropagator {
    
    var _getKeyPairs: js.Any = js.native
    
    var _parsePairKeyValue: js.Any = js.native
    
    var _serializeKeyPairs: js.Any = js.native
    
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
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/propagation/HttpCorrelationContext", "MAX_NAME_VALUE_PAIRS")
  @js.native
  val MAX_NAME_VALUE_PAIRS: /* 180 */ Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/propagation/HttpCorrelationContext", "MAX_PER_NAME_VALUE_PAIRS")
  @js.native
  val MAX_PER_NAME_VALUE_PAIRS: /* 4096 */ Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/propagation/HttpCorrelationContext", "MAX_TOTAL_LENGTH")
  @js.native
  val MAX_TOTAL_LENGTH: /* 8192 */ Double = js.native
}
