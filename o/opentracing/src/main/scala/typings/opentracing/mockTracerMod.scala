package typings.opentracing

import typings.opentracing.mockContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/mock_tracer", JSImport.Namespace)
@js.native
object mockTracerMod extends js.Object {
  
  @js.native
  class MockContext protected () extends default {
    def this(span: typings.opentracing.mockSpanMod.default) = this()
  }
  
  @js.native
  class MockSpan protected ()
    extends typings.opentracing.mockSpanMod.default {
    def this(tracer: typings.opentracing.mockTracerMockTracerMod.default) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typings.opentracing.mockTracerMockTracerMod.default
}
