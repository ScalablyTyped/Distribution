package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/api/global-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/api/build/src/api/global-utils", "API_BACKWARDS_COMPATIBILITY_VERSION")
  @js.native
  val API_BACKWARDS_COMPATIBILITY_VERSION: /* 0 */ Double = js.native
  
  @JSImport("@opentelemetry/api/build/src/api/global-utils", "GLOBAL_CONTEXT_MANAGER_API_KEY")
  @js.native
  val GLOBAL_CONTEXT_MANAGER_API_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/api/build/src/api/global-utils", "GLOBAL_METRICS_API_KEY")
  @js.native
  val GLOBAL_METRICS_API_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/api/build/src/api/global-utils", "GLOBAL_PROPAGATION_API_KEY")
  @js.native
  val GLOBAL_PROPAGATION_API_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/api/build/src/api/global-utils", "GLOBAL_TRACE_API_KEY")
  @js.native
  val GLOBAL_TRACE_API_KEY: js.Symbol = js.native
  
  inline def makeGetter[T](requiredVersion: Double, instance: T, fallback: T): Get[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGetter")(requiredVersion.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Get[T]]
  
  type Get[T] = js.Function1[/* version */ Double, T]
}
