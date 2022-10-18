package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceReportToTelemetryMod {
  
  object default {
    
    @JSImport("next/dist/trace/report/to-telemetry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def flushAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAll")().asInstanceOf[Unit]
    
    inline def report(spanName: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(spanName.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
