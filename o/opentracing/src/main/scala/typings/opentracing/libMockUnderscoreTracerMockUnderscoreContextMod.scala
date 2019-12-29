package typings.opentracing

import typings.opentracing.libSpanUnderscoreContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_context", JSImport.Namespace)
@js.native
object libMockUnderscoreTracerMockUnderscoreContextMod extends js.Object {
  @js.native
  class MockContext protected () extends SpanContext {
    def this(span: typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default) = this()
    var _span: js.Any = js.native
    def span(): typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default = js.native
  }
  
  @js.native
  class default protected () extends MockContext {
    def this(span: typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default) = this()
  }
  
}

