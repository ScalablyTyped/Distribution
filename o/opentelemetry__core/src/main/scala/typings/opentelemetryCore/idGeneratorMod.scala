package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idGeneratorMod {
  
  @js.native
  trait IdGenerator extends StObject {
    
    /** Returns a span ID composed of 16 lowercase hex characters. */
    def generateSpanId(): String = js.native
    
    /** Returns a trace ID composed of 32 lowercase hex characters. */
    def generateTraceId(): String = js.native
  }
  object IdGenerator {
    
    @scala.inline
    def apply(generateSpanId: () => String, generateTraceId: () => String): IdGenerator = {
      val __obj = js.Dynamic.literal(generateSpanId = js.Any.fromFunction0(generateSpanId), generateTraceId = js.Any.fromFunction0(generateTraceId))
      __obj.asInstanceOf[IdGenerator]
    }
    
    @scala.inline
    implicit class IdGeneratorMutableBuilder[Self <: IdGenerator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerateSpanId(value: () => String): Self = StObject.set(x, "generateSpanId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenerateTraceId(value: () => String): Self = StObject.set(x, "generateTraceId", js.Any.fromFunction0(value))
    }
  }
}
