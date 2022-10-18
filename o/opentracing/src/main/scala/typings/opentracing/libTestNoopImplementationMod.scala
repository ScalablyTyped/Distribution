package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestNoopImplementationMod {
  
  @JSImport("opentracing/lib/test/noop_implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default(createTracer: js.Function0[Tracer]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(createTracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def noopImplementationTests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noopImplementationTests")().asInstanceOf[Unit]
  inline def noopImplementationTests(createTracer: js.Function0[Tracer]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noopImplementationTests")(createTracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
