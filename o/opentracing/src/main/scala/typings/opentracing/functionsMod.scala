package typings.opentracing

import typings.opentracing.spanContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def childOf(spanContext: default): typings.opentracing.referenceMod.default = js.native
  def childOf(spanContext: typings.opentracing.spanMod.default): typings.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: default): typings.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.spanMod.default): typings.opentracing.referenceMod.default = js.native
}

