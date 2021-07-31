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
    
    @scala.inline
    def apply(diagnosticMode: Boolean): CrashReporterOption = {
      val __obj = js.Dynamic.literal(diagnosticMode = diagnosticMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrashReporterOption]
    }
    
    @scala.inline
    implicit class CrashReporterOptionMutableBuilder[Self <: CrashReporterOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagnosticMode(value: Boolean): Self = StObject.set(x, "diagnosticMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    }
  }
}
