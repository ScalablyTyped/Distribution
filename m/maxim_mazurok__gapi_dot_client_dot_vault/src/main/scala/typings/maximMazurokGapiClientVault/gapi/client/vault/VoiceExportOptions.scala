package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceExportOptions extends StObject {
  
  /** The file format for exported text messages. */
  var exportFormat: js.UndefOr[String] = js.undefined
}
object VoiceExportOptions {
  
  inline def apply(): VoiceExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceExportOptions]
  }
  
  extension [Self <: VoiceExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
