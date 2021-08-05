package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkContextMod {
  
  /* Inlined std.Pick<@opentelemetry/api.@opentelemetry/api/build/src/trace/span_context.SpanContext, 'traceId' | 'spanId'> */
  trait LinkContext extends StObject {
    
    var spanId: String
    
    var traceId: String
  }
  object LinkContext {
    
    inline def apply(spanId: String, traceId: String): LinkContext = {
      val __obj = js.Dynamic.literal(spanId = spanId.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkContext]
    }
    
    extension [Self <: LinkContext](x: Self) {
      
      inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    }
  }
}
