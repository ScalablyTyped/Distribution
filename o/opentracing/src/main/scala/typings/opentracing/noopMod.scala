package typings.opentracing

import typings.opentracing.spanMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopMod {
  
  @JSImport("opentracing/lib/noop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  
  @JSImport("opentracing/lib/noop", "span")
  @js.native
  def span: default | Null = js.native
  
  @JSImport("opentracing/lib/noop", "spanContext")
  @js.native
  def spanContext: typings.opentracing.spanContextMod.default | Null = js.native
  inline def spanContext_=(x: typings.opentracing.spanContextMod.default | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spanContext")(x.asInstanceOf[js.Any])
  
  inline def span_=(x: default | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("span")(x.asInstanceOf[js.Any])
  
  @JSImport("opentracing/lib/noop", "tracer")
  @js.native
  def tracer: typings.opentracing.tracerMod.default | Null = js.native
  inline def tracer_=(x: typings.opentracing.tracerMod.default | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tracer")(x.asInstanceOf[js.Any])
}
