package typings
package opentracingLib.libMockUnderscoreTracerMockUnderscoreReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_report", "MockReport")
@js.native
class MockReport protected () extends js.Object {
  def this(spans: js.Array[opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.MockSpan]) = this()
  var debugSpans: js.Any = js.native
  var spans: js.Array[opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.MockSpan] = js.native
  var spansByTag: js.Any = js.native
  var spansByUUID: js.Any = js.native
  var unfinishedSpans: js.Any = js.native
  def firstSpanWithTagValue(key: java.lang.String, `val`: js.Any): opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.MockSpan | scala.Null = js.native
}

