package typings.opentracing

import typings.opentracing.libSpanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/functions", JSImport.Namespace)
@js.native
object libFunctionsMod extends js.Object {
  def childOf(spanContext: default): typings.opentracing.libReferenceMod.default = js.native
  def childOf(spanContext: typings.opentracing.libSpanUnderscoreContextMod.default): typings.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: default): typings.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.libSpanUnderscoreContextMod.default): typings.opentracing.libReferenceMod.default = js.native
}

