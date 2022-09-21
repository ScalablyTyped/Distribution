package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDiagMod {
  
  @JSImport("@opentelemetry/api/build/src/diag", "DiagConsoleLogger")
  @js.native
  open class DiagConsoleLogger ()
    extends typings.opentelemetryApi.consoleLoggerMod.DiagConsoleLogger
  
  @JSImport("@opentelemetry/api/build/src/diag", "DiagLogLevel")
  @js.native
  object DiagLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.diagTypesMod.DiagLogLevel & Double] = js.native
    
    /* 9999 */ val ALL: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.ALL & Double = js.native
    
    /* 70 */ val DEBUG: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.DEBUG & Double = js.native
    
    /* 30 */ val ERROR: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.ERROR & Double = js.native
    
    /* 60 */ val INFO: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.INFO & Double = js.native
    
    /* 0 */ val NONE: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.NONE & Double = js.native
    
    /* 80 */ val VERBOSE: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.VERBOSE & Double = js.native
    
    /* 50 */ val WARN: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.WARN & Double = js.native
  }
}
