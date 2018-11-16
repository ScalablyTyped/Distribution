package typings
package opentracingLib.libMockUnderscoreTracerMockUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_context", "MockContext")
@js.native
class MockContext protected ()
  extends opentracingLib.libMod.SpanContext {
  def this(span: opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.default) = this()
  var _span: js.Any = js.native
  def span(): opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.default = js.native
}

