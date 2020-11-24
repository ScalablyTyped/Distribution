package typings.opentelemetryTracing

import typings.opentelemetryCore.mod.AlwaysOnSampler
import typings.opentelemetryCore.typesMod.LogLevel
import typings.opentelemetryTracing.anon.NumberOfAttributesPerSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  
  val DEFAULT_MAX_ATTRIBUTES_PER_SPAN: /* 32 */ Double = js.native
  
  val DEFAULT_MAX_EVENTS_PER_SPAN: /* 128 */ Double = js.native
  
  val DEFAULT_MAX_LINKS_PER_SPAN: /* 32 */ Double = js.native
  
  @js.native
  object DEFAULT_CONFIG extends js.Object {
    
    var gracefulShutdown: Boolean = js.native
    
    var logLevel: LogLevel = js.native
    
    var sampler: AlwaysOnSampler = js.native
    
    var traceParams: NumberOfAttributesPerSpan = js.native
  }
}
