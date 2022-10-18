package typings.opentracing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpanContextMod {
  
  @JSImport("opentracing/lib/span_context", JSImport.Default)
  @js.native
  open class default () extends SpanContext
  
  @JSImport("opentracing/lib/span_context", "SpanContext")
  @js.native
  open class SpanContext () extends StObject {
    
    /**
      * Returns a string representation of the implementation internal span ID.
      *
      * @returns {string}
      */
    def toSpanId(): String = js.native
    
    /**
      * Returns a string representation of the implementation internal trace ID.
      *
      * @returns {string}
      */
    def toTraceId(): String = js.native
  }
}
