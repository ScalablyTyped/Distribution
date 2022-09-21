package typings.opentracing

import typings.opentracing.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockContextMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_context", JSImport.Default)
  @js.native
  open class default protected () extends MockContext {
    def this(span: typings.opentracing.mockSpanMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer/mock_context", "MockContext")
  @js.native
  open class MockContext protected () extends SpanContext {
    def this(span: typings.opentracing.mockSpanMod.default) = this()
    
    /* private */ var _span: Any = js.native
    
    def span(): typings.opentracing.mockSpanMod.default = js.native
  }
}
