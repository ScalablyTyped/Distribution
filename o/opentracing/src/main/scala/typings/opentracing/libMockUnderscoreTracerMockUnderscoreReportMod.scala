package typings.opentracing

import typings.opentracing.libMockUnderscoreTracerMockUnderscoreReportMod.MockReport
import typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.MockSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_report", JSImport.Namespace)
@js.native
object libMockUnderscoreTracerMockUnderscoreReportMod extends js.Object {
  @js.native
  class MockReport protected () extends js.Object {
    def this(spans: js.Array[MockSpan]) = this()
    var debugSpans: js.Any = js.native
    var spans: js.Array[MockSpan] = js.native
    var spansByTag: js.Any = js.native
    var spansByUUID: js.Any = js.native
    var unfinishedSpans: js.Any = js.native
    def firstSpanWithTagValue(key: String, `val`: js.Any): MockSpan | Null = js.native
  }
  
  @js.native
  class default protected () extends MockReport {
    def this(spans: js.Array[MockSpan]) = this()
  }
  
}

