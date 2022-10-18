package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockTracerMockTracerMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_tracer", JSImport.Default)
  @js.native
  open class default () extends MockTracer
  
  @JSImport("opentracing/lib/mock_tracer/mock_tracer", "MockTracer")
  @js.native
  open class MockTracer () extends Tracer {
    
    /* private */ var _allocSpan: Any = js.native
    
    /* protected */ def _extract(format: Any, carrier: Any): scala.Nothing = js.native
    
    /* protected */ def _inject(span: typings.opentracing.libMockTracerMockContextMod.default, format: Any, carrier: Any): scala.Nothing = js.native
    
    /* private */ var _spans: Any = js.native
    
    /**
      * Discard any buffered data.
      */
    def clear(): Unit = js.native
    
    /**
      * Return the buffered data in a format convenient for making unit test
      * assertions.
      */
    def report(): typings.opentracing.libMockTracerMockReportMod.default = js.native
  }
}
