package typings.opentelemetryApi

import typings.opentelemetryApi.contextTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextContextMod {
  
  @JSImport("@opentelemetry/api/build/src/context/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/api/build/src/context/context", "ROOT_CONTEXT")
  @js.native
  val ROOT_CONTEXT: Context = js.native
  
  inline def createContextKey(description: String): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createContextKey")(description.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
}
