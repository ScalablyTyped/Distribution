package typings.opentracing

import typings.opentracing.mockContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockTracerMod {
  
  @JSImport("opentracing/lib/mock_tracer", "MockContext")
  @js.native
  class MockContext protected () extends default {
    def this(span: typings.opentracing.mockSpanMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer", "MockSpan")
  @js.native
  class MockSpan protected ()
    extends typings.opentracing.mockSpanMod.default {
    def this(tracer: typings.opentracing.mockTracerMockTracerMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer", "MockTracer")
  @js.native
  class MockTracer ()
    extends typings.opentracing.mockTracerMockTracerMod.default
}
