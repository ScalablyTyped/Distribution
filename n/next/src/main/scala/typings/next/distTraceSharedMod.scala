package typings.next

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceSharedMod {
  
  @JSImport("next/dist/trace/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setGlobal(key: Any, `val`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("next/dist/trace/shared", "traceGlobals")
  @js.native
  val traceGlobals: Map[Any, Any] = js.native
  
  type SpanId = Double
}
