package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopImplementationMod {
  
  @JSImport("opentracing/lib/test/noop_implementation", JSImport.Default)
  @js.native
  def default(): Unit = js.native
  @JSImport("opentracing/lib/test/noop_implementation", JSImport.Default)
  @js.native
  def default(createTracer: js.Function0[Tracer]): Unit = js.native
  
  @JSImport("opentracing/lib/test/noop_implementation", "noopImplementationTests")
  @js.native
  def noopImplementationTests(): Unit = js.native
  @JSImport("opentracing/lib/test/noop_implementation", "noopImplementationTests")
  @js.native
  def noopImplementationTests(createTracer: js.Function0[Tracer]): Unit = js.native
}
