package typings
package opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_span", "MockSpan")
@js.native
class MockSpan protected ()
  extends opentracingLib.libMod.Span {
  def this(tracer: opentracingLib.libMockUnderscoreTracerMockUnderscoreTracerMod.default) = this()
  var _finishMs: scala.Double = js.native
  var _logs: js.Any = js.native
  var _mockTracer: js.Any = js.native
  var _operationName: js.Any = js.native
  var _startMs: js.Any = js.native
  var _startStack: js.UndefOr[java.lang.String] = js.native
  var _tags: js.Any = js.native
  var _uuid: js.Any = js.native
  /* private */ def _generateUUID(): js.Any = js.native
  def addReference(ref: opentracingLib.libReferenceMod.default): scala.Unit = js.native
  /**
       * Returns a simplified object better for console.log()'ing.
       */
  def debug(): DebugInfo = js.native
  def durationMs(): scala.Double = js.native
  def operationName(): java.lang.String = js.native
  def tags(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def uuid(): java.lang.String = js.native
}

