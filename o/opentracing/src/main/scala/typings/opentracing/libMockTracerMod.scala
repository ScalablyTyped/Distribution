package typings.opentracing

import typings.opentracing.libMockTracerMockContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockTracerMod {
  
  @JSImport("opentracing/lib/mock_tracer", "MockContext")
  @js.native
  open class MockContext protected () extends default {
    def this(span: typings.opentracing.libMockTracerMockSpanMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer", "MockSpan")
  @js.native
  open class MockSpan protected ()
    extends typings.opentracing.libMockTracerMockSpanMod.default {
    def this(tracer: typings.opentracing.libMockTracerMockTracerMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer", "MockTracer")
  @js.native
  open class MockTracer ()
    extends typings.opentracing.libMockTracerMockTracerMod.default
}
