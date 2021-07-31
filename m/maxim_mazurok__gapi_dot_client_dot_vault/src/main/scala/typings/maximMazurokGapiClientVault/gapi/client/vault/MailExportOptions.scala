package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailExportOptions extends StObject {
  
  /** The export file format. */
  var exportFormat: js.UndefOr[String] = js.undefined
  
  /** Set to true to export confidential mode content. */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.undefined
}
object MailExportOptions {
  
  @scala.inline
  def apply(): MailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailExportOptions]
  }
  
  @scala.inline
  implicit class MailExportOptionsMutableBuilder[Self <: MailExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
    
    @scala.inline
    def setShowConfidentialModeContent(value: Boolean): Self = StObject.set(x, "showConfidentialModeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConfidentialModeContentUndefined: Self = StObject.set(x, "showConfidentialModeContent", js.undefined)
  }
}
