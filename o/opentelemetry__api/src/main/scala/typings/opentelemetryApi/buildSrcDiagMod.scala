package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDiagMod {
  
  @JSImport("@opentelemetry/api/build/src/diag", "DiagConsoleLogger")
  @js.native
  open class DiagConsoleLogger ()
    extends typings.opentelemetryApi.buildSrcDiagConsoleLoggerMod.DiagConsoleLogger
  
  @JSImport("@opentelemetry/api/build/src/diag", "DiagLogLevel")
  @js.native
  object DiagLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel & Double] = js.native
    
    /* 9999 */ val ALL: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ALL & Double = js.native
    
    /* 70 */ val DEBUG: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.DEBUG & Double = js.native
    
    /* 30 */ val ERROR: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ERROR & Double = js.native
    
    /* 60 */ val INFO: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.INFO & Double = js.native
    
    /* 0 */ val NONE: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.NONE & Double = js.native
    
    /* 80 */ val VERBOSE: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.VERBOSE & Double = js.native
    
    /* 50 */ val WARN: typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.WARN & Double = js.native
  }
}
