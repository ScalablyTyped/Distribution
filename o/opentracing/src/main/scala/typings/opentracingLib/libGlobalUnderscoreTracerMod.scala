package typings
package opentracingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/global_tracer", JSImport.Namespace)
@js.native
object libGlobalUnderscoreTracerMod extends js.Object {
  def globalTracer(): opentracingLib.libTracerMod.default = js.native
  def initGlobalTracer(tracer: opentracingLib.libTracerMod.default): scala.Unit = js.native
}

