package typings.opentracing

import typings.opentracing.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/test/noop_implementation", JSImport.Namespace)
@js.native
object noopImplementationMod extends js.Object {
  
  def default(): Unit = js.native
  def default(createTracer: js.Function0[Tracer]): Unit = js.native
  
  def noopImplementationTests(): Unit = js.native
  def noopImplementationTests(createTracer: js.Function0[Tracer]): Unit = js.native
}
