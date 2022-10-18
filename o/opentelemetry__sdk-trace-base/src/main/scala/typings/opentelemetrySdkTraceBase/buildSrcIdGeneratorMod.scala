package typings.opentelemetrySdkTraceBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcIdGeneratorMod {
  
  trait IdGenerator extends StObject {
    
    /** Returns a span ID composed of 16 lowercase hex characters. */
    def generateSpanId(): String
    
    /** Returns a trace ID composed of 32 lowercase hex characters. */
    def generateTraceId(): String
  }
  object IdGenerator {
    
    inline def apply(generateSpanId: () => String, generateTraceId: () => String): IdGenerator = {
      val __obj = js.Dynamic.literal(generateSpanId = js.Any.fromFunction0(generateSpanId), generateTraceId = js.Any.fromFunction0(generateTraceId))
      __obj.asInstanceOf[IdGenerator]
    }
    
    extension [Self <: IdGenerator](x: Self) {
      
      inline def setGenerateSpanId(value: () => String): Self = StObject.set(x, "generateSpanId", js.Any.fromFunction0(value))
      
      inline def setGenerateTraceId(value: () => String): Self = StObject.set(x, "generateTraceId", js.Any.fromFunction0(value))
    }
  }
}
