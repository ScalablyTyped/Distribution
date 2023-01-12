package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.Diagnostic
import typings.parcelTypes.parcelTypesStrings.error
import typings.parcelTypes.parcelTypesStrings.info
import typings.parcelTypes.parcelTypesStrings.log
import typings.parcelTypes.parcelTypesStrings.verbose
import typings.parcelTypes.parcelTypesStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticLogEvent
  extends StObject
     with LogEvent {
  
  val diagnostics: js.Array[Diagnostic]
  
  val level: error | warn | info | verbose
  
  val `type`: log
}
object DiagnosticLogEvent {
  
  inline def apply(diagnostics: js.Array[Diagnostic], level: error | warn | info | verbose): DiagnosticLogEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[DiagnosticLogEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticLogEvent] (val x: Self) extends AnyVal {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setLevel(value: error | warn | info | verbose): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
