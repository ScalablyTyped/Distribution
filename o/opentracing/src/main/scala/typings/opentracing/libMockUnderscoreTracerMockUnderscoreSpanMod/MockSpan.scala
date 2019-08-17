package typings.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span * / any */ @JSImport("opentracing/lib/mock_tracer/mock_span", "MockSpan")
@js.native
class MockSpan protected () extends js.Object {
  def this(tracer: typings.opentracing.libMockUnderscoreTracerMockUnderscoreTracerMod.default) = this()
  var _finishMs: Double = js.native
  var _generateUUID: js.Any = js.native
  var _logs: js.Any = js.native
  var _mockTracer: js.Any = js.native
  var _operationName: js.Any = js.native
  var _startMs: js.Any = js.native
  var _startStack: js.UndefOr[String] = js.native
  var _tags: js.Any = js.native
  var _uuid: js.Any = js.native
  /* protected */ def _addTags(set: StringDictionary[js.Any]): Unit = js.native
  /* protected */ def _context(): typings.opentracing.libMockUnderscoreTracerMockUnderscoreContextMod.default = js.native
  /* protected */ def _finish(): Unit = js.native
  /* protected */ def _finish(finishTime: Double): Unit = js.native
  /* protected */ def _log(fields: StringDictionary[js.Any]): Unit = js.native
  /* protected */ def _log(fields: StringDictionary[js.Any], timestamp: Double): Unit = js.native
  /* protected */ def _setOperationName(name: String): Unit = js.native
  def addReference(ref: typings.opentracing.libReferenceMod.default): Unit = js.native
  /**
    * Returns a simplified object better for console.log()'ing.
    */
  def debug(): DebugInfo = js.native
  def durationMs(): Double = js.native
  def operationName(): String = js.native
  def tags(): StringDictionary[js.Any] = js.native
  def tracer(): js.Any = js.native
  def uuid(): String = js.native
}

