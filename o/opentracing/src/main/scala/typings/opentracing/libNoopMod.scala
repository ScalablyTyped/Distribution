package typings.opentracing

import typings.opentracing.libSpanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/noop", JSImport.Namespace)
@js.native
object libNoopMod extends js.Object {
  var span: default | Null = js.native
  var spanContext: typings.opentracing.libSpanUnderscoreContextMod.default | Null = js.native
  var tracer: typings.opentracing.libTracerMod.default | Null = js.native
  def initialize(): Unit = js.native
}

