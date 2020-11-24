package typings.opentelemetryCore

import typings.opentelemetryApi.getterMod.GetterFunction
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.setterMod.SetterFunction
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/correlation-context/propagation/HttpCorrelationContext", JSImport.Namespace)
@js.native
object httpCorrelationContextMod extends js.Object {
  
  val CORRELATION_CONTEXT_HEADER: /* "otcorrelations" */ String = js.native
  
  val MAX_NAME_VALUE_PAIRS: /* 180 */ Double = js.native
  
  val MAX_PER_NAME_VALUE_PAIRS: /* 4096 */ Double = js.native
  
  val MAX_TOTAL_LENGTH: /* 8192 */ Double = js.native
  
  @js.native
  class HttpCorrelationContext () extends TextMapPropagator {
    
    var _getKeyPairs: js.Any = js.native
    
    var _parsePairKeyValue: js.Any = js.native
    
    var _serializeKeyPairs: js.Any = js.native
    
    def extract(context: Context_, carrier: js.Any, getter: GetterFunction[_]): Context_ = js.native
    
    def inject(context: Context_, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
}
