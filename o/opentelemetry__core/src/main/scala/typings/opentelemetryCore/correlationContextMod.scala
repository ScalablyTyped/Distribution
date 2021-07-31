package typings.opentelemetryCore

import typings.opentelemetryApi.correlationContextMod.CorrelationContext
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object correlationContextMod {
  
  @JSImport("@opentelemetry/core/build/src/correlation-context/correlation-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCorrelationContext(context: Context): js.UndefOr[CorrelationContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCorrelationContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CorrelationContext]]
  
  @scala.inline
  def setCorrelationContext(context: Context, correlationContext: CorrelationContext): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setCorrelationContext")(context.asInstanceOf[js.Any], correlationContext.asInstanceOf[js.Any])).asInstanceOf[Context]
}
