package typings.opentracing

import typings.opentracing.tracerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/global_tracer", JSImport.Namespace)
@js.native
object globalTracerMod extends js.Object {
  def globalTracer(): default = js.native
  def initGlobalTracer(tracer: default): Unit = js.native
}

