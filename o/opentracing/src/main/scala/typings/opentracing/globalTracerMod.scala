package typings.opentracing

import typings.opentracing.tracerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalTracerMod {
  
  @JSImport("opentracing/lib/global_tracer", "globalTracer")
  @js.native
  def globalTracer(): default = js.native
  
  @JSImport("opentracing/lib/global_tracer", "initGlobalTracer")
  @js.native
  def initGlobalTracer(tracer: default): Unit = js.native
}
