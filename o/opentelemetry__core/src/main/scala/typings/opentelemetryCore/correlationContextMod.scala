package typings.opentelemetryCore

import typings.opentelemetryApi.correlationContextMod.CorrelationContext
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object correlationContextMod {
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/correlation-context", "getCorrelationContext")
  @js.native
  def getCorrelationContext(context: Context): js.UndefOr[CorrelationContext] = js.native
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/correlation-context", "setCorrelationContext")
  @js.native
  def setCorrelationContext(context: Context, correlationContext: CorrelationContext): Context = js.native
}
