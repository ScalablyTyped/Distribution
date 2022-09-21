package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailExportOptions extends StObject {
  
  /** The file format for exported messages. */
  var exportFormat: js.UndefOr[String] = js.undefined
  
  /** To export confidential mode content, set to **true**. */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.undefined
  
  /** To use the new export system, set to **true**. */
  var useNewExport: js.UndefOr[Boolean] = js.undefined
}
object MailExportOptions {
  
  inline def apply(): MailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailExportOptions]
  }
  
  extension [Self <: MailExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
    
    inline def setShowConfidentialModeContent(value: Boolean): Self = StObject.set(x, "showConfidentialModeContent", value.asInstanceOf[js.Any])
    
    inline def setShowConfidentialModeContentUndefined: Self = StObject.set(x, "showConfidentialModeContent", js.undefined)
    
    inline def setUseNewExport(value: Boolean): Self = StObject.set(x, "useNewExport", value.asInstanceOf[js.Any])
    
    inline def setUseNewExportUndefined: Self = StObject.set(x, "useNewExport", js.undefined)
  }
}
