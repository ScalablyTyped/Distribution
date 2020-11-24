package typings.opentelemetryCore

import typings.opentelemetryApi.correlationContextMod.CorrelationContext
import typings.opentelemetryContextBase.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/correlation-context/correlation-context", JSImport.Namespace)
@js.native
object correlationContextMod extends js.Object {
  
  def getCorrelationContext(context: Context): js.UndefOr[CorrelationContext] = js.native
  
  def setCorrelationContext(context: Context, correlationContext: CorrelationContext): Context = js.native
}
