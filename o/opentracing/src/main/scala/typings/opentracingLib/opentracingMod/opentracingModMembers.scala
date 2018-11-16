package typings
package opentracingLib.opentracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", JSImport.Namespace)
@js.native
object opentracingModMembers extends js.Object {
  val FORMAT_BINARY: /* binary */ java.lang.String = js.native
  val FORMAT_HTTP_HEADERS: /* http_headers */ java.lang.String = js.native
  val FORMAT_TEXT_MAP: /* text_map */ java.lang.String = js.native
  val REFERENCE_CHILD_OF: /* child_of */ java.lang.String = js.native
  val REFERENCE_FOLLOWS_FROM: /* follows_from */ java.lang.String = js.native
  def childOf(
    spanContext: opentracingLib.libSpanMod.default | opentracingLib.libSpanUnderscoreContextMod.default
  ): opentracingLib.libReferenceMod.default = js.native
  def followsFrom(spanContext: opentracingLib.libSpanUnderscoreContextMod.default): opentracingLib.libReferenceMod.default = js.native
  def globalTracer(): opentracingLib.libTracerMod.default = js.native
  def initGlobalTracer(tracer: opentracingLib.libTracerMod.default): scala.Unit = js.native
}

