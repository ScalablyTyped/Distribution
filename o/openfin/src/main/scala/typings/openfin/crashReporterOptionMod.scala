package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crashReporterOptionMod {
  
  trait CrashReporterOption extends StObject {
    
    var diagnosticMode: Boolean
    
    var isRunning: js.UndefOr[Boolean] = js.undefined
  }
  object CrashReporterOption {
    
    inline def apply(diagnosticMode: Boolean): CrashReporterOption = {
      val __obj = js.Dynamic.literal(diagnosticMode = diagnosticMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrashReporterOption]
    }
    
    extension [Self <: CrashReporterOption](x: Self) {
      
      inline def setDiagnosticMode(value: Boolean): Self = StObject.set(x, "diagnosticMode", value.asInstanceOf[js.Any])
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    }
  }
}
