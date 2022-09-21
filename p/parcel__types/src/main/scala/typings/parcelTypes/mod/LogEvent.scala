package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.Diagnostic
import typings.parcelTypes.parcelTypesStrings.error
import typings.parcelTypes.parcelTypesStrings.info
import typings.parcelTypes.parcelTypesStrings.verbose
import typings.parcelTypes.parcelTypesStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.mod.ProgressLogEvent
  - typings.parcelTypes.mod.DiagnosticLogEvent
  - typings.parcelTypes.mod.TextLogEvent
*/
trait LogEvent
  extends StObject
     with ReporterEvent
object LogEvent {
  
  inline def DiagnosticLogEvent(diagnostics: js.Array[Diagnostic], level: error | warn | info | verbose): typings.parcelTypes.mod.DiagnosticLogEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.parcelTypes.mod.DiagnosticLogEvent]
  }
  
  inline def ProgressLogEvent(message: String): typings.parcelTypes.mod.ProgressLogEvent = {
    val __obj = js.Dynamic.literal(level = "progress", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.parcelTypes.mod.ProgressLogEvent]
  }
  
  inline def TextLogEvent(message: String): typings.parcelTypes.mod.TextLogEvent = {
    val __obj = js.Dynamic.literal(level = "success", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.parcelTypes.mod.TextLogEvent]
  }
}
