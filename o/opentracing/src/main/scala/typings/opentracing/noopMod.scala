package typings.opentracing

import typings.opentracing.spanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/noop", JSImport.Namespace)
@js.native
object noopMod extends js.Object {
  
  def initialize(): Unit = js.native
  
  var span: default | Null = js.native
  
  var spanContext: typings.opentracing.spanContextMod.default | Null = js.native
  
  var tracer: typings.opentracing.tracerMod.default | Null = js.native
}
