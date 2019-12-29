package typings.opentracing

import typings.opentracing.libTracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_tracer", JSImport.Namespace)
@js.native
object libMockUnderscoreTracerMockUnderscoreTracerMod extends js.Object {
  @js.native
  class MockTracer () extends Tracer {
    var _allocSpan: js.Any = js.native
    var _spans: js.Any = js.native
    /* protected */ def _extract(format: js.Any, carrier: js.Any): scala.Nothing = js.native
    /* protected */ def _inject(
      span: typings.opentracing.libMockUnderscoreTracerMockUnderscoreContextMod.default,
      format: js.Any,
      carrier: js.Any
    ): scala.Nothing = js.native
    /**
      * Discard any buffered data.
      */
    def clear(): Unit = js.native
    /**
      * Return the buffered data in a format convenient for making unit test
      * assertions.
      */
    def report(): typings.opentracing.libMockUnderscoreTracerMockUnderscoreReportMod.default = js.native
  }
  
  @js.native
  class default () extends MockTracer
  
}

