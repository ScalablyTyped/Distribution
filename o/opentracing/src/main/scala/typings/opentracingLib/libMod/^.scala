package typings
package opentracingLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FORMAT_BINARY: opentracingLib.opentracingLibStrings.binary = js.native
  val FORMAT_HTTP_HEADERS: opentracingLib.opentracingLibStrings.http_headers = js.native
  val FORMAT_TEXT_MAP: opentracingLib.opentracingLibStrings.text_map = js.native
  val REFERENCE_CHILD_OF: opentracingLib.opentracingLibStrings.child_of = js.native
  val REFERENCE_FOLLOWS_FROM: opentracingLib.opentracingLibStrings.follows_from = js.native
  def childOf(spanContext: opentracingLib.libSpanMod.default): opentracingLib.libReferenceMod.default = js.native
  def childOf(spanContext: opentracingLib.libSpanUnderscoreContextMod.default): opentracingLib.libReferenceMod.default = js.native
  def followsFrom(spanContext: opentracingLib.libSpanMod.default): opentracingLib.libReferenceMod.default = js.native
  def followsFrom(spanContext: opentracingLib.libSpanUnderscoreContextMod.default): opentracingLib.libReferenceMod.default = js.native
  def globalTracer(): opentracingLib.libTracerMod.default = js.native
  def initGlobalTracer(tracer: opentracingLib.libTracerMod.default): scala.Unit = js.native
}

