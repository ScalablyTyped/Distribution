package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopImplementationMod {
  
  @JSImport("opentracing/lib/test/noop_implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  @scala.inline
  def default(createTracer: js.Function0[Tracer]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(createTracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def noopImplementationTests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noopImplementationTests")().asInstanceOf[Unit]
  @scala.inline
  def noopImplementationTests(createTracer: js.Function0[Tracer]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noopImplementationTests")(createTracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
