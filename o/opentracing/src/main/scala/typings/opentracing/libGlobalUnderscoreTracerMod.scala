package typings.opentracing

import typings.opentracing.libTracerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/global_tracer", JSImport.Namespace)
@js.native
object libGlobalUnderscoreTracerMod extends js.Object {
  def globalTracer(): default = js.native
  def initGlobalTracer(tracer: default): Unit = js.native
}

