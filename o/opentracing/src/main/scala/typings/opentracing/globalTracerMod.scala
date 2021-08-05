package typings.opentracing

import typings.opentracing.tracerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalTracerMod {
  
  @JSImport("opentracing/lib/global_tracer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def globalTracer(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("globalTracer")().asInstanceOf[default]
  
  inline def initGlobalTracer(tracer: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initGlobalTracer")(tracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
