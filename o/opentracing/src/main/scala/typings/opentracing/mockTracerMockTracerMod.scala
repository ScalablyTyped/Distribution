package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockTracerMockTracerMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_tracer", JSImport.Default)
  @js.native
  class default () extends MockTracer
  
  @JSImport("opentracing/lib/mock_tracer/mock_tracer", "MockTracer")
  @js.native
  class MockTracer () extends Tracer {
    
    var _allocSpan: js.Any = js.native
    
    /* protected */ def _extract(format: js.Any, carrier: js.Any): scala.Nothing = js.native
    
    /* protected */ def _inject(span: typings.opentracing.mockContextMod.default, format: js.Any, carrier: js.Any): scala.Nothing = js.native
    
    var _spans: js.Any = js.native
    
    /**
      * Discard any buffered data.
      */
    def clear(): Unit = js.native
    
    /**
      * Return the buffered data in a format convenient for making unit test
      * assertions.
      */
    def report(): typings.opentracing.mockReportMod.default = js.native
  }
}
