package typings.opentelemetryCore

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceSuppressTracingMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/suppress-tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTracingSuppressed(context: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTracingSuppressed")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def suppressTracing(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressTracing")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def unsuppressTracing(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("unsuppressTracing")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
}
