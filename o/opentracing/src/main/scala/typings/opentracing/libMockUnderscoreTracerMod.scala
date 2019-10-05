package typings.opentracing

import typings.opentracing.libMockUnderscoreTracerMockUnderscoreContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer", JSImport.Namespace)
@js.native
object libMockUnderscoreTracerMod extends js.Object {
  @js.native
  class MockContext protected () extends default {
    def this(span: typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default) = this()
  }
  
  @js.native
  class MockSpan protected ()
    extends typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default {
    def this(tracer: typings.opentracing.libMockUnderscoreTracerMockUnderscoreTracerMod.default) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typings.opentracing.libMockUnderscoreTracerMockUnderscoreTracerMod.default
  
}

