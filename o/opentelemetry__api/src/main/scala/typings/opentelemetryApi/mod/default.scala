package typings.opentelemetryApi.mod

import typings.opentelemetryApi.contextMod.ContextAPI
import typings.opentelemetryApi.metricsMod.MetricsAPI
import typings.opentelemetryApi.propagationMod.PropagationAPI
import typings.opentelemetryApi.traceMod.TraceAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", JSImport.Default)
@js.native
object default extends js.Object {
  
  var context: ContextAPI = js.native
  
  var metrics: MetricsAPI = js.native
  
  var propagation: PropagationAPI = js.native
  
  var trace: TraceAPI = js.native
}
