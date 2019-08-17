package typings.opentracing.libMockUnderscoreTracerMockUnderscoreTracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Tracer * / any */ @JSImport("opentracing/lib/mock_tracer/mock_tracer", "MockTracer")
@js.native
class MockTracer () extends js.Object {
  var _allocSpan: js.Any = js.native
  var _spans: js.Any = js.native
  /* protected */ def _extract(format: js.Any, carrier: js.Any): scala.Nothing = js.native
  /* protected */ def _inject(
    span: typings.opentracing.libMockUnderscoreTracerMockUnderscoreContextMod.default,
    format: js.Any,
    carrier: js.Any
  ): scala.Nothing = js.native
  /* protected */ def _startSpan(
    name: String,
    fields: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.SpanOptions */ js.Any
  ): typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default = js.native
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

