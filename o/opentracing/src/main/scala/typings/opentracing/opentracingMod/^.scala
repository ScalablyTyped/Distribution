package typings.opentracing.opentracingMod

import typings.opentracing.libSpanMod.default
import typings.opentracing.opentracingStrings.binary
import typings.opentracing.opentracingStrings.child_of
import typings.opentracing.opentracingStrings.follows_from
import typings.opentracing.opentracingStrings.http_headers
import typings.opentracing.opentracingStrings.text_map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FORMAT_BINARY: binary = js.native
  val FORMAT_HTTP_HEADERS: http_headers = js.native
  val FORMAT_TEXT_MAP: text_map = js.native
  val REFERENCE_CHILD_OF: child_of = js.native
  val REFERENCE_FOLLOWS_FROM: follows_from = js.native
  def childOf(spanContext: default): typings.opentracing.libReferenceMod.default = js.native
  def childOf(spanContext: typings.opentracing.libSpanUnderscoreContextMod.default): typings.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: default): typings.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.libSpanUnderscoreContextMod.default): typings.opentracing.libReferenceMod.default = js.native
  def globalTracer(): typings.opentracing.libTracerMod.default = js.native
  def initGlobalTracer(tracer: typings.opentracing.libTracerMod.default): Unit = js.native
}

